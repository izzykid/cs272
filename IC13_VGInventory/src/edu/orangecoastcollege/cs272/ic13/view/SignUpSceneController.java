package edu.orangecoastcollege.cs272.ic13.view;

import edu.orangecoastcollege.cs272.ic13.controller.Controller;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class SignUpSceneController {
	
	private static Controller controller = Controller.getInstance();
	@FXML
	private Label nameLabel;
	@FXML
	private Label emailLabel;
	@FXML
	private Label passwordLabel;
	@FXML
	private Label nameErrorLabel;
	@FXML
	private Label emailErrorLabel;
	@FXML
	private Label passwordErrorLabel;
	@FXML
	private Label signUpErrorLabel;
	@FXML
	private Label tcLabel;
	@FXML
	private TextField nameTF;
	@FXML
	private TextField emailTF;
	@FXML
	private TextField passwordTF;
	@FXML
	private Button signUpButton;

	// Event Listener on Button[#signUpButton].onAction
	@FXML
	public boolean loadSignUp(ActionEvent event) {
		String name = nameTF.getText();
		String email = emailTF.getText();
		String password = passwordTF.getText();
		
		// Let's check to see if the error labels should be made visible:
		emailErrorLabel.setVisible(email.isEmpty());
		passwordErrorLabel.setVisible(password.isEmpty());
		nameErrorLabel.setVisible(name.isEmpty());
		
		if (emailErrorLabel.isVisible() || passwordErrorLabel.isVisible() || nameErrorLabel.isVisible())
			return false;
		
		String result = controller.signUpUser(name, email, password);
		if (result.equalsIgnoreCase("SUCCESS")) {
			signUpErrorLabel.setVisible(false);
			ViewNavigator.loadScene("Video Game List", ViewNavigator.VIDEO_GAME_LIST_SCENE);
			return true;
		}
		signUpErrorLabel.setText(result);
		signUpErrorLabel.setVisible(true);
		return false;
		
	}
}
