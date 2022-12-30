import javafx.scene.image.ImageView;

public class Piece {
    public boolean isWhite;
    public int xPos;
    public int yPos;
    public ImageView buttoneq;

    Piece(int xPosition, int yPosition, boolean color, ImageView imageq){
        xPos = xPosition;
        yPos = yPosition;
        isWhite = color;
        buttoneq = imageq;
    }

    public boolean checkMove(Move playerMove){
        return true;
    }
}
