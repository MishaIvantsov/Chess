import javafx.scene.control.Button;

public class Tile {
    final int xPos;
    final int yPos;
    final Button tileB;

    public Tile(int xPosition, int yPosition, Button button){
        xPos = xPosition;
        yPos = yPosition;
        tileB = button;
    }
}