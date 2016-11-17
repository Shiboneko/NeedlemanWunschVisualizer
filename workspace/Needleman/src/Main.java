import javafx.application.*;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
public class Main extends Application{

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		System.out.println("Hallo!");
		launch(args);

	}

	@Override
	public void start(Stage primaryStage) throws Exception {
	    HBox root = new HBox(); 
	    Scene scene = new Scene(root, 300, 250);
	    primaryStage.setScene(scene);
	    primaryStage.setTitle("Needleman-Wunsch-Visualizer");
	    primaryStage.show();
	    
		
	}

}
