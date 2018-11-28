package application;

import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.control.ChoiceBox;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class GUIConstruct {
	public static BorderPane MainGUI = new BorderPane(); // create BorderPane
	public static Scene scene = new Scene(MainGUI, 1000, 1000);
	public static Stage primaryStage = new Stage();
	
	public static void buildGUI()
	{
		
		LineChart chart = ScrollingChart.createChart();
		
		ProfileList.profiles.setItems(ProfileList.DropDown);
		
		VBox left = BoxBuild.InitProfileBox();
		HBox bottom = BoxBuild.InitRadioBox();
		HBox top = BoxBuild.TitleBox();
		
		MainGUI.setLeft(left);
		MainGUI.setBottom(bottom);
		MainGUI.setCenter(chart);
		MainGUI.setTop(top);
		
		scene.setFill(Color.HOTPINK); // make background pink (doesn't work anymore :( )
		primaryStage.setScene(scene); // initialize
		primaryStage.show(); // scene pops up
	}
}
