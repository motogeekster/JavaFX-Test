package application;
	
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
//import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;


public class Main extends Application {
	
	@FXML
	Button btn;
	
	
	@Override
	public void start(Stage primaryStage) {
		primaryStage.setTitle("JavaFX Welcome");
		
//		creates grid
		GridPane grid = new GridPane();
		grid.setAlignment(Pos.CENTER);
		grid.setHgap(10);
		grid.setVgap(10);
		grid.setPadding(new Insets(25,25,25,25));
		
		Text scenetitle = new Text("Welcome");
//		scenetitle.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
		scenetitle.setId("welcome-text");
		grid.add(scenetitle, 0, 0, 2, 1);
		
		Label userName = new Label("User Name:");
		grid.add(userName, 0, 1);
		
		TextField userTextField = new TextField();
		grid.add(userTextField, 1, 1);
		
		Label pw = new Label("Password:");
		grid.add(pw, 0, 2);
		
		PasswordField pwBox = new PasswordField();
		grid.add(pwBox, 1, 2);

		
		
		
		
//		shows grid lines
//		grid.setGridLinesVisible(true);
		
//		button code
		Button btn = new Button("Sign in");
		HBox hbBtn = new HBox(10);
		hbBtn.setAlignment(Pos.BOTTOM_RIGHT);
		hbBtn.getChildren().add(btn);
		grid.add(hbBtn, 1, 4);
		
//		adding text
		final Text actiontarget = new Text();
			grid.add(actiontarget, 1, 6);
			
//		event handler for button
	btn.setOnAction(new EventHandler<ActionEvent>() {
		
		@Override
		public void handle(ActionEvent e) {
//			actiontarget.setFill(Color.FIREBRICK);
			actiontarget.setId("actiontarget");
			actiontarget.setText("Sign in button pressed");
		}
	});
	
		
//		sets new scene to a default of 300,275
		Scene scene = new Scene(grid,300,275);
		primaryStage.setScene(scene);
//		Css 
		scene.getStylesheets().add(Main.class.getResource("application.css").toExternalForm());
		
		
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
	