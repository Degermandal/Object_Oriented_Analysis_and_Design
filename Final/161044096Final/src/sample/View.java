package sample;


import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import javafx.scene.paint.*;
import javafx.scene.canvas.*;


public class View implements Observer{
    /**
     * StackPane reference
     */
    private StackPane view ;
    /**
     * controller reference
     */
    private Controller controller ;
    /**
     * Model reference
     */
    private Model model ;
    /**
     * Group reference
     */
    Group root;
    //Canvas canvas;

    /**
     * Constructor
     * @param primaryStage stage
     * @param controller controller reference
     * @param model model reference
     */
    public View(Stage primaryStage, Controller controller, Model model) {
        this.controller = controller ;
        this.model = model ;
        createAndConfigurePane(primaryStage);
    }

    /**
     * Make our Scene with buttons, textfield and canvas
     * @param s stage
     */
    private void createAndConfigurePane(Stage s) {
        root = new Group();
        view = new StackPane();

        Canvas canvas = new Canvas(1000, 600);
        view.getChildren().add(canvas);
        //---------------------------------------------
        Label label = new Label("Please enter number of person:");
        label.setFont(new Font(15));
        label.setLayoutX(1020);
        label.setLayoutY(200);
        root.getChildren().add(label);
        //--------------------------------------------
        TextField textField = new TextField();
        Button enterB = new Button("ENTER");
        //enterB.setLayoutX(1020);
        //enterB.setLayoutY(210);
        enterB.setOnAction(action -> {
            System.out.println("##  " + textField.getText() + "    " + textField.getClass().getName());
        });

        HBox box = new HBox(5);
        box.setTranslateX(1020);
        box.setTranslateY(210);
        box.setPadding(new Insets(25,5,5,0));
        box.getChildren().addAll(textField, enterB);
        root.getChildren().add(box);
        //---------------------------------------------------
        Button pauseB = new Button("PAUSE");
        pauseB.setOnAction(action -> {
            System.out.println("PAUSE");
        });

        Button continueB = new Button("CONTINUE");
        continueB.setOnAction(action -> {
            System.out.println("CONTINUE");
        });

        Button addB = new Button("ADD");
        addB.setOnAction(action -> {
            System.out.println("ADD");
        });

        HBox box2 = new HBox(8);
        box2.setTranslateX(1020);
        box2.setTranslateY(250);
        box2.setPadding(new Insets(25,5,5,0));
        box2.getChildren().addAll(pauseB,continueB,addB);
        root.getChildren().add(box2);
        //----------------------------------------------
        root.getChildren().add(view);
        view.setStyle("-fx-background-color: beige");
        Scene scene = new Scene(root, 1000, 1000);
        s.setScene(scene);
        s.show();
    }

    /**
     * Update method for Observer
     * @param x x axis
     * @param y y axis
     * @param gc GraphicsContext reference
     */
    @Override
    public void update(double x, double y, GraphicsContext gc) {
        gc.setFill(Color.rgb(255,0,0));
        gc.fillRect(x,y,5,5);

    }
}
