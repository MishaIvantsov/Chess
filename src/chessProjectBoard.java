import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

public class chessProjectBoard implements Initializable {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private static ImageView BishopB1 = new ImageView();
    static Piece bishopB1 = new Bishop(2, 7,false, BishopB1);

    @FXML
    private static ImageView BishopB2 = new ImageView();
    static Bishop bishopB2 = new Bishop(5, 7, false, BishopB2);

    @FXML
    private static ImageView BishopW1 = new ImageView();
    static Bishop bishopW1 = new Bishop(2, 0, true, BishopW1);

    @FXML
    private static ImageView BishopW2 = new ImageView();
    static Bishop bishopW2 = new Bishop(5, 0, true, BishopW2);

    @FXML
    private static ImageView KingB = new ImageView();
    static King kingB = new King(4, 7, false, KingB);

    @FXML
    private static ImageView KingW = new ImageView();
    static King kingW = new King(4, 0, true, KingW);

    @FXML
    private static ImageView KnightB1 = new ImageView();
    static Knight knightB1 = new Knight(1, 7, false, KnightB1); 

    @FXML
    private static ImageView KnightB2 = new ImageView();
    static Knight knightB2 = new Knight(6, 7, false, KnightB2);

    @FXML
    private static ImageView KnightW1 = new ImageView();
    static Knight knightW1 = new Knight(1, 0, true, KnightW1);

    @FXML
    private static ImageView KnightW2 = new ImageView();
    static Knight knightW2 = new Knight(6, 0, true, KnightW2);

    @FXML
    private static ImageView PawnB1 = new ImageView();
    static Pawn pawnB1 = new Pawn(0, 6, false, PawnB1);

    @FXML
    private static ImageView PawnB2 = new ImageView();
    static Pawn pawnB2 = new Pawn(1, 6, false, PawnB2);

    @FXML
    private static ImageView PawnB3 = new ImageView();
    static Pawn pawnB3 = new Pawn(2, 6, false, PawnB3);

    @FXML
    private static ImageView PawnB4 = new ImageView();
    static Pawn pawnB4 = new Pawn(3, 6, false, PawnB4);

    @FXML
    private static ImageView PawnB5 = new ImageView();
    static Pawn pawnB5 = new Pawn(4, 6, false, PawnB5);

    @FXML
    private static ImageView PawnB6 = new ImageView();
    static Pawn pawnB6 = new Pawn(5, 6, false, PawnB6);

    @FXML
    private static ImageView PawnB7 = new ImageView();
    static Pawn pawnB7 = new Pawn(6, 6, false, PawnB7);

    @FXML
    private static ImageView PawnB8 = new ImageView();
    static Pawn pawnB8 = new Pawn(7, 6, false, PawnB8);

    @FXML
    private static ImageView PawnW1 = new ImageView();
    static Pawn pawnW1 = new Pawn(0, 1, true, PawnW1);

    @FXML
    private static ImageView PawnW2 = new ImageView();
    static Pawn pawnW2 = new Pawn(1, 1, true, PawnW2);

    @FXML
    private static ImageView PawnW3 = new ImageView();
    static Pawn pawnW3 = new Pawn(2, 1, true, PawnW3);

    @FXML
    private static ImageView PawnW4 = new ImageView();
    static Pawn pawnW4 = new Pawn(3, 1, true, PawnW4);

    @FXML
    private static ImageView PawnW5 = new ImageView();
    static Pawn pawnW5 = new Pawn(4, 1, true, PawnW5);

    @FXML
    private static ImageView PawnW6 = new ImageView();
    static Pawn pawnW6 = new Pawn(5, 1, true, PawnW6);

    @FXML
    private static ImageView PawnW7 = new ImageView();
    static Pawn pawnW7 = new Pawn(6, 1, true, PawnW7);

    @FXML
    private static ImageView PawnW8 = new ImageView();
    static Pawn pawnW8 = new Pawn(7, 1, true, PawnW8);

    @FXML
    private static ImageView QueenB = new ImageView();
    static Queen queenB = new Queen(3, 7, false, QueenB);

    @FXML
    static private ImageView QueenW = new ImageView();
    static Queen queenW = new Queen(3, 0, true, QueenW);

    @FXML
    private static ImageView RookB1 = new ImageView();
    static Rook rookB1 = new Rook(0, 7, false, RookB1);

