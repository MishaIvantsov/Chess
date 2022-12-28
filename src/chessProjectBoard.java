import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

public class chessProjectBoard implements Initializable {

    public Piece[][] pieceBoard = new Piece[8][8];

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private ImageView BishopB1;
    Piece bishopB1 = new Bishop(2, 7,false, BishopB1);

    @FXML
    private ImageView BishopB2;
    Bishop bishopB2 = new Bishop(5, 7, false, BishopB2);

    @FXML
    private ImageView BishopW1;
    Bishop bishopW1 = new Bishop(2, 0, true, BishopW1);

    @FXML
    private ImageView BishopW2;
    Bishop bishopW2 = new Bishop(5, 0, true, BishopW2);

    @FXML
    private ImageView KingB;
    King kingB = new King(4, 7, false, KingB);

    @FXML
    private ImageView KingW;
    King kingW = new King(4, 0, true, KingW);

    @FXML
    private ImageView KnightB1;
    Knight knightB1 = new Knight(1, 7, false, KnightB1); 

    @FXML
    private ImageView KnightB2;
    Knight knightB2 = new Knight(6, 7, false, KnightB2);

    @FXML
    private ImageView KnightW1;
    Knight knightW1 = new Knight(1, 0, true, KnightW1);

    @FXML
    private ImageView KnightW2;
    Knight knightW2 = new Knight(6, 0, true, KnightW2);

    @FXML
    private ImageView PawnB1;
    Pawn pawnB1 = new Pawn(0, 6, false, PawnB1);

    @FXML
    private ImageView PawnB2;
    Pawn pawnB2 = new Pawn(1, 6, false, PawnB2);

    @FXML
    private ImageView PawnB3;
    Pawn pawnB3 = new Pawn(2, 6, false, PawnB3);

    @FXML
    private ImageView PawnB4;
    Pawn pawnB4 = new Pawn(3, 6, false, PawnB4);

    @FXML
    private ImageView PawnB5;
    Pawn pawnB5 = new Pawn(4, 6, false, PawnB5);

    @FXML
    private ImageView PawnB6;
    Pawn pawnB6 = new Pawn(5, 6, false, PawnB6);

    @FXML
    private ImageView PawnB7;
    Pawn pawnB7 = new Pawn(6, 6, false, PawnB7);

    @FXML
    private ImageView PawnB8;
    Pawn pawnB8 = new Pawn(7, 6, false, PawnB8);

    @FXML
    private ImageView PawnW1;
    Pawn pawnW1 = new Pawn(0, 1, true, PawnW1);

    @FXML
    private ImageView PawnW2;
    Pawn pawnW2 = new Pawn(1, 1, true, PawnW2);

    @FXML
    private ImageView PawnW3;
    Pawn pawnW3 = new Pawn(2, 1, true, PawnW3);

    @FXML
    private ImageView PawnW4;
    Pawn pawnW4 = new Pawn(3, 1, true, PawnW4);

    @FXML
    private ImageView PawnW5;
    Pawn pawnW5 = new Pawn(4, 1, true, PawnW5);

    @FXML
    private ImageView PawnW6;
    Pawn pawnW6 = new Pawn(5, 1, true, PawnW6);

    @FXML
    private ImageView PawnW7;
    Pawn pawnW7 = new Pawn(6, 1, true, PawnW7);

    @FXML
    private ImageView PawnW8;
    Pawn pawnW8 = new Pawn(7, 1, true, PawnW8);

    @FXML
    private ImageView QueenB;
    Queen queenB = new Queen(3, 7, false, QueenB);

    @FXML
    private ImageView QueenW;
    Queen queenW = new Queen(3, 0, true, QueenW);

    @FXML
    private ImageView RookB1;
    Rook rookB1 = new Rook(0, 7, false, RookB1);

    @FXML
    private ImageView RookB2;
    Rook rookB2 = new Rook(7, 7, false, RookB2);

    @FXML
    private ImageView RookW1;
    Rook rookW1 = new Rook(0, 0, true, RookW1);

    @FXML
    private ImageView RookW2;
    Rook rookW2 = new Rook(7, 0, true, RookW2);

    @FXML
    private Button a1;
    Tile A1 = new Tile(0, 0, a1);

    @FXML
    private Button a2;
    Tile A2 = new Tile(0, 1, a2);

