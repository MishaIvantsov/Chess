import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;

public class Main extends Application implements EventHandler<ActionEvent> {
    public Button[][] buttonBoard = new Button[8][8];
    int[][] pieceBoard = new int[8][8];
    public int oldClickX;
    public int oldClickY;
    boolean isCaptureMove;
    boolean isValidMove;

    public static void main(String[] args) throws Exception {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        
        try{
            
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("ChessProjectBoard.fxml"));
            Parent root = (Parent) fxmlLoader.load();
            Scene scene = new Scene(root);
            
            //new chessProjectBoard(scene);
            primaryStage.setTitle("Chess");
            primaryStage.setScene(scene);
            primaryStage.show();

            
        
            String alphabet = "abcdefgh";
            for(int i = 0; i < 8; i++){
                for(int j = 0; j < 8; i++){
                    buttonBoard[i][j] = (Button) scene.lookup("#" + alphabet.charAt(i) + "" + (j+1));
                }
            }

            makeChessboard();
        
        } catch(Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public void handle(ActionEvent event){
        
        boolean isEvenClick = false;

        for(int i = 0; i < 8; i++){
            for(int j = 0; j < 8; i++){
                if(event.getSource() == buttonBoard[i][j]){
                    
                    if(isEvenClick){
                        int xChange = i - oldClickX;
                        int yChange = j - oldClickY;

                        if(pieceBoard[i][j] == 0){
                            isCaptureMove = false;
                        }
                        else{
                            isCaptureMove = true;
                        }

                        Move move = new Move(xChange, yChange, isCaptureMove);

                        switch(pieceBoard[oldClickX][oldClickY]){
                            case 1: Pawn pawn = new Pawn(oldClickX, oldClickY, true); isValidMove = pawn.checkMove(move);
                            case 2: Knight knight = new Knight(oldClickX, oldClickY, true); isValidMove = knight.checkMove(move);
                            case 3: Bishop bishop = new Bishop(oldClickX, oldClickY, true); isValidMove = bishop.checkMove(move);
                            case 4: Rook rook = new Rook(oldClickX, oldClickY, true); isValidMove = rook.checkMove(move);
                            case 5: Queen queen = new Queen(oldClickX, oldClickY, true); isValidMove = queen.checkMove(move);
                            case 6: King king = new King(oldClickX, oldClickY, true); isValidMove = king.checkMove(move);
                            case 7: Pawn pawn2 = new Pawn(oldClickX, oldClickY, false); isValidMove = pawn2.checkMove(move);
                            case 8: Knight knight2 = new Knight(oldClickX, oldClickY, false); knight2.checkMove(move);
                            case 9: Bishop bishop2 = new Bishop(oldClickX, oldClickY, false); bishop2.checkMove(move);
                            case 10: Rook rook2 = new Rook(oldClickX, oldClickY, false); rook2.checkMove(move);
                            case 11: Queen queen2 = new Queen(oldClickX, oldClickY, false); queen2.checkMove(move);
                            case 12: King king2 = new King(oldClickX, oldClickY, false); king2.checkMove(move);
                        }

                        if(isValidMove){
                            pieceBoard[i][j] = pieceBoard[oldClickX][oldClickY];
                            pieceBoard[oldClickX][oldClickY] = 0;
                        }

                        isEvenClick = false;
                    }
                    else{
                        oldClickX = i;
                        oldClickY = j;
                        isEvenClick = true;
                    }

                }
            }
        }
    }

    void makeChessboard(){
        
        //White
            // Pawn: 1
            // Knight: 2
            // Bishop: 3
            // Rook: 4
            // Queen: 5
            // King: 6
        //Black
            // Pawn: 7
            // Knight: 8
            // Bishop: 9
            // Rook: 10
            // Queen: 11
            // King: 12
        //Empty squares: 0


        //Pawns
        for(int i = 0; i < 8; i++){
            pieceBoard[i][1] = 1;
            pieceBoard[i][6] = 7;
        }

        //Knights
        pieceBoard[1][0] = 2;
        pieceBoard[6][0] = 2;
        pieceBoard[1][7] = 8;
        pieceBoard[6][7] = 8;

        //Bishops
        pieceBoard[2][0] = 3;
        pieceBoard[5][0] = 3;
        pieceBoard[2][7] = 9;
        pieceBoard[5][7] = 9;

        //Rooks
        pieceBoard[0][0] = 4;
        pieceBoard[7][0] = 4;
        pieceBoard[0][7] = 10;
        pieceBoard[7][7] = 10;

        //Queens
        pieceBoard[3][0] = 4;
        pieceBoard[3][7] = 4;

        //Kings
        pieceBoard[4][0] = 4;
        pieceBoard[4][7] = 4;

        //Make empty indexes = 0
        for(int i = 0; i < 8; i++){
            for(int j = 2; j < 6; j++){
                pieceBoard[i][j] = 0;
            }
        }
    }
}