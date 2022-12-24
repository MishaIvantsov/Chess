public class Piece {
    public static boolean isWhite;
    public static int xPos;
    public static int yPos;

    Piece(int xPosition, int yPosition, boolean color){
        xPos = xPosition;
        yPos = yPosition;
        isWhite = color;
    }

    public boolean checkMove(Move playerMove){
        return false;
    }
}