    @FXML
    private Button a3;
    Tile A3 = new Tile(0, 2, a3);

    @FXML
    private Button a4;
    Tile A4 = new Tile(0, 3, a4);

    @FXML
    private Button a5;
    Tile A5 = new Tile(0, 4, a5);

    @FXML
    private Button a6;
    Tile A6 = new Tile(0, 5, a6);

    @FXML
    private Button a7;
    Tile A7 = new Tile(0, 6, a7);

    @FXML
    private Button a8;
    Tile A8 = new Tile(0, 7, a8);

    @FXML
    private Button b1;
    Tile B1 = new Tile(1, 0, b1);

    @FXML
    private Button b2;
    Tile B2 = new Tile(1, 1, b2);

    @FXML
    private Button b3;
    Tile B3 = new Tile(1, 2, b3);

    @FXML
    private Button b4;
    Tile B4 = new Tile(1, 3, b4);

    @FXML
    private Button b5;
    Tile B5 = new Tile(1, 4, b5);

    @FXML
    private Button b6;
    Tile B6 = new Tile(1, 5, b6);

    @FXML
    private Button b7;
    Tile B7 = new Tile(1, 6, b7);

    @FXML
    private Button b8;
    Tile B8 = new Tile(1, 7, b8);

    @FXML
    private Button c1;
    Tile C1 = new Tile(2, 0, c1);

    @FXML
    private Button c2;
    Tile C2 = new Tile(2, 1, c2);

    @FXML
    private Button c3;
    Tile C3 = new Tile(2, 2, c3);

    @FXML
    private Button c4;
    Tile C4 = new Tile(2, 3, c4);

    @FXML
    private Button c5;
    Tile C5 = new Tile(2, 4, c5);

    @FXML
    private Button c6;
    Tile C6 = new Tile(2, 5, c6);

    @FXML
    private Button c7;
    Tile C7 = new Tile(2, 6, c7);

    @FXML
    private Button c8;
    Tile C8 = new Tile(2, 7, c8);

    @FXML
    private Button d1;
    Tile D1 = new Tile(3, 0, d1);

    @FXML
    private Button d2;
    Tile D2 = new Tile(3, 1, d2);

    @FXML
    private Button d3;
    Tile D3 = new Tile(3, 2, d3);

    @FXML
    private Button d4;
    Tile D4 = new Tile(3, 3, d4);

    @FXML
    private Button d5;
    Tile D5 = new Tile(3, 4, d5);

    @FXML
    private Button d6;
    Tile D6 = new Tile(3, 5, d6);

    @FXML
    private Button d7;
    Tile D7 = new Tile(3, 6, d7);

    @FXML
    private Button d8;
    Tile D8 = new Tile(3, 7, d8);

    @FXML
    private Button e1;
    Tile E1 = new Tile(4, 0, e1);

    @FXML
    private Button e2;
    Tile E2 = new Tile(4, 1, e2);

    @FXML
    private Button e3;
    Tile E3 = new Tile(4, 2, e3);

    @FXML
    private Button e4;
    Tile E4 = new Tile(4, 3, e4);

    @FXML
    private Button e5;
    Tile E5 = new Tile(4, 4, e5);

    @FXML
    private Button e6;
    Tile E6 = new Tile(4, 5, e6);

    @FXML
    private Button e7;
    Tile E7 = new Tile(4, 6, e7);

    @FXML
    private Button e8;
    Tile E8 = new Tile(4, 7, e8);

    @FXML
    private Button f1;
    Tile F1 = new Tile(5, 0, f1);

    @FXML
    private Button f2;
    Tile F2 = new Tile(5, 1, f2);

    @FXML
    private Button f3;
    Tile F3 = new Tile(5, 2, f3);

    @FXML
    private Button f4;
    Tile F4 = new Tile(5, 3, f4);

    @FXML
    private Button f5;
    Tile F5 = new Tile(5, 4, f5);

    @FXML
    private Button f6;
    Tile F6 = new Tile(5, 5, f6);

    @FXML
    private Button f7;
    Tile F7 = new Tile(5, 6, f7);

    @FXML
    private Button f8;
    Tile F8 = new Tile(5, 7, f8);

    @FXML
    private Button g1;
    Tile G1 = new Tile(6, 0, g1);

