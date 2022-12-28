import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Bishop extends Piece {
    
    Bishop(int xPosition, int yPosition, boolean color, ImageView imageq){
        super(xPosition, yPosition, color, imageq);
    }

    public boolean checkMove(Move playerMove){
        
        if(playerMove.xChange == playerMove.yChange || playerMove.xChange == - playerMove.xChange){
            return true;
        }
        else{
            return false;
        }
    }
}
