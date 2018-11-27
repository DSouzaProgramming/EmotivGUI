package application;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;

import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.HBox;

public class TargetSelect {
	
	private static RadioButton RC = new RadioButton(); // create RC button
	
	private static RadioButton home = new RadioButton(); // create home button
	
	
	static public void RadioInit()
	{
		RC.setText("RC       "); // spaces used to move home button further away
		RC.setId("RC");
		home.setText("home");
		home.setId("home");
		ToggleGroup systems = new ToggleGroup(); // create group for buttons to join
		RC.setToggleGroup(systems); // put both buttons in group
		home.setToggleGroup(systems);
		
		//I can't believe this is how you make buttons work in Java
		RC.setOnAction(new EventHandler<ActionEvent>() { // override to change target to RC
            @Override public void handle(ActionEvent e) {
                setTarget(RC);
            }
        });
		
		home.setOnAction(new EventHandler<ActionEvent>() { // override to change target to home
            @Override public void handle(ActionEvent e) {
                setTarget(home);
            }
        });
		
		HBox buttons = new HBox(); // new horizontal box for buttons
		
		buttons.getChildren().add(RC); // put buttons into box
		buttons.getChildren().add(home);
		buttons.setPadding(new Insets(0.0,0.0,10.0,450.0));
	}
	
	static public void setTarget(RadioButton target)
	{
		// this is probably Aiden's job
		String focus = target.getId();
		if(focus == "RC")
		{
			// changes target of the headset to RC
		}
		else if(focus == "home")
		{
			// changes target of the headset to home
		}
		else
		{
			// idk if we even need this since we're hardcoding it?
		}
		
		
	}
	
	
	

}