    @FXML
    private static ImageView RookB2 = new ImageView();
    static Rook rookB2 = new Rook(7, 7, false, RookB2);

    @FXML
    private static ImageView RookW1 = new ImageView();
    static Rook rookW1 = new Rook(0, 0, true, RookW1);

    @FXML
    private static ImageView RookW2 = new ImageView();
    static Rook rookW2 = new Rook(7, 0, true, RookW2);

    @FXML
    private static Button a1 = new Button();
    static Tile A1 = new Tile(0, 0, a1);

    @FXML
    private static Button a2 = new Button();
    static Tile A2 = new Tile(0, 1, a2);

    @FXML
    private static Button a3 = new Button();
    static Tile A3 = new Tile(0, 2, a3);

    @FXML
    private static Button a4 = new Button();
    static Tile A4 = new Tile(0, 3, a4);

    @FXML
    private static Button a5 = new Button();
    static Tile A5 = new Tile(0, 4, a5);

    @FXML
    private static Button a6 = new Button();
    static Tile A6 = new Tile(0, 5, a6);

    @FXML
    private static Button a7 = new Button();
    static Tile A7 = new Tile(0, 6, a7);

    @FXML
    private static Button a8 = new Button();
    static Tile A8 = new Tile(0, 7, a8);

    @FXML
    private static Button b1 = new Button();
    static Tile B1 = new Tile(1, 0, b1);

    @FXML
    private static Button b2 = new Button();
    static Tile B2 = new Tile(1, 1, b2);

    @FXML
    private static Button b3 = new Button();
    static Tile B3 = new Tile(1, 2, b3);

    @FXML
    private static Button b4 = new Button();
    static Tile B4 = new Tile(1, 3, b4);

    @FXML
    private static Button b5 = new Button();
    static Tile B5 = new Tile(1, 4, b5);

    @FXML
    private static Button b6 = new Button();
    static Tile B6 = new Tile(1, 5, b6);

    @FXML
    private static Button b7 = new Button();
    static Tile B7 = new Tile(1, 6, b7);

    @FXML
    private static Button b8 = new Button();
    static Tile B8 = new Tile(1, 7, b8);

    @FXML
    private static Button c1 = new Button();
    static Tile C1 = new Tile(2, 0, c1);

    @FXML
    private static Button c2 = new Button();
    static Tile C2 = new Tile(2, 1, c2);

    @FXML
    private static Button c3 = new Button();
    static Tile C3 = new Tile(2, 2, c3);

    @FXML
    private static Button c4 = new Button();
    static Tile C4 = new Tile(2, 3, c4);

    @FXML
    private static Button c5 = new Button();
    static Tile C5 = new Tile(2, 4, c5);

    @FXML
    private static Button c6 = new Button();
    static Tile C6 = new Tile(2, 5, c6);

    @FXML
    private static Button c7 = new Button();
    static Tile C7 = new Tile(2, 6, c7);

    @FXML
    private static Button c8 = new Button();
    static Tile C8 = new Tile(2, 7, c8);

    @FXML
    private static Button d1 = new Button();
    static Tile D1 = new Tile(3, 0, d1);

    @FXML
    private static Button d2 = new Button();
    static Tile D2 = new Tile(3, 1, d2);

    @FXML
    private static Button d3 = new Button();
    static Tile D3 = new Tile(3, 2, d3);

    @FXML
    private static Button d4 = new Button();
    static Tile D4 = new Tile(3, 3, d4);

    @FXML
    private static Button d5 = new Button();
    static Tile D5 = new Tile(3, 4, d5);

    @FXML
    private static Button d6 = new Button();
    static Tile D6 = new Tile(3, 5, d6);

    @FXML
    private static Button d7 = new Button();
    static Tile D7 = new Tile(3, 6, d7);

    @FXML
    private static Button d8 = new Button();
    static Tile D8 = new Tile(3, 7, d8);

    @FXML
    private static Button e1 = new Button();
    static Tile E1 = new Tile(4, 0, e1);

    @FXML
    private static Button e2 = new Button();
    static Tile E2 = new Tile(4, 1, e2);

    @FXML
    private static Button e3 = new Button();
    static Tile E3 = new Tile(4, 2, e3);

    @FXML
    private static Button e4 = new Button();
    static Tile E4 = new Tile(4, 3, e4);

