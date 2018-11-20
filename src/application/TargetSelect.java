package application;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;

import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.HBox;

public class TargetSelect {
	
	private static RadioButton RC = new RadioButton(); // create RC button
	
	private static RadioButton lights = new RadioButton(); // create lights button
	
	
	public void RadioInit()
	{
		RC.setText("RC       "); // spaces used to move lights button further away
		RC.setId("RC");
		lights.setText("Lights");
		lights.setId("lights");
		ToggleGroup systems = new ToggleGroup(); // create group for buttons to join
		RC.setToggleGroup(systems); // put both buttons in group
		lights.setToggleGroup(systems);
		
		//I can't believe this is how you make buttons work in Java
		RC.setOnAction(new EventHandler<ActionEvent>() { // override to change target to RC
            @Override public void handle(ActionEvent e) {
                setTarget(RC);
            }
        });
		
		lights.setOnAction(new EventHandler<ActionEvent>() { // override to change target to lights
            @Override public void handle(ActionEvent e) {
                setTarget(lights);
            }
        });
		
		HBox buttons = new HBox(); // new horizontal box for buttons
		
		buttons.getChildren().add(RC); // put buttons into box
		buttons.getChildren().add(lights);
		buttons.setPadding(new Insets(0.0,0.0,10.0,450.0));
	}
	
	public void setTarget(RadioButton target)
	{
		// this is probably Aiden's job
		String focus = target.getId();
		if(focus == "RC")
		{
			// changes target of the headset to RC
		}
		else if(focus == "lights")
		{
			// changes target of the headset to lights
		}
		else
		{
			// idk if we even need this since we're hardcoding it?
		}
		
		
	}
	
	
	

}
