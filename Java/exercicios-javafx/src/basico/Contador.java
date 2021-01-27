package basico;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Contador extends Application {
	
	private int counter = 0;
	
	private void updateNumberLabel(Label label) {
		label.setText(Integer.toString(counter));
		label.getStyleClass().remove("green");
		label.getStyleClass().remove("red");
		
		if (counter > 0) {
			label.getStyleClass().add("green");
		} else if (counter < 0) {
			label.getStyleClass().add("red");			
		}
	}
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		
		Label titleLabel = new Label("Contador");
		titleLabel.getStyleClass().add("title");
		Label numberLabel = new Label("0");
		numberLabel.getStyleClass().add("number");
		
		Button decrementButton = new Button("-");
		decrementButton.getStyleClass().add("buttons");
		
		Button incrementButton = new Button("+");
		incrementButton.getStyleClass().add("buttons");
		
		decrementButton.setOnAction(e -> {
			counter--;
			updateNumberLabel(numberLabel);
		});
		
		incrementButton.setOnAction(e -> {
			counter++;
			updateNumberLabel(numberLabel);
		});
		
		HBox buttonBox = new HBox();
		buttonBox.setAlignment(Pos.CENTER);
		buttonBox.setSpacing(10);
		buttonBox.getChildren().add(decrementButton);
		buttonBox.getChildren().add(incrementButton);
		
		VBox contentBox = new VBox();
		contentBox.getStyleClass().add("content");
		contentBox.setAlignment(Pos.CENTER);
		contentBox.setSpacing(10);
		contentBox.getChildren().add(titleLabel);
		contentBox.getChildren().add(numberLabel);
		contentBox.getChildren().add(buttonBox);
		
		String cssPath = getClass().getResource("/basico/Contador.css").toExternalForm();
		Scene mainScene = new Scene(contentBox, 400, 400);
		mainScene.getStylesheets().add(cssPath);
		mainScene.getStylesheets().add("https://fonts.googleapis.com/css2?family=Oswald");
		
		
		primaryStage.setScene(mainScene);
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}

}
