public class King extends Piece {
    
    boolean isChecked;
    boolean isMoved;

    King(int xPosition, int yPosition, boolean color){
        super(xPosition, yPosition, color);
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