    @FXML
    private Button g2;
    Tile G2 = new Tile(6, 1, g2);

    @FXML
    private Button g3;
    Tile G3 = new Tile(6, 2, g3);

    @FXML
    private Button g4;
    Tile G4 = new Tile(6, 3, g4);

    @FXML
    private Button g5;
    Tile G5 = new Tile(6, 4, g5);

    @FXML
    private Button g6;
    Tile G6 = new Tile(6, 5, g6);

    @FXML
    private Button g7;
    Tile G7 = new Tile(6, 6, g7);

    @FXML
    private Button g8;
    Tile G8 = new Tile(6, 7, g8);

    @FXML
    private Button h1;
    Tile H1 = new Tile(7, 0, h1);

    @FXML
    private Button h2;
    Tile H2 = new Tile(7, 1, h2);

    @FXML
    private Button h3;
    Tile H3 = new Tile(7, 2, h3);

    @FXML
    private Button h4;
    Tile H4 = new Tile(7, 3, h4);

    @FXML
    private Button h5;
    Tile H5 = new Tile(7, 4, h5);

    @FXML
    private Button h6;
    Tile H6 = new Tile(7, 5, h6);

    @FXML
    private Button h7;
    Tile H7 = new Tile(7, 6, h7);

    @FXML
    private Button h8;
    Tile H8 = new Tile(7, 7, h8);

    @FXML
    void clickedA1(MouseEvent event) {

    }

    @FXML
    void clickedA2(MouseEvent event) {

    }

    @FXML
    void clickedA3(MouseEvent event) {

    }

    @FXML
    void clickedA4(MouseEvent event) {

    }

    @FXML
    void clickedA5(MouseEvent event) {

    }

    @FXML
    void clickedA6(MouseEvent event) {

    }

    @FXML
    void clickedA7(MouseEvent event) {

    }

    @FXML
    void clickedA8(MouseEvent event) {

    }

    @FXML
    void clickedB1(MouseEvent event) {

    }

    @FXML
    void clickedB2(MouseEvent event) {

    }

    @FXML
    void clickedB3(MouseEvent event) {

    }

    @FXML
    void clickedB4(MouseEvent event) {

    }

    @FXML
    void clickedB5(MouseEvent event) {

    }

    @FXML
    void clickedB6(MouseEvent event) {

    }

    @FXML
    void clickedB7(MouseEvent event) {

    }

    @FXML
    void clickedB8(MouseEvent event) {

    }

    @FXML
    void clickedBishopB1(MouseEvent event) {

    }

    @FXML
    void clickedBishopB2(MouseEvent event) {

    }

    @FXML
    void clickedBishopW1(MouseEvent event) {

    }

    @FXML
    void clickedBishopW2(MouseEvent event) {

    }

    @FXML
    void clickedC1(MouseEvent event) {

    }

    @FXML
    void clickedC2(MouseEvent event) {

    }

    @FXML
    void clickedC3(MouseEvent event) {

    }

    @FXML
    void clickedC4(MouseEvent event) {

    }

    @FXML
    void clickedC5(MouseEvent event) {

    }

    @FXML
    void clickedC6(MouseEvent event) {

    }

    @FXML
    void clickedC7(MouseEvent event) {

    }

    @FXML
    void clickedC8(MouseEvent event) {

    }

    @FXML
    void clickedD1(MouseEvent event) {

    }

    @FXML
    void clickedD2(MouseEvent event) {

    }

    @FXML
    void clickedD3(MouseEvent event) {

    }

    @FXML
    void clickedD4(MouseEvent event) {

    }

    @FXML
    void clickedD5(MouseEvent event) {

    }

    @FXML
    void clickedD6(MouseEvent event) {

    }

    @FXML
    void clickedD7(MouseEvent event) {

    }

    @FXML
    void clickedD8(MouseEvent event) {

    }

    @FXML
    void clickedE1(MouseEvent event) {

    }

    @FXML
    void clickedE2(MouseEvent event) {

    }

    @FXML
    void clickedE3(MouseEvent event) {

    }

    @FXML
    void clickedE4(MouseEvent event) {

    }

    @FXML
    void clickedE5(MouseEvent event) {

    }

    @FXML
    void clickedE6(MouseEvent event) {

    }

    @FXML
    void clickedE7(MouseEvent event) {

    }

