package application;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.ChoiceBox;

public class ProfileList {
	
	public static ObservableList<String> DropDown = FXCollections.observableArrayList();
	public static ChoiceBox profiles = new ChoiceBox();
	
	static public void addProfile(String name) 
	{
		DropDown.add(name);
	}
}
