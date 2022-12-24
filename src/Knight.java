public class Knight extends Piece {
    
    Knight(int xPosition, int yPosition, boolean color){
        super(xPosition, yPosition, color);
    }

    public boolean checkMove(Move playerMove){
        if(
            (playerMove.xChange == 2 || playerMove.xChange == -2) && (playerMove.yChange == 1 || playerMove.yChange == -1) 
            ||
            (playerMove.xChange == 1 || playerMove.xChange == -1) && (playerMove.yChange == 2 || playerMove.yChange == -2) 
        ){
            return true;
        }
        else{
            return false;
        }
    }
}