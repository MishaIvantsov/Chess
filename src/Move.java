public class Move {
    int xChange;
    int yChange;
    boolean isCapture;

    Move(int changeX, int changeY, boolean isCaptureMove){
        xChange = changeX;
        yChange = changeY;
        isCapture = isCaptureMove;
    }
}
