package sample;

import javafx.application.Application;
import javafx.stage.Stage;


public class Main extends Application {
    /**
     * Stage is for scene
     */
    public Stage primaryStage;

    /**
     * Start method for application
     * Initialize model controller and view
     * @param primaryStage stage
     * @throws Exception exception
     */
    @Override
    public void start(Stage primaryStage) throws Exception{
        this.primaryStage = primaryStage;
        this.primaryStage.setTitle("Border");
        Model model = new Model();
        Controller controller = new Controller(model);
        View view = new View(primaryStage, controller, model);
    }

    public static void main(String[] args) {
        launch(args);
    }
}
