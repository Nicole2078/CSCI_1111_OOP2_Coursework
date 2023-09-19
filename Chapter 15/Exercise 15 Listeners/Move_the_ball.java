/*
Author: Nicole Hackler
Date: 9/19/2023'

(Move the ball) You will write a program that moves the ball in a pane. You should define a pane
class for displaying the ball and provide the methods for moving the ball left, right, up, and
down, as show below. Check the boundary to prevent the ball from moving out of sight completely.

**Note: Some of this code I used from the book
 */
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.scene.shape.Circle;

public class Move_the_ball extends Application {
    @Override // Override the start method in the Application class
    public void start(Stage primaryStage) {
        Circle circle = new Circle(20, 20 ,20);
        Pane pane = new Pane(circle);

        // Buttons UP, DOWN, LEFT, RIGHT in a hBox
        Button btUp = new Button("Up");
        Button btDown = new Button("Down");
        Button btLeft = new Button("Left");
        Button btRight = new Button("Right");
        HBox hBox = new HBox(btUp, btDown, btLeft, btRight);
        hBox.setSpacing(10);
        hBox.setAlignment(Pos.CENTER);

        BorderPane borderPane = new BorderPane(pane);
        borderPane.setBottom(hBox);

        // Create and register the handles using lambda expressions
        btUp.setOnAction( e -> {
            circle.setCenterY(circle.getCenterY() > 20 ? circle.getCenterY() - 5 : 20);
        });

        btDown.setOnAction(e -> {
            circle.setCenterY(circle.getCenterY() < pane.getHeight() -20 ?
                    circle.getCenterY() + 5 : pane.getHeight() - 20);
        });

        btLeft.setOnAction(e -> {
            circle.setCenterX(circle.getCenterX() > 20 ? circle.getCenterX() - 5 : 20);
        });

        btRight.setOnAction(e -> {
            circle.setCenterX(circle.getCenterX() < pane.getWidth() - 20 ?
                    circle.getCenterX() + 5 : pane.getWidth() - 20);
        });

        // Create a scene and place it in the stage
        Scene scene = new Scene(borderPane, 300, 250);
        primaryStage.setTitle("Move the Ball"); // Set title
        primaryStage.setScene(scene); // Place the scene in the stage
        primaryStage.show(); // Display the stage

    }

}
