package fxml;

import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class LoginController {
	
	@FXML
	private TextField emailField;
	
	@FXML
	private PasswordField passwordField;

	public void enter() {
		System.out.println(emailField.getText());
		System.out.println(passwordField.getText());
	}
}
