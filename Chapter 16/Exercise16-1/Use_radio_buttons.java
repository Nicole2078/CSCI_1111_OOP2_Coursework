/*
Author: Nicole Hackler
Date: 9/22/2023

Exercise 16 - 1
(Use radio buttons) Write a GUI program as shown below. you can use buttons to move the message to
the left and right and use the radio buttons to change the color for the message displayed. The text
should not go ff the pane.
 */
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.text.*;
import javafx.scene.paint.Color;

public class Use_radio_buttons extends Application {
    Text text = new Text(100, 80, "Programming is fun");

    protected BorderPane getPane() {
        //Hbox for buttons left and right
        HBox paneForButtons = new HBox(10);
        Button btLeft = new Button("<=");
        Button btRight = new Button("=>");
        paneForButtons.getChildren().addAll(btLeft, btRight);
        paneForButtons.setAlignment(Pos.CENTER);

        //Hbox for radio color buttons
        HBox paneForRadio = new HBox(10);
        RadioButton rbRed = new RadioButton("Red");
        RadioButton rbYellow = new RadioButton("Yellow");
        RadioButton rbBlack = new RadioButton("Black");
        RadioButton rbOrange = new RadioButton("Orange");
        RadioButton rbGreen = new RadioButton("Green");
        paneForRadio.getChildren().addAll(rbRed, rbYellow, rbBlack, rbOrange, rbGreen);
        paneForRadio.setAlignment(Pos.CENTER);

        //Group for radio buttons to keep only one selected
        ToggleGroup group = new ToggleGroup();
        rbRed.setToggleGroup(group);
        rbYellow.setToggleGroup(group);
        rbBlack.setToggleGroup(group);
        rbOrange.setToggleGroup(group);
        rbGreen.setToggleGroup(group);

        //Placing both HBox on the pane
        BorderPane pane = new BorderPane();
        pane.setBottom(paneForButtons);
        pane.setTop(paneForRadio);

        //Placing text in the middle of the pane
        Pane paneForText = new Pane();
        paneForText.getChildren().add(text);
        pane.setCenter(paneForText);

        btLeft.setOnAction(e ->
            {text.setX(text.getX() > 0 ? text.getX() - 10 : 0);
                }); // moving the text left with a boundary
        btRight.setOnAction(e -> {
            text.setX(text.getX() < pane.getWidth() - 175 ?
                    text.getX()  + 10 : pane.getWidth() - 175);
        }); // moving the text right with boundary
        //Radio color red
        rbRed.setOnAction(e -> {
            if (rbRed.isSelected()) {
                text.setFill(Color.RED);
            }
        });
        //Radio color yellow
        rbYellow.setOnAction(e -> {
            if (rbYellow.isSelected()) {
                text.setFill(Color.YELLOW);

            }
        });
        //Radio color Black
        rbBlack.setOnAction(e -> {
            if (rbBlack.isSelected()) {
                text.setFill(Color.BLACK);
            }
        });
        //Radio color orange
        rbOrange.setOnAction(e -> {
            if (rbOrange.isSelected()) {
                text.setFill(Color.ORANGE);
            }
        });
        //Radio color green
        rbGreen.setOnAction(e -> {
            if (rbGreen.isSelected()) {
                text.setFill(Color.GREEN);
            }
        });

        return pane;
    }

    @Override // Override the start method in the Application class
    public void start(Stage primaryStage) {
        //To make the text stand out more when changing the color
        text.setFont(Font.font("Times New Roman", FontWeight.BOLD, 20));

        // Create a scene and place it in the stage
        Scene scene = new Scene(getPane(), 450, 200);
        primaryStage.setTitle("Using radio buttons"); // Set the stage title
        primaryStage.setScene(scene); // Place the scene in the stage
        primaryStage.show(); // Display the stage
    }
    public static void main(String[] args){
        launch(args);
    }
}
