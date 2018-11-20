package application;
	
import java.util.Random;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.chart.Chart;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.*;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			BorderPane MainGUI = new BorderPane(); // create BorderPane
			
			// Title Text Start
			HBox title = new HBox(); // create horizontal box
			Text t = new Text(); // new text structure
			t.setFont(new Font(40)); // set font size to 40
			t.setText("Emotiv GUI"); 
			t.setFill(Color.RED); // make text red
			title.setPadding(new Insets(0.0,0,0.0,450.0)); // center it. sort of.
			title.getChildren().add(t); // add text to horizontal box
			MainGUI.setTop(title); // put horizontal box at top of pane
			//Title Text End
			
			//Radio Button Start
			RadioButton RC = new RadioButton(); // create RC button
			RC.setText("RC       "); // spaces used to move lights button further away
			RadioButton lights = new RadioButton(); // create lights button
			lights.setText("Lights");
			
			ToggleGroup systems = new ToggleGroup(); // create group for buttons to join
			RC.setToggleGroup(systems); // put both buttons in group
			lights.setToggleGroup(systems);
			
			HBox buttons = new HBox(); // new horizontal box for buttons
			MainGUI.setBottom(buttons); // put button box on bottom of borderpane
			
			buttons.getChildren().add(RC); // put buttons into box
			buttons.getChildren().add(lights);
			buttons.setPadding(new Insets(0.0,0.0,10.0,450.0)); // center
			//Radio Button End
			
			// Profile Selector Start
			
			ChoiceBox profiles = new ChoiceBox();
			ObservableList<String> profilenames = FXCollections.observableArrayList("Profile 1", "Profile 2", "Profile 3");
			profiles.setItems(profilenames);
			MainGUI.setRight(profiles);
			
			// Profile Selector End
			
			// Chart Start
			NumberAxis x = new NumberAxis();
			NumberAxis y = new NumberAxis();
			LineChart<Number,Number> rtd = new LineChart<Number, Number>(x,y);
			rtd.setTitle("Random Data Because You Asked Me To");
			rtd.setHorizontalGridLinesVisible(false);
			rtd.setVerticalGridLinesVisible(false);
			x.setLabel("Data");
			y.setLabel("Other Data");
			y.setUpperBound(1);
			XYChart.Series randomdata = new XYChart.Series();
			double yfilter;
			Random yval = new Random();
			for(double i = 1; i < 20; i++)
			{
			yfilter = yval.nextInt() % 10 ;
			if(yfilter < 0)
				yfilter *= -1;
			randomdata.getData().add(new XYChart.Data(i, yfilter));
			}
			rtd.getData().add(randomdata);
			MainGUI.setCenter(rtd);
			Scene scene = new Scene(MainGUI,1000,1000); // create scene
			//scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			scene.setFill(Color.HOTPINK); // make background pink (doesn't work anymore :( )
			primaryStage.setScene(scene); // initialize
			primaryStage.show(); // scene pops up
			 
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