    @FXML
    private static Button e5 = new Button();
    static Tile E5 = new Tile(4, 4, e5);

    @FXML
    private static Button e6 = new Button();
    static Tile E6 = new Tile(4, 5, e6);

    @FXML
    private static Button e7 = new Button();
    static Tile E7 = new Tile(4, 6, e7);

    @FXML
    private static Button e8 = new Button();
    static Tile E8 = new Tile(4, 7, e8);

    @FXML
    private static Button f1 = new Button();
    static Tile F1 = new Tile(5, 0, f1);

    @FXML
    private static Button f2 = new Button();
    static Tile F2 = new Tile(5, 1, f2);

    @FXML
    private static Button f3 = new Button();
    static Tile F3 = new Tile(5, 2, f3);

    @FXML
    private static Button f4 = new Button();
    static Tile F4 = new Tile(5, 3, f4);

    @FXML
    private static Button f5 = new Button();
    static Tile F5 = new Tile(5, 4, f5);

    @FXML
    private static Button f6 = new Button();
    static Tile F6 = new Tile(5, 5, f6);

    @FXML
    private static Button f7 = new Button();
    static Tile F7 = new Tile(5, 6, f7);

    @FXML
    private static Button f8 = new Button();
    static Tile F8 = new Tile(5, 7, f8);

    @FXML
    private static Button g1 = new Button();
    static Tile G1 = new Tile(6, 0, g1);

    @FXML
    private static Button g2 = new Button();
    static Tile G2 = new Tile(6, 1, g2);

    @FXML
    private static Button g3 = new Button();
    static Tile G3 = new Tile(6, 2, g3);

    @FXML
    private static Button g4 = new Button();
    static Tile G4 = new Tile(6, 3, g4);

    @FXML
    private static Button g5 = new Button();
    static Tile G5 = new Tile(6, 4, g5);

    @FXML
    private static Button g6 = new Button();
    static Tile G6 = new Tile(6, 5, g6);

    @FXML
    private static Button g7 = new Button();
    static Tile G7 = new Tile(6, 6, g7);

    @FXML
    private static Button g8 = new Button();
    static Tile G8 = new Tile(6, 7, g8);

    @FXML
    private static Button h1 = new Button();
    static Tile H1 = new Tile(7, 0, h1);

    @FXML
    private static Button h2 = new Button();
    static Tile H2 = new Tile(7, 1, h2);

    @FXML
    private static Button h3 = new Button();
    static Tile H3 = new Tile(7, 2, h3);

    @FXML
    private static Button h4 = new Button();
    static Tile H4 = new Tile(7, 3, h4);

    @FXML
    private static Button h5 = new Button();
    static Tile H5 = new Tile(7, 4, h5);

    @FXML
    private static Button h6 = new Button();
    static Tile H6 = new Tile(7, 5, h6);

    @FXML
    private static Button h7 = new Button();
    static Tile H7 = new Tile(7, 6, h7);

    @FXML
    private static Button h8 = new Button();
    static Tile H8 = new Tile(7, 7, h8);

    @FXML
    void clickedA1(MouseEvent event) {
        Main.clickPosFunc(A1);
    }

    @FXML
    void clickedA2(MouseEvent event) {
        Main.clickPosFunc(A2);
    }

    @FXML
    void clickedA3(MouseEvent event) {
        Main.clickPosFunc(A3);
    }

    @FXML
    void clickedA4(MouseEvent event) {
        Main.clickPosFunc(A4);
    }

    @FXML
    void clickedA5(MouseEvent event) {
        Main.clickPosFunc(A5);
    }

    @FXML
    void clickedA6(MouseEvent event) {
        Main.clickPosFunc(A6);
    }

    @FXML
    void clickedA7(MouseEvent event) {
        Main.clickPosFunc(A7);
    }

    @FXML
    void clickedA8(MouseEvent event) {
        Main.clickPosFunc(A8);
    }

    @FXML
    void clickedB1(MouseEvent event) {
        Main.clickPosFunc(B1);
    }

    @FXML
    void clickedB2(MouseEvent event) {
        Main.clickPosFunc(B2);
    }

    @FXML
    void clickedB3(MouseEvent event) {
        Main.clickPosFunc(B3);
    }

