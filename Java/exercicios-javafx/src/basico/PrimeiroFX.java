package basico;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class PrimeiroFX extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		Button aButton = new Button("A");
		Button bButton = new Button("B");
		Button cButton = new Button("C");
		Button dButton = new Button("D");
		Button eButton = new Button("E");
		Button fButton = new Button("F");
		Button gButton = new Button("G");
		Button hButton = new Button("H");
		Button iButton = new Button("I");
		Button jButton = new Button("J");
		Button kButton = new Button("K");
		Button lButton = new Button("L");
		Button mButton = new Button("M");
		Button nButton = new Button("N");
		Button oButton = new Button("O");
		Button pButton = new Button("P");
		Button qButton = new Button("Q");
		Button rButton = new Button("R");
		Button sButton = new Button("S");
		Button tButton = new Button("T");
		Button uButton = new Button("U");
		Button vButton = new Button("V");
		Button wButton = new Button("W");
		Button xButton = new Button("X");
		Button yButton = new Button("Y");
		Button zButton = new Button("Z");
		Button spaceButton = new Button("Space");
		Button enterButton = new Button("Enter");
		Button exitButton = new Button("Exit");
		
		aButton.setOnAction(e -> System.out.print("A"));
		bButton.setOnAction(e -> System.out.print("B"));
		cButton.setOnAction(e -> System.out.print("C"));
		dButton.setOnAction(e -> System.out.print("D"));
		eButton.setOnAction(e -> System.out.print("E"));
		fButton.setOnAction(e -> System.out.print("F"));
		gButton.setOnAction(e -> System.out.print("G"));
		hButton.setOnAction(e -> System.out.print("H"));
		iButton.setOnAction(e -> System.out.print("I"));
		jButton.setOnAction(e -> System.out.print("J"));
		kButton.setOnAction(e -> System.out.print("K"));
		lButton.setOnAction(e -> System.out.print("L"));
		mButton.setOnAction(e -> System.out.print("M"));
		nButton.setOnAction(e -> System.out.print("N"));
		oButton.setOnAction(e -> System.out.print("O"));
		pButton.setOnAction(e -> System.out.print("P"));
		qButton.setOnAction(e -> System.out.print("Q"));
		rButton.setOnAction(e -> System.out.print("R"));
		sButton.setOnAction(e -> System.out.print("S"));
		tButton.setOnAction(e -> System.out.print("T"));
		uButton.setOnAction(e -> System.out.print("U"));
		vButton.setOnAction(e -> System.out.print("V"));
		wButton.setOnAction(e -> System.out.print("W"));
		xButton.setOnAction(e -> System.out.print("X"));
		yButton.setOnAction(e -> System.out.print("Y"));
		zButton.setOnAction(e -> System.out.print("Z"));
		spaceButton.setOnAction(e -> System.out.print(" "));
		enterButton.setOnAction(e -> System.out.print("\n"));
		exitButton.setOnAction(e -> System.exit(0));
		
		
		
		
		HBox firstBox = new HBox();
		firstBox.setAlignment(Pos.CENTER);
		firstBox.getChildren().add(qButton);
		firstBox.getChildren().add(wButton);
		firstBox.getChildren().add(eButton);
		firstBox.getChildren().add(rButton);
		firstBox.getChildren().add(tButton);
		firstBox.getChildren().add(yButton);
		firstBox.getChildren().add(uButton);
		firstBox.getChildren().add(iButton);
		firstBox.getChildren().add(oButton);
		firstBox.getChildren().add(pButton);
		
		HBox secondBox = new HBox();
		secondBox.setAlignment(Pos.CENTER);
		secondBox.getChildren().add(aButton);
		secondBox.getChildren().add(sButton);
		secondBox.getChildren().add(dButton);
		secondBox.getChildren().add(fButton);
		secondBox.getChildren().add(gButton);
		secondBox.getChildren().add(hButton);
		secondBox.getChildren().add(jButton);
		secondBox.getChildren().add(kButton);
		secondBox.getChildren().add(lButton);
		
		HBox thirdBox = new HBox();
		thirdBox.setAlignment(Pos.CENTER);
		thirdBox.getChildren().add(zButton);
		thirdBox.getChildren().add(xButton);
		thirdBox.getChildren().add(cButton);
		thirdBox.getChildren().add(vButton);
		thirdBox.getChildren().add(bButton);
		thirdBox.getChildren().add(nButton);
		thirdBox.getChildren().add(mButton);
		
		HBox fourthBox = new HBox();
		fourthBox.setAlignment(Pos.CENTER);
		fourthBox.getChildren().add(spaceButton);
		fourthBox.getChildren().add(enterButton);
		fourthBox.getChildren().add(exitButton);
		
		VBox frameBox = new VBox();
		frameBox.getChildren().add(firstBox);
		frameBox.getChildren().add(secondBox);
		frameBox.getChildren().add(thirdBox);
		frameBox.getChildren().add(fourthBox);
		
		Scene onlyScene = new Scene(frameBox, 270, 100);
		
		primaryStage.setScene(onlyScene);
		
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
