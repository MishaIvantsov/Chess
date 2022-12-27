import javafx.scene.image.ImageView;

public class Piece {
    public static boolean isWhite;
    public static int xPos;
    public static int yPos;
    public static ImageView buttoneq;

    Piece(int xPosition, int yPosition, boolean color, ImageView button){
        xPos = xPosition;
        yPos = yPosition;
        isWhite = color;
        buttoneq = button;
    }

    public boolean checkMove(Move playerMove){
        return false;
    }
}
