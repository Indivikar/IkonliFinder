package app.controller;

import java.net.URL;
import java.util.ResourceBundle;

import org.kordamp.ikonli.javafx.FontIcon;

import app.Start;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.layout.HBox;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class CMain implements Initializable {

	@FXML private Button buttonAll;
	@FXML private VBox vBoxButtonBar;
	@FXML private FlowPane flowPaneIcons;
	private HBox hBox;
	private VBox vBox;
	private Start start;
	private Stage primaryStage;
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
//		Button button = new Button();
//		
//		
//		button.setOnAction(e -> {
//			
//			System.out.println(icon.getIconCode());
//			System.out.println(icon.getIconLiteral());
//			System.out.println(icon.getIconSize());
//		});
//
//		button.setGraphic(icon);
		muiltiButtons();
	    
	}
	
    public static FontIcon customizeIkon(String id) {
        FontIcon fontIcon = new FontIcon(id);
        fontIcon.setIconSize(48);
        fontIcon.setIconColor(Color.BLACK);       
        return fontIcon;
    }
	
	private void muiltiButtons() {
		for (int i = 0; i < 10; i++) {
			Button button = new Button();
			FontIcon icon = customizeIkon("di-java");
			button.setGraphic(icon);
			flowPaneIcons.getChildren().add(button);
		}

	}
	
	public void set(Start start, Stage primaryStage) {
		this.start = start;
		this.primaryStage = primaryStage;
	}
	
}