    @FXML
    void clickedE8(MouseEvent event) {

    }

    @FXML
    void clickedF1(MouseEvent event) {

    }

    @FXML
    void clickedF2(MouseEvent event) {

    }

    @FXML
    void clickedF3(MouseEvent event) {

    }

    @FXML
    void clickedF4(MouseEvent event) {

    }

    @FXML
    void clickedF5(MouseEvent event) {

    }

    @FXML
    void clickedF6(MouseEvent event) {

    }

    @FXML
    void clickedF7(MouseEvent event) {

    }

    @FXML
    void clickedF8(MouseEvent event) {

    }

    @FXML
    void clickedG1(MouseEvent event) {

    }

    @FXML
    void clickedG2(MouseEvent event) {

    }

    @FXML
    void clickedG3(MouseEvent event) {

    }

    @FXML
    void clickedG4(MouseEvent event) {

    }

    @FXML
    void clickedG5(MouseEvent event) {

    }

    @FXML
    void clickedG6(MouseEvent event) {

    }

    @FXML
    void clickedG7(MouseEvent event) {

    }

    @FXML
    void clickedG8(MouseEvent event) {

    }

    @FXML
    void clickedH1(MouseEvent event) {

    }

    @FXML
    void clickedH2(MouseEvent event) {

    }

    @FXML
    void clickedH3(MouseEvent event) {

    }

    @FXML
    void clickedH4(MouseEvent event) {

    }

    @FXML
    void clickedH5(MouseEvent event) {

    }

    @FXML
    void clickedH6(MouseEvent event) {

    }

    @FXML
    void clickedH7(MouseEvent event) {

    }

    @FXML
    void clickedH8(MouseEvent event) {

    }

    @FXML
    void clickedKingB(MouseEvent event) {

    }

    @FXML
    void clickedKingW(MouseEvent event) {

    }

    @FXML
    void clickedKnightB1(MouseEvent event) {

    }

    @FXML
    void clickedKnightW1(MouseEvent event) {

    }

    @FXML
    void clickedKnightW2(MouseEvent event) {

    }

    @FXML
    void clickedPawnB1(MouseEvent event) {

    }

    @FXML
    void clickedPawnB2(MouseEvent event) {

    }

    @FXML
    void clickedPawnB3(MouseEvent event) {

    }

    @FXML
    void clickedPawnB4(MouseEvent event) {

    }

    @FXML
    void clickedPawnB5(MouseEvent event) {

    }

    @FXML
    void clickedPawnB6(MouseEvent event) {

    }

    @FXML
    void clickedPawnB7(MouseEvent event) {

    }

    @FXML
    void clickedPawnB8(MouseEvent event) {

    }

    @FXML
    void clickedPawnW1(MouseEvent event) {

    }

    @FXML
    void clickedPawnW2(MouseEvent event) {

    }

    @FXML
    void clickedPawnW3(MouseEvent event) {

    }

    @FXML
    void clickedPawnW4(MouseEvent event) {

    }

    @FXML
    void clickedPawnW5(MouseEvent event) {

    }

    @FXML
    void clickedPawnW6(MouseEvent event) {

    }

    @FXML
    void clickedPawnW7(MouseEvent event) {

    }

    @FXML
    void clickedPawnW8(MouseEvent event) {

    }

    @FXML
    void clickedQueenB(MouseEvent event) {

    }

    @FXML
    void clickedQueenW(MouseEvent event) {

    }

    @FXML
    void clickedRookB1(MouseEvent event) {

    }

    @FXML
    void clickedRookB2(MouseEvent event) {

    }

    @FXML
    void clickedRookW1(MouseEvent event) {

    }

    @FXML
    void clickedRookW2(MouseEvent event) {

    }

    void makeBoards(){
        
        //white piece row
        pieceBoard[0][0] = rookW1;
        pieceBoard[1][0] = knightW1;
        pieceBoard[2][0] = bishopW1;
        pieceBoard[3][0] = queenW;
        pieceBoard[4][0] = kingW;
        pieceBoard[5][0] = bishopW2;
        pieceBoard[6][0] = knightW2;
        pieceBoard[7][0] = rookW2;

        //white pawn row
        pieceBoard[0][1] = pawnW1;
        pieceBoard[1][1] = pawnW2;
        pieceBoard[2][1] = pawnW3;
        pieceBoard[3][1] = pawnW4;
        pieceBoard[4][1] = pawnW5;
        pieceBoard[5][1] = pawnW6;
        pieceBoard[6][1] = pawnW7;
        pieceBoard[7][1] = pawnW8;
    }

