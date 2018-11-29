package application;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.text.Text;

public class HomeControl {
	
	static public Button lightswitch = new Button("Light Switch");
	
	static public Button outlet = new Button("Outlet Control");
	
	static public Text outletStatus = new Text();
	
	static public Text lightStatus = new Text();
	
	static public void lightSwitchInit()
	{
		lightStatus.setText("Light Off");
		lightStatus.setId("off");
		outletStatus.setText("Outlet Off");
		outletStatus.setId("off");
		
		lightswitch.setOnAction(new EventHandler<ActionEvent>() { // override to toggle lights
            @Override public void handle(ActionEvent e) {
                //light on if off, off if on
            	if(lightStatus.getId() == "off")
            	{
            		lightStatus.setText("Light On");
            		lightStatus.setId("on");
            		//turn light on
            	}
            	else if(lightStatus.getId() == "on")
            	{
            		lightStatus.setText("Light Off");
            		lightStatus.setId("off");
            		// turn light off
            	}
            }
        });
		
		outlet.setOnAction(new EventHandler<ActionEvent>() { // override to toggle outlet
            @Override public void handle(ActionEvent e) {
                //outlet on if off, off if on
            	
            	if(outletStatus.getId() == "off")
            	{
            		outletStatus.setText("Outlet On");
            		outletStatus.setId("on");
            		//turn light on
            	}
            	else if(outletStatus.getId() == "on")
            	{
            		outletStatus.setText("Outlet Off");
            		outletStatus.setId("off");
            		// turn light off
            	}
            }
        });
	}

}
