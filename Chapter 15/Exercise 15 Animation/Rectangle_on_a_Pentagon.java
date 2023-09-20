/*
Author: Nicole Hackler
Date: 9/20/23

Exercise 15 - Animation
(Animation: rectangle on a pentagon) You will write a program that animates a rectangle
moving along the outline of a pentagon. Enable the user to resume/pause with the left/right
mouse button. The rectangle's opacity should change as it moves around the pentagon.

*/
import javafx.animation.PathTransition;
import javafx.animation.FadeTransition;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Polygon;
import javafx.stage.Stage;
import javafx.util.Duration;

public class Rectangle_on_a_Pentagon extends Application {
    @Override // Override the start method in the Application class
    public void start(Stage primaryStage) {
        // Create a pane
        Pane pane = new Pane();

        // Create a rectangle
        Rectangle rectangle = new Rectangle(0, 0, 50, 30);
        rectangle.setFill(Color.BLUE); //Cause my kid will say "why not blue, it's your favorite color"

        // Create a pentagon with desired points on the pane, using array constructor
        Polygon pentagon = new Polygon(new double[]{
                125.0, 30.0,
                200.0, 85.0,
                170.0, 165.0,
                80.0, 165.0,
                50.0, 85.0,
        });
        pentagon.setFill(Color.WHITE);
        pentagon.setStroke(Color.PURPLE); //Cause this is my kids favorite color :)

        // Add the pentagon and the rectangle to the pane
        pane.getChildren().add(pentagon);
        pane.getChildren().add(rectangle);

        // Create a path transition, the path is set to the pentagon
        PathTransition pt = new PathTransition(); //Path object
        pt.setDuration(Duration.millis(4000)); //Speed of the rectangle along the path
        pt.setPath(pentagon); //The path the rectangle will take is set to the pentagon
        pt.setNode(rectangle); //The object on the pentagon
        //Makes the rectangle (node) stay perpendicular to the pentagon (path)
        pt.setOrientation(PathTransition.OrientationType.ORTHOGONAL_TO_TANGENT);
        pt.setCycleCount(Timeline.INDEFINITE); //FINAL to run forever
        pt.play(); // Start animation

        //listeners for path on the rectangle takes on the pentagon with play and pause on the mouse button presses
        pentagon.setOnMousePressed(e -> pt.pause());
        pentagon.setOnMouseReleased(e -> pt.play());

        //Create a fade transition for the rectangle
        FadeTransition ft = new FadeTransition(Duration.millis(3000), rectangle);
        ft.setFromValue(1.0); //start opaque value (solid)
        ft.setToValue(0.1); //ending opaque value (lightest)
        ft.setCycleCount(Timeline.INDEFINITE); //FINAL to run forever
        ft.setAutoReverse(true); //Reverse so it will fade in and out
        ft.play(); // Start animation

        //listeners for the fade transition play and pause on the mouse button presses
        rectangle.setOnMousePressed(e -> ft.pause());
        rectangle.setOnMouseReleased(e -> ft.play());

        // Create a scene and place it in the stage
        Scene scene = new Scene(pane, 250, 200);
        primaryStage.setTitle("Rectangle on a Pentagon"); // Set the stage title
        primaryStage.setScene(scene); // Place the scene in the stage
        primaryStage.show(); // Display the stage
    }
}
