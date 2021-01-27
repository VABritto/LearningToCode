package basico;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Wizard extends Application {

	private Stage window;
	private Scene step1;
	private Scene step2;
	private Scene step3;

	@Override
	public void start(Stage primaryStage) throws Exception {
		window = primaryStage;

		createStep(1, 2, 3);

		window.setScene(step1);
		window.setTitle("Wizard :: Step 1");
		window.show();
	}

	private void createStep(int... sceneNums) {

		for (int sceneNum : sceneNums) {
			Button previousStep = new Button();
			Button nextStep = new Button();

			if (sceneNum > 1) {
				previousStep.setText("<< Voltar p/ Passo " + (sceneNum - 1));

				if (sceneNum == 2) {
					nextStep.setText("Ir p/ Passo " + (sceneNum + 1) + " >>");
					previousStep.setOnAction(e -> {
						window.setScene(step1);
						window.setTitle("Wizard :: Step 1");
					});
					nextStep.setOnAction(e -> {
						window.setScene(step3);
						window.setTitle("Wizard :: Step 3");
					});
				} else if (sceneNum == 3) {
					nextStep.setText("Finalizar");
					previousStep.setOnAction(e -> {
						window.setScene(step2);
						window.setTitle("Wizard :: Step 2");
					});
					nextStep.setOnAction(e -> System.exit(0));
				}
			} else {
				nextStep.setText("Ir p/ Passo " + (sceneNum + 1) + " >>");
				nextStep.setOnAction(e -> {
					window.setScene(step2);
					window.setTitle("Wizard :: Step 2");
				});
			}

			HBox box = new HBox();
			box.setAlignment(Pos.CENTER);
			if (sceneNum > 1) {
				box.getChildren().add(previousStep);
			}
			box.getChildren().add(nextStep);

			setScene(sceneNum, box);
		}
	}

	private void setScene(int sceneNum, HBox box) {
		if (sceneNum == 1) {
			step1 = new Scene(box, 400, 400);
		} else if (sceneNum == 2) {
			step2 = new Scene(box, 400, 400);
		} else if (sceneNum == 3) {
			step3 = new Scene(box, 400, 400);
		}
	}

	public static void main(String[] args) {
		launch(args);
	}
}