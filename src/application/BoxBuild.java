package application;

import javafx.geometry.Insets;
import javafx.scene.Node;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

public class BoxBuild {

	static public HBox InitRadioBox()
	{
		TargetSelect.RadioInit();
		HBox buttons = new HBox(); // new horizontal box for buttons
		buttons.getChildren().add(TargetSelect.RC);
		buttons.getChildren().add(TargetSelect.home);
		buttons.setPadding(new Insets(0,0,0,450));
		return buttons;
	}
	static public HBox TitleBox()
	{	
		HBox title = new HBox();
		Text t = new Text(); // new text structure
		t.setFont(new Font(40)); // set font size to 40
		t.setText("Emotiv GUI"); 
		t.setFill(Color.RED); // make text red
		title.setPadding(new Insets(0,0,0,400)); //top right bottom left
		title.getChildren().add(t); // add text to horizontal box
		return title;
	}
	static public VBox InitProfileBox()
	{
		VBox profileList = new VBox();
		profileList.getChildren().add(ProfileList.profiles);
		ProfileList.addProfile("Aiden");
		return profileList;
	}
	
	
	
}
