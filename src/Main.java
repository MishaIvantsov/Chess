import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;

public class Main extends Application implements EventHandler<ActionEvent> {

    static ImageView imageV = new ImageView();
    static Button button = new Button();
    public static boolean isEvenClick = false;
    public static boolean isValidMove = false;
    public static Piece selectedPiece = new Piece(-1, -1, false, imageV );
    public static Tile selectedTile = new Tile(0, 0, button);
    public static Move playerMove = new Move(0, 0, false);
    public static boolean isWhiteTurn = true;

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


    public static void clickPosFunc(Tile tile){

        if(isEvenClick){

            playerMove.xChange = tile.xPos - selectedPiece.xPos;
            playerMove.yChange = tile.yPos - selectedPiece.yPos;

            if(chessProjectBoard.pieceBoard[tile.xPos][tile.yPos] != null){
                playerMove.isCapture = true;
            }
            else{
                playerMove.isCapture = false;
            }

            isValidMove = selectedPiece.checkMove(playerMove);

            if(isValidMove){

                if(playerMove.isCapture){
        
                    chessProjectBoard.pieceBoard[tile.xPos][tile.yPos].buttoneq.setVisible(false);
                    chessProjectBoard.pieceBoard[tile.xPos][tile.yPos].buttoneq.setManaged(false);
                }

                chessProjectBoard.pieceBoard[tile.xPos][tile.yPos] = selectedPiece;
                chessProjectBoard.pieceBoard[selectedPiece.xPos][selectedPiece.yPos] = null;
                selectedPiece.xPos = tile.xPos;
                selectedPiece.yPos = tile.yPos;

                selectedPiece.buttoneq.setTranslateX(75 * playerMove.xChange);
                selectedPiece.buttoneq.setTranslateY(75 * playerMove.yChange);

                isWhiteTurn = ! isWhiteTurn;
            }
        }
        
        isEvenClick = false;
    }

    public static void clickPiece(Piece piece){

        if(isWhiteTurn == piece.isWhite && isEvenClick == false){
            selectedPiece = piece;
            isEvenClick = true;
        }
        else if(isEvenClick = true && isWhiteTurn != piece.isWhite){
            clickPosFunc(chessProjectBoard.tileBoard[piece.xPos][piece.yPos]);
        }
    }
}