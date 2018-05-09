package edu.orangecoastcollege.cs272.ic13.view;

import java.net.URL;
import java.util.ResourceBundle;

import edu.orangecoastcollege.cs272.ic13.controller.Controller;
import edu.orangecoastcollege.cs272.ic13.model.VideoGame;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ListView;

public class VideoGamesListScene implements Initializable {

	private static Controller controller = Controller.getInstance();

	@FXML
	private ListView<VideoGame> allVideoGamesLV;
	@FXML
	private ComboBox<String> publishersCB;
	@FXML
	private ComboBox<String> platformsCB;
	

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		//TODO: Complete this method
	}
	
	@FXML
	public Object addGameToInventory()
	{
		//TODO: Complete this method
		return this;
	}
	
	@FXML
	public Object viewInventory()
	{
		//TODO: Complete this method
		return this;
	}

}
