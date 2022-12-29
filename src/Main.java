import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
//import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;

public class Main extends Application implements EventHandler<ActionEvent> {
    
    public static boolean isEvenClick = false;
    public static boolean isValidMove = false;
    public static Piece selectedPiece;
    public static Tile selectedTile;
    public static Move playerMove;

    public static void main(String[] args) throws Exception {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        
        try{
            
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("chessProjectBoard.fxml"));
            Parent root = (Parent) fxmlLoader.load();
            Scene scene = new Scene(root);
            primaryStage.setTitle("Chess");
            primaryStage.setScene(scene);
            primaryStage.show();
            chessProjectBoard.makeBoards();
        
        } catch(Exception e){
            e.printStackTrace();
        }
    }


    @Override
    public void handle(ActionEvent event){
        
    }


    public static void clickPosFunc(int x, int y){

        if(isEvenClick){

            playerMove.xChange = x - selectedPiece.xPos;
            playerMove.yChange = y - selectedPiece.yPos;

            if(chessProjectBoard.pieceBoard[x][y] != null){
                playerMove.isCapture = true;
            }
            else{
                playerMove.isCapture = false;
            }

            isValidMove = selectedPiece.checkMove(playerMove);

            if(isValidMove){

                chessProjectBoard.pieceBoard[x][y] = selectedPiece;
                chessProjectBoard.pieceBoard[selectedPiece.xPos][selectedPiece.yPos] = null;
                selectedPiece.xPos = x;
                selectedPiece.yPos = y;

                selectedPiece.buttoneq.setTranslateX(75 * playerMove.xChange);
                selectedPiece.buttoneq.setTranslateX(75 * playerMove.xChange);
            }
        }
        
        isEvenClick = false;
    }
}