    @FXML
    public void initialize(URL url, ResourceBundle rb) {
        assert BishopB1 != null : "fx:id=\"BishopB1\" was not injected: check your FXML file 'chessProjectBoard.fxml'.";
        assert BishopB2 != null : "fx:id=\"BishopB2\" was not injected: check your FXML file 'chessProjectBoard.fxml'.";
        assert BishopW1 != null : "fx:id=\"BishopW1\" was not injected: check your FXML file 'chessProjectBoard.fxml'.";
        assert BishopW2 != null : "fx:id=\"BishopW2\" was not injected: check your FXML file 'chessProjectBoard.fxml'.";
        assert KingB != null : "fx:id=\"KingB\" was not injected: check your FXML file 'chessProjectBoard.fxml'.";
        assert KingW != null : "fx:id=\"KingW\" was not injected: check your FXML file 'chessProjectBoard.fxml'.";
        assert KnightB1 != null : "fx:id=\"KnightB1\" was not injected: check your FXML file 'chessProjectBoard.fxml'.";
        assert KnightB2 != null : "fx:id=\"KnightB2\" was not injected: check your FXML file 'chessProjectBoard.fxml'.";
        assert KnightW1 != null : "fx:id=\"KnightW1\" was not injected: check your FXML file 'chessProjectBoard.fxml'.";
        assert KnightW2 != null : "fx:id=\"KnightW2\" was not injected: check your FXML file 'chessProjectBoard.fxml'.";
        assert PawnB1 != null : "fx:id=\"PawnB1\" was not injected: check your FXML file 'chessProjectBoard.fxml'.";
        assert PawnB2 != null : "fx:id=\"PawnB2\" was not injected: check your FXML file 'chessProjectBoard.fxml'.";
        assert PawnB3 != null : "fx:id=\"PawnB3\" was not injected: check your FXML file 'chessProjectBoard.fxml'.";
        assert PawnB4 != null : "fx:id=\"PawnB4\" was not injected: check your FXML file 'chessProjectBoard.fxml'.";
        assert PawnB5 != null : "fx:id=\"PawnB5\" was not injected: check your FXML file 'chessProjectBoard.fxml'.";
        assert PawnB6 != null : "fx:id=\"PawnB6\" was not injected: check your FXML file 'chessProjectBoard.fxml'.";
        assert PawnB7 != null : "fx:id=\"PawnB7\" was not injected: check your FXML file 'chessProjectBoard.fxml'.";
        assert PawnB8 != null : "fx:id=\"PawnB8\" was not injected: check your FXML file 'chessProjectBoard.fxml'.";
        assert PawnW1 != null : "fx:id=\"PawnW1\" was not injected: check your FXML file 'chessProjectBoard.fxml'.";
        assert PawnW2 != null : "fx:id=\"PawnW2\" was not injected: check your FXML file 'chessProjectBoard.fxml'.";
        assert PawnW3 != null : "fx:id=\"PawnW3\" was not injected: check your FXML file 'chessProjectBoard.fxml'.";
        assert PawnW4 != null : "fx:id=\"PawnW4\" was not injected: check your FXML file 'chessProjectBoard.fxml'.";
        assert PawnW5 != null : "fx:id=\"PawnW5\" was not injected: check your FXML file 'chessProjectBoard.fxml'.";
        assert PawnW6 != null : "fx:id=\"PawnW6\" was not injected: check your FXML file 'chessProjectBoard.fxml'.";
        assert PawnW7 != null : "fx:id=\"PawnW7\" was not injected: check your FXML file 'chessProjectBoard.fxml'.";
        assert PawnW8 != null : "fx:id=\"PawnW8\" was not injected: check your FXML file 'chessProjectBoard.fxml'.";
        assert QueenB != null : "fx:id=\"QueenB\" was not injected: check your FXML file 'chessProjectBoard.fxml'.";
        assert QueenW != null : "fx:id=\"QueenW\" was not injected: check your FXML file 'chessProjectBoard.fxml'.";
        assert RookB1 != null : "fx:id=\"RookB1\" was not injected: check your FXML file 'chessProjectBoard.fxml'.";
        assert RookB2 != null : "fx:id=\"RookB2\" was not injected: check your FXML file 'chessProjectBoard.fxml'.";
        assert RookW1 != null : "fx:id=\"RookW1\" was not injected: check your FXML file 'chessProjectBoard.fxml'.";
        assert RookW2 != null : "fx:id=\"RookW2\" was not injected: check your FXML file 'chessProjectBoard.fxml'.";
        assert a1 != null : "fx:id=\"a1\" was not injected: check your FXML file 'chessProjectBoard.fxml'.";
        assert a2 != null : "fx:id=\"a2\" was not injected: check your FXML file 'chessProjectBoard.fxml'.";
        assert a3 != null : "fx:id=\"a3\" was not injected: check your FXML file 'chessProjectBoard.fxml'.";
        assert a4 != null : "fx:id=\"a4\" was not injected: check your FXML file 'chessProjectBoard.fxml'.";
        assert a5 != null : "fx:id=\"a5\" was not injected: check your FXML file 'chessProjectBoard.fxml'.";
        assert a6 != null : "fx:id=\"a6\" was not injected: check your FXML file 'chessProjectBoard.fxml'.";
        assert a7 != null : "fx:id=\"a7\" was not injected: check your FXML file 'chessProjectBoard.fxml'.";
        assert a8 != null : "fx:id=\"a8\" was not injected: check your FXML file 'chessProjectBoard.fxml'.";
        assert b1 != null : "fx:id=\"b1\" was not injected: check your FXML file 'chessProjectBoard.fxml'.";
        assert b2 != null : "fx:id=\"b2\" was not injected: check your FXML file 'chessProjectBoard.fxml'.";
        assert b3 != null : "fx:id=\"b3\" was not injected: check your FXML file 'chessProjectBoard.fxml'.";
        assert b4 != null : "fx:id=\"b4\" was not injected: check your FXML file 'chessProjectBoard.fxml'.";
        assert b5 != null : "fx:id=\"b5\" was not injected: check your FXML file 'chessProjectBoard.fxml'.";
        assert b6 != null : "fx:id=\"b6\" was not injected: check your FXML file 'chessProjectBoard.fxml'.";
        assert b7 != null : "fx:id=\"b7\" was not injected: check your FXML file 'chessProjectBoard.fxml'.";
        assert b8 != null : "fx:id=\"b8\" was not injected: check your FXML file 'chessProjectBoard.fxml'.";
        assert c1 != null : "fx:id=\"c1\" was not injected: check your FXML file 'chessProjectBoard.fxml'.";
        assert c2 != null : "fx:id=\"c2\" was not injected: check your FXML file 'chessProjectBoard.fxml'.";
        assert c3 != null : "fx:id=\"c3\" was not injected: check your FXML file 'chessProjectBoard.fxml'.";
        assert c4 != null : "fx:id=\"c4\" was not injected: check your FXML file 'chessProjectBoard.fxml'.";
        assert c5 != null : "fx:id=\"c5\" was not injected: check your FXML file 'chessProjectBoard.fxml'.";
        assert c6 != null : "fx:id=\"c6\" was not injected: check your FXML file 'chessProjectBoard.fxml'.";
        assert c7 != null : "fx:id=\"c7\" was not injected: check your FXML file 'chessProjectBoard.fxml'.";
        assert c8 != null : "fx:id=\"c8\" was not injected: check your FXML file 'chessProjectBoard.fxml'.";
        assert d1 != null : "fx:id=\"d1\" was not injected: check your FXML file 'chessProjectBoard.fxml'.";
        assert d2 != null : "fx:id=\"d2\" was not injected: check your FXML file 'chessProjectBoard.fxml'.";
        assert d3 != null : "fx:id=\"d3\" was not injected: check your FXML file 'chessProjectBoard.fxml'.";
        assert d4 != null : "fx:id=\"d4\" was not injected: check your FXML file 'chessProjectBoard.fxml'.";
        assert d5 != null : "fx:id=\"d5\" was not injected: check your FXML file 'chessProjectBoard.fxml'.";
        assert d6 != null : "fx:id=\"d6\" was not injected: check your FXML file 'chessProjectBoard.fxml'.";
        assert d7 != null : "fx:id=\"d7\" was not injected: check your FXML file 'chessProjectBoard.fxml'.";
        assert d8 != null : "fx:id=\"d8\" was not injected: check your FXML file 'chessProjectBoard.fxml'.";
        assert e1 != null : "fx:id=\"e1\" was not injected: check your FXML file 'chessProjectBoard.fxml'.";
        assert e2 != null : "fx:id=\"e2\" was not injected: check your FXML file 'chessProjectBoard.fxml'.";
        assert e3 != null : "fx:id=\"e3\" was not injected: check your FXML file 'chessProjectBoard.fxml'.";
        assert e4 != null : "fx:id=\"e4\" was not injected: check your FXML file 'chessProjectBoard.fxml'.";
        assert e5 != null : "fx:id=\"e5\" was not injected: check your FXML file 'chessProjectBoard.fxml'.";
        assert e6 != null : "fx:id=\"e6\" was not injected: check your FXML file 'chessProjectBoard.fxml'.";
        assert e7 != null : "fx:id=\"e7\" was not injected: check your FXML file 'chessProjectBoard.fxml'.";
        assert e8 != null : "fx:id=\"e8\" was not injected: check your FXML file 'chessProjectBoard.fxml'.";
        assert f1 != null : "fx:id=\"f1\" was not injected: check your FXML file 'chessProjectBoard.fxml'.";
        assert f2 != null : "fx:id=\"f2\" was not injected: check your FXML file 'chessProjectBoard.fxml'.";
        assert f3 != null : "fx:id=\"f3\" was not injected: check your FXML file 'chessProjectBoard.fxml'.";
        assert f4 != null : "fx:id=\"f4\" was not injected: check your FXML file 'chessProjectBoard.fxml'.";
        assert f5 != null : "fx:id=\"f5\" was not injected: check your FXML file 'chessProjectBoard.fxml'.";
        assert f6 != null : "fx:id=\"f6\" was not injected: check your FXML file 'chessProjectBoard.fxml'.";
        assert f7 != null : "fx:id=\"f7\" was not injected: check your FXML file 'chessProjectBoard.fxml'.";
        assert f8 != null : "fx:id=\"f8\" was not injected: check your FXML file 'chessProjectBoard.fxml'.";
        assert g1 != null : "fx:id=\"g1\" was not injected: check your FXML file 'chessProjectBoard.fxml'.";
        assert g2 != null : "fx:id=\"g2\" was not injected: check your FXML file 'chessProjectBoard.fxml'.";
        assert g3 != null : "fx:id=\"g3\" was not injected: check your FXML file 'chessProjectBoard.fxml'.";
        assert g4 != null : "fx:id=\"g4\" was not injected: check your FXML file 'chessProjectBoard.fxml'.";
        assert g5 != null : "fx:id=\"g5\" was not injected: check your FXML file 'chessProjectBoard.fxml'.";
        assert g6 != null : "fx:id=\"g6\" was not injected: check your FXML file 'chessProjectBoard.fxml'.";
        assert g7 != null : "fx:id=\"g7\" was not injected: check your FXML file 'chessProjectBoard.fxml'.";
        assert g8 != null : "fx:id=\"g8\" was not injected: check your FXML file 'chessProjectBoard.fxml'.";
        assert h1 != null : "fx:id=\"h1\" was not injected: check your FXML file 'chessProjectBoard.fxml'.";
        assert h2 != null : "fx:id=\"h2\" was not injected: check your FXML file 'chessProjectBoard.fxml'.";
        assert h3 != null : "fx:id=\"h3\" was not injected: check your FXML file 'chessProjectBoard.fxml'.";
        assert h4 != null : "fx:id=\"h4\" was not injected: check your FXML file 'chessProjectBoard.fxml'.";
        assert h5 != null : "fx:id=\"h5\" was not injected: check your FXML file 'chessProjectBoard.fxml'.";
        assert h6 != null : "fx:id=\"h6\" was not injected: check your FXML file 'chessProjectBoard.fxml'.";
        assert h7 != null : "fx:id=\"h7\" was not injected: check your FXML file 'chessProjectBoard.fxml'.";
        assert h8 != null : "fx:id=\"h8\" was not injected: check your FXML file 'chessProjectBoard.fxml'.";

    }

}