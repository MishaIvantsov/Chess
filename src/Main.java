import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;

public class Main extends Application implements EventHandler<ActionEvent> {
    

    public static void main(String[] args) throws Exception {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        
        try{
            
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("chessProjectBoard.fxml"));
            Parent root = (Parent) fxmlLoader.load();
            Scene scene = new Scene(root);
            primaryStage.setTitle("Chess");
            primaryStage.setScene(scene);
            primaryStage.show();
            chessProjectBoard.makeBoards();

        
        } catch(Exception e){
            e.printStackTrace();
        }
    }


    @Override
    public void handle(ActionEvent event){
        
    }
}