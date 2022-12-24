public class Pawn extends Piece{
    boolean isMoved = false;

    Pawn(int xPosition, int yPosition, boolean color){
        super(xPosition, yPosition, color);
    }

    public boolean checkMove(Move playerMove){
        
        //checks Pawn.isWhite to see what direction the pawn can go in 
        if(isWhite){
            
            if(playerMove.isCapture){

                //ensure only when capturing it moves one diagnoral up and either to the right or left return true, else return false
                if( (playerMove.xChange == 1 || playerMove.xChange == -1) && playerMove.yChange == 1){
                    return true;
                }
                else{
                    return false;
                }
            }
            else{

                //if it is not a capture move, then ensure the pawn only moves one up
                if(playerMove.yChange == 1 && playerMove.xChange == 0){
                    return true;
                }
                else{
                    return false;
                }
            }
        }
        else{
            
            if(playerMove.isCapture){

                //ensure only when capturing it moves one diagnoral up and either to the right or left return true, else return false
                if( (playerMove.xChange == 1 || playerMove.xChange == -1) && playerMove.yChange == -1){
                    return true;
                }
                else{
                    return false;
                }
            }
            else{

                //if it is not a capture move, then ensure the pawn only moves one down, else return false
                if(playerMove.xChange == 0 && playerMove.yChange == -1){
                    return true;
                }
                else{
                    return false;
                }
            }
        }
    }
}