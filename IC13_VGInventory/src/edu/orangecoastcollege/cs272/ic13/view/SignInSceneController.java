package edu.orangecoastcollege.cs272.ic13.view;

import javafx.fxml.FXML;

import javafx.scene.control.TextField;
import edu.orangecoastcollege.cs272.ic13.controller.Controller;
import javafx.event.ActionEvent;

import javafx.scene.control.Label;

import javafx.scene.input.MouseEvent;

public class SignInSceneController {
	private static Controller controller = Controller.getInstance();
	@FXML
	private Label emailAddressLabel;
	@FXML
	private Label passwordLabel;
	@FXML
	private Label emailErrorLabel;
	@FXML
	private Label passwordErrorLabel;
	@FXML
	private TextField emailAddressTF;
	@FXML
	private TextField passwordTF;


	// Event Listener on Label.onMouseClicked
	@FXML
	public void loadSignUp(MouseEvent event) {
		ViewNavigator.loadScene("Sign Up", ViewNavigator.SIGN_UP_SCENE);
	}
	// Event Listener on Button.onAction
	@FXML
	public boolean signIn(ActionEvent event) {
		String email = emailAddressTF.getText();
		String password = passwordTF.getText();
		
		// Let's check to see if the error labels should be made visible:
		emailErrorLabel.setVisible(email.isEmpty());
		passwordErrorLabel.setVisible(password.isEmpty());
		
		if (emailErrorLabel.isVisible() || passwordErrorLabel.isVisible())
			return false;
		
		String result = controller.signInUser(email, password);
		
		return true;
	}
}
