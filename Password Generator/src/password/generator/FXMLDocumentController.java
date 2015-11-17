package password.generator;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

/**
 *
 * @author Rafal Rozmus <rozmus.rafal@gmail.com>
 */
public class FXMLDocumentController implements Initializable {
    
    Office365LikePasswordGenerator generator = new Office365LikePasswordGenerator();
    
    @FXML
    private Button generatePasswordButton;
    
    @FXML
    private TextField passwordField;
    
    @FXML
    private void handleGeneratePasswordButtonAction(ActionEvent event) {
        passwordField.setText(generator.generatePassword());

    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        PasswordGenerator.stage.setResizable(false);
        passwordField.setText(generator.generatePassword());
    }    
    
}
