import javafx.scene.image.ImageView;

public class King extends Piece {
    
    boolean isChecked;
    boolean isAbleToCastle;

    King(int xPosition, int yPosition, boolean color, ImageView button){
        super(xPosition, yPosition, color, button);
    }

    public boolean checkMove(Move playerMove){
        
        if( (playerMove.xChange == 1 || playerMove.xChange == 0) && (playerMove.yChange == 1 || playerMove.yChange == 0) ){
            return true;
        }
        else{
            return false;
        }
    }
}
