import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

public class chessProjectBoard implements Initializable {

    @FXML
    private ResourceBundle resources;
    
    //initializes buttons and adds them to 2D array
    @FXML
    private void initializeButtons(){
        
        /* 
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("ChessProjectBoard.fxml"));
        Parent root = (Parent) fxmlLoader.load();
        Scene scene = new Scene(root);
        //Scene scene = stage.getScene();
        //Button btn = (Button) scene.lookup("#myBtnID");
        //TextField txt = (TextField ) scene.lookup("#myTxtID");
        */
        System.out.println("chessProjectBoard.java is executed");

        
            
    }

    @FXML
    private URL location;

    @FXML
    public void initialize(URL url, ResourceBundle rb) {
        initializeButtons();
    }
}
