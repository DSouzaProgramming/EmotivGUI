package application;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class ProfileList {
	
	static ObservableList<String> DropDown;
	
	public ProfileList() //Instantiate empty profile list
	{
		DropDown = FXCollections.observableArrayList();
	}
	
	static public void addProfile(String name) 
	{
		DropDown.add(name);
	}
}