    @FXML
    void clickedB4(MouseEvent event) {
        Main.clickPosFunc(B4);
    }

    @FXML
    void clickedB5(MouseEvent event) {
        Main.clickPosFunc(B5);
    }

    @FXML
    void clickedB6(MouseEvent event) {
        Main.clickPosFunc(B6);
    }

    @FXML
    void clickedB7(MouseEvent event) {
        Main.clickPosFunc(B7);
    }

    @FXML
    void clickedB8(MouseEvent event) {
        Main.clickPosFunc(B8);
    }

    @FXML
    void clickedBishopB1(MouseEvent event) {
        Main.clickPiece(bishopB1);
    }

    @FXML
    void clickedBishopB2(MouseEvent event) {
        Main.clickPiece(bishopB2);
    }

    @FXML
    void clickedBishopW1(MouseEvent event) {
        Main.clickPiece(bishopW1);
    }

    @FXML
    void clickedBishopW2(MouseEvent event) {
        Main.clickPiece(bishopB1);
    }

    @FXML
    void clickedC1(MouseEvent event) {
        Main.clickPosFunc(C1);
    }

    @FXML
    void clickedC2(MouseEvent event) {
        Main.clickPosFunc(C2);
    }

    @FXML
    void clickedC3(MouseEvent event) {
        Main.clickPosFunc(C3);
    }

    @FXML
    void clickedC4(MouseEvent event) {
        Main.clickPosFunc(C4);
    }

    @FXML
    void clickedC5(MouseEvent event) {
        Main.clickPosFunc(C5);
    }

    @FXML
    void clickedC6(MouseEvent event) {
        Main.clickPosFunc(C6);
    }

    @FXML
    void clickedC7(MouseEvent event) {
        Main.clickPosFunc(C7);
    }

    @FXML
    void clickedC8(MouseEvent event) {
        Main.clickPosFunc(C8);
    }

    @FXML
    void clickedD1(MouseEvent event) {
        Main.clickPosFunc(D1);
    }

    @FXML
    void clickedD2(MouseEvent event) {
        Main.clickPosFunc(D2);
    }

    @FXML
    void clickedD3(MouseEvent event) {
        Main.clickPosFunc(D3);
    }

    @FXML
    void clickedD4(MouseEvent event) {
        Main.clickPosFunc(D4);
    }

    @FXML
    void clickedD5(MouseEvent event) {
        Main.clickPosFunc(D5);
    }

    @FXML
    void clickedD6(MouseEvent event) {
        Main.clickPosFunc(D6);
    }

    @FXML
    void clickedD7(MouseEvent event) {
        Main.clickPosFunc(D7);
    }

    @FXML
    void clickedD8(MouseEvent event) {
        Main.clickPosFunc(D8);
    }

    @FXML
    void clickedE1(MouseEvent event) {
        Main.clickPosFunc(E1);
    }

    @FXML
    void clickedE2(MouseEvent event) {
        Main.clickPosFunc(E2);
    }

    @FXML
    void clickedE3(MouseEvent event) {
        Main.clickPosFunc(E3);
    }

    @FXML
    void clickedE4(MouseEvent event) {
        Main.clickPosFunc(E4);
    }

    @FXML
    void clickedE5(MouseEvent event) {
        Main.clickPosFunc(E5);
    }

    @FXML
    void clickedE6(MouseEvent event) {
        Main.clickPosFunc(E6);
    }

    @FXML
    void clickedE7(MouseEvent event) {
        Main.clickPosFunc(E7);
    }

    @FXML
    void clickedE8(MouseEvent event) {
        Main.clickPosFunc(E8);
    }

    @FXML
    void clickedF1(MouseEvent event) {
        Main.clickPosFunc(F1);
    }

    @FXML
    void clickedF2(MouseEvent event) {
        Main.clickPosFunc(F2);
    }

    @FXML
    void clickedF3(MouseEvent event) {
        Main.clickPosFunc(F3);
    }

    @FXML
    void clickedF4(MouseEvent event) {
        Main.clickPosFunc(F4);
    }

    @FXML
    void clickedF5(MouseEvent event) {
        Main.clickPosFunc(F5);
    }

    @FXML
    void clickedF6(MouseEvent event) {
        Main.clickPosFunc(F6);
    }

    @FXML
    void clickedF7(MouseEvent event) {
        Main.clickPosFunc(F7);
    }

