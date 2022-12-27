import javafx.scene.image.ImageView;

public class Rook extends Piece {
    
    Rook(int xPosition, int yPosition, boolean color, ImageView button){
        super(xPosition, yPosition, color, button);
    }

    public boolean checkMove(Move playerMove){
        
        if(playerMove.xChange == 0 || playerMove.yChange == 0 && !(playerMove.xChange == 0 && playerMove.yChange == 0)){
            return true;
        }
        else{
            return false;
        }
    }
}
