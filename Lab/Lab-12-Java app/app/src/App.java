import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;
import javafx.scene.paint.Color;

public class App extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Create a Label
        Label label = new Label("Welcome to JavaFX programming");
        
        // Set the text color of the Label to Magenta
        label.setTextFill(Color.MAGENTA);
        
        // Create a FlowPane and add the Label to it
        FlowPane flowPane = new FlowPane();
        flowPane.getChildren().add(label);
        
        // Set hgap and vgap for the FlowPane
        flowPane.setHgap(10);
        flowPane.setVgap(10);
        
        // Create a Scene with specified width and height
        Scene scene = new Scene(flowPane, 500, 200);
        
        // Set the title of the Stage
        primaryStage.setTitle("This is the first JavaFX Application");
        
        // Set the Scene on the Stage and show
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
