package application;

import javafx.scene.chart.LineChart;
import javafx.scene.control.ChoiceBox;

public class GUIConstruct {
	public void buildGUI()
	{
		LineChart chart = ScrollingChart.createChart();
		
		// future class positions every box
		// Alignment.setPosition(chart) or something similar
		
		//add new class to put buttons in box
		//AddToBox(RadioInit().RC)
		//AddToBox(RadioInit().Home)
		
		ChoiceBox profiles = new ChoiceBox();
		profiles.setItems(ProfileList.DropDown);
		
	}
}
