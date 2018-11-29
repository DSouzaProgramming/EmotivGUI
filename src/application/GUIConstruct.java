package application;

import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class GUIConstruct {
	public static BorderPane MainGUI = new BorderPane(); // create BorderPane
	public static Stage primaryStage = new Stage();
	public static Scene scene = new Scene(Tabs.tabs, 1000, 1000);
	public static void buildGUI()
	{
		
		
		ProfileList.profiles.setItems(ProfileList.DropDown);
		Tabs.setTab1Content();
		Tabs.setTab2Content();
		Tabs.tab1Init();
		Tabs.tab2Init();
		//scene.setFill(Color.HOTPINK); // make background pink (doesn't work anymore :( )
		primaryStage.setScene(scene); // initialize
		primaryStage.setTitle("Emotiv GUI");
		primaryStage.show(); // scene pops up
	}
}