    @FXML
    void clickedF8(MouseEvent event) {
        Main.clickPosFunc(F8);
    }

    @FXML
    void clickedG1(MouseEvent event) {
        Main.clickPosFunc(G1);
    }

    @FXML
    void clickedG2(MouseEvent event) {
        Main.clickPosFunc(G2);
    }

    @FXML
    void clickedG3(MouseEvent event) {
        Main.clickPosFunc(G3);
    }

    @FXML
    void clickedG4(MouseEvent event) {
        Main.clickPosFunc(G4);
    }

    @FXML
    void clickedG5(MouseEvent event) {
        Main.clickPosFunc(G5);
    }

    @FXML
    void clickedG6(MouseEvent event) {
        Main.clickPosFunc(G6);
    }

    @FXML
    void clickedG7(MouseEvent event) {
        Main.clickPosFunc(G7);
    }

    @FXML
    void clickedG8(MouseEvent event) {
        Main.clickPosFunc(G8);
    }

    @FXML
    void clickedH1(MouseEvent event) {
        Main.clickPosFunc(H1);
    }

    @FXML
    void clickedH2(MouseEvent event) {
        Main.clickPosFunc(H2);
    }

    @FXML
    void clickedH3(MouseEvent event) {
        Main.clickPosFunc(H3);
    }

    @FXML
    void clickedH4(MouseEvent event) {
        Main.clickPosFunc(H4);
    }

    @FXML
    void clickedH5(MouseEvent event) {
        Main.clickPosFunc(H5);
    }

    @FXML
    void clickedH6(MouseEvent event) {
        Main.clickPosFunc(H6);
    }

    @FXML
    void clickedH7(MouseEvent event) {
        Main.clickPosFunc(H7);
    }

    @FXML
    void clickedH8(MouseEvent event) {
        Main.clickPosFunc(H8);
    }

    @FXML
    void clickedKingB(MouseEvent event) {
        Main.clickPiece(kingB);
    }

    @FXML
    void clickedKingW(MouseEvent event) {
        Main.clickPiece(kingW);
    }

    @FXML
    void clickedKnightB1(MouseEvent event) {
        Main.clickPiece(knightB1);
    }

    @FXML
    void clickedKnightW1(MouseEvent event) {
        Main.clickPiece(knightW1);
    }

    @FXML
    void clickedKnightW2(MouseEvent event) {
        Main.clickPiece(knightW2);
    }

    @FXML
    void clickedPawnB1(MouseEvent event) {
        Main.clickPiece(pawnB1);
    }

    @FXML
    void clickedPawnB2(MouseEvent event) {
        Main.clickPiece(pawnB2);
    }

    @FXML
    void clickedPawnB3(MouseEvent event) {
        Main.clickPiece(pawnB3);
    }

    @FXML
    void clickedPawnB4(MouseEvent event) {
        Main.clickPiece(pawnB4);
    }

    @FXML
    void clickedPawnB5(MouseEvent event) {
        Main.clickPiece(pawnB5);
    }

    @FXML
    void clickedPawnB6(MouseEvent event) {
        Main.clickPiece(pawnB6);
    }

    @FXML
    void clickedPawnB7(MouseEvent event) {
        Main.clickPiece(pawnB7);
    }

    @FXML
    void clickedPawnB8(MouseEvent event) {
        Main.clickPiece(pawnB8);
    }

    @FXML
    void clickedPawnW1(MouseEvent event) {
        Main.clickPiece(pawnW1);
    }

    @FXML
    void clickedPawnW2(MouseEvent event) {
        Main.clickPiece(pawnW2);
    }

    @FXML
    void clickedPawnW3(MouseEvent event) {
        Main.clickPiece(pawnW3);
    }

    @FXML
    void clickedPawnW4(MouseEvent event) {
        Main.clickPiece(pawnW4);
    }

    @FXML
    void clickedPawnW5(MouseEvent event) {
        Main.clickPiece(pawnW5);
    }

    @FXML
    void clickedPawnW6(MouseEvent event) {
        Main.clickPiece(pawnW6);
    }

    @FXML
    void clickedPawnW7(MouseEvent event) {
        Main.clickPiece(pawnW7);
    }

    @FXML
    void clickedPawnW8(MouseEvent event) {
        Main.clickPiece(pawnW8);
    }

