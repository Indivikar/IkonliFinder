package app;

import java.io.IOException;

import app.controller.CMain;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;


// Icons as SVG
//	https://labs.mapbox.com/maki-icons/editor/
//	https://feathericons.com/?query=home

//Icons as PNG
//	https://ionicons.com/v2/

// SVG to PNG
//	https://cloudconvert.com/svg-to-png
	
public class Start extends Application {

	private CMain controllerMain;	
	

	@Override
	public void start(Stage primaryStage)  {
		try {
			FXMLLoader loaderRoot  = new FXMLLoader(Start.class.getResource("view/fxml/main.fxml"));			
	        AnchorPane root = loaderRoot.load();

			Scene scene = new Scene(root);
			scene.getStylesheets().add(Start.class.getResource("/app/view/css/mainStyle.css").toExternalForm());

	        	        
			controllerMain = loaderRoot.getController();
			controllerMain.set(this, primaryStage);

			primaryStage.setOnCloseRequest((event) -> {
	    		primaryStage.close();
	    		Platform.exit();
	    		System.exit(0);
			});
	
			primaryStage.setScene(scene);
			primaryStage.setResizable(true);
			//primaryStage.setX(6000);
			primaryStage.setY(10);		
			primaryStage.show();
		
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

    @Override
    public void stop() throws Exception {
    	Platform.exit();
    	System.exit(0);
    }


    // Getter


	public static void main(String[] args) {
        launch(args);
    }

}
