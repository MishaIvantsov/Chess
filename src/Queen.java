public class Queen extends Piece {
    
    Queen(int xPosition, int yPosition, boolean color){
        super(xPosition, yPosition, color);
    }

    public boolean checkMove(Move playerMove){
        
        if(playerMove.xChange == playerMove.yChange || playerMove.xChange == - playerMove.xChange || playerMove.xChange == 0 || playerMove.yChange == 0){
            return true;
        }
        else{
            return false;
        }
    }
}
