package application;

import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class Tabs {
	
	static public TabPane tabs = new TabPane();
	static public BorderPane tab1pane = new BorderPane();
	static public BorderPane tab2pane = new BorderPane();
	
	static public void setTab1Content()
	{
		tab1pane.setLeft(BoxBuild.InitSwitches());
		tab1pane.setBottom(BoxBuild.InitRadioBox());
	}
	static public void setTab2Content()
	{
		tab2pane.setCenter(ScrollingChart.createChart());
		tab2pane.setLeft(BoxBuild.InitProfileBox());
		
	}
	static public void tab1Init()
	{
		Tab tab1 = new Tab();
		tab1.setText("Manual Control");
		tab1.setContent(tab1pane);
		tabs.getTabs().add(tab1);
	}
	static public void tab2Init()
	{
		Tab tab2 = new Tab();
		tab2.setText("Action Power");
		tab2.setContent(tab2pane);
		tabs.getTabs().add(tab2);
	}
	

}
