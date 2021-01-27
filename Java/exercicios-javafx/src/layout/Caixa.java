package layout;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;

public class Caixa extends HBox {
	
	private static int i = 0;

	private String[] colors = {
		"#c33c5e", "#39aac6", "#28d79a",
		"#fb750e", "#6657a8", "#f9060e"
	};
	
	public Caixa() {
		this(100, 100);
	}
	
	public Caixa(int width, int height) {
		setAlignment(Pos.CENTER);
		setMinWidth(width);
		setMinHeight(height);
		
		BackgroundFill fill = new BackgroundFill(
				Color.web(colors[i]), CornerRadii.EMPTY, Insets.EMPTY
				);
		setBackground(new Background(fill));
		
		i++;
		
		if(i == 6) i = 0;
		
	}
	
	public Caixa comTexto(String texto) {
		Label label = new Label(texto);
		label.setFont(new Font(24));
		getChildren().add(label);
		return this;
	}	
}
