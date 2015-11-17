package password.generator;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author Rafal Rozmus <rozmus.rafal@gmail.com>
 */
public class PasswordGenerator extends Application {
    
    // declare 'stage' as static for the purpose of disabling window resizing
    public static Stage stage;
    
    @Override
    public void start(Stage stage) throws Exception {
        
        // initialize value of stage
        this.stage = stage;
        Parent root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
        
        Scene scene = new Scene(root);
        
        stage.setScene(scene);
        stage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
