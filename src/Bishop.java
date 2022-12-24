public class Bishop extends Piece {
    
    Bishop(int xPosition, int yPosition, boolean color){
        super(xPosition, yPosition, color);
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
