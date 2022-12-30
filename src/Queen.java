import javafx.scene.image.ImageView;

public class Queen extends Piece {
    
    Queen(int xPosition, int yPosition, boolean color, ImageView button){
        super(xPosition, yPosition, color, button);
    }

    @Override
    public boolean checkMove(Move playerMove){
        
        if(playerMove.xChange == playerMove.yChange || playerMove.xChange == - playerMove.xChange || playerMove.xChange == 0 || playerMove.yChange == 0){
            return true;
        }
        else{
            return false;
        }
    }
}