    @FXML
    void clickedQueenB(MouseEvent event) {
        Main.clickPiece(queenB);
    }

    @FXML
    void clickedQueenW(MouseEvent event) {
        Main.clickPiece(queenW);
    }

    @FXML
    void clickedRookB1(MouseEvent event) {
        Main.clickPiece(rookB1);
    }

    @FXML
    void clickedRookB2(MouseEvent event) {
        Main.clickPiece(rookB2);
    }

    @FXML
    void clickedRookW1(MouseEvent event) {
        Main.clickPiece(rookW1);
    }

    @FXML
    void clickedRookW2(MouseEvent event) {
        Main.clickPiece(rookW2);
    }
    
    public static Piece[][] pieceBoard = new Piece[8][8];
    public static Tile[][] tileBoard = new Tile[8][8];

    public static void makeBoards(){
            
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

        //black pawn row
        pieceBoard[0][6] = pawnB1;
        pieceBoard[1][6] = pawnB2;
        pieceBoard[2][6] = pawnB3;
        pieceBoard[3][6] = pawnB4;
        pieceBoard[4][6] = pawnB5;
        pieceBoard[5][6] = pawnB6;
        pieceBoard[6][6] = pawnB7;
        pieceBoard[7][6] = pawnB8;

        //black piece row
        pieceBoard[0][7] = rookB1;
        pieceBoard[1][7] = knightB1;
        pieceBoard[2][7] = bishopB1;
        pieceBoard[3][7] = queenB;
        pieceBoard[4][7] = kingB;
        pieceBoard[5][7] = bishopB2;
        pieceBoard[6][7] = knightB2;
        pieceBoard[7][7] = rookB2;

        //tile board
        tileBoard[0][0] = A1;
        tileBoard[0][1] = A2;
        tileBoard[0][2] = A3;
        tileBoard[0][3] = A4;
        tileBoard[0][4] = A5;
        tileBoard[0][5] = A6;
        tileBoard[0][6] = A7;
        tileBoard[0][7] = A8;
        tileBoard[1][0] = B1;
        tileBoard[1][1] = B2;
        tileBoard[1][2] = B3;
        tileBoard[1][3] = B4;
        tileBoard[1][4] = B5;
        tileBoard[1][5] = B6;
        tileBoard[1][6] = B7;
        tileBoard[1][7] = B8;
        tileBoard[2][0] = C1;
        tileBoard[2][1] = C2;
        tileBoard[2][2] = C3;
        tileBoard[2][3] = C4;
        tileBoard[2][4] = C5;
        tileBoard[2][5] = C6;
        tileBoard[2][6] = C7;
        tileBoard[2][7] = C8;
        tileBoard[3][0] = D1;
        tileBoard[3][1] = D2;
        tileBoard[3][2] = D3;
        tileBoard[3][3] = D4;
        tileBoard[3][4] = D5;
        tileBoard[3][5] = D6;
        tileBoard[3][6] = D7;
        tileBoard[3][7] = D8;
        tileBoard[4][0] = E1;
        tileBoard[4][1] = E2;
        tileBoard[4][2] = E3;
        tileBoard[4][3] = E4;
        tileBoard[4][4] = E5;
        tileBoard[4][5] = E6;
        tileBoard[4][6] = E7;
        tileBoard[4][7] = E8;
        tileBoard[5][0] = F1;
        tileBoard[5][1] = F2;
        tileBoard[5][2] = F3;
        tileBoard[5][3] = F4;
        tileBoard[5][4] = F5;
        tileBoard[5][5] = F6;
        tileBoard[5][6] = F7;
        tileBoard[5][7] = F8;
        tileBoard[6][0] = G1;
        tileBoard[6][1] = G2;
        tileBoard[6][2] = G3;
        tileBoard[6][3] = G4;
        tileBoard[6][4] = G5;
        tileBoard[6][5] = G6;
        tileBoard[6][6] = G7;
        tileBoard[6][7] = G8;
        tileBoard[7][0] = H1;
        tileBoard[7][1] = H2;
        tileBoard[7][2] = H3;
        tileBoard[7][3] = H4;
        tileBoard[7][4] = H5;
        tileBoard[7][5] = H6;
        tileBoard[7][6] = H7;
        tileBoard[7][7] = H8;
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