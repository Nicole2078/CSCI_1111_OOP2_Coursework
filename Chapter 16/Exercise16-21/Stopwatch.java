/*
Author: Nicole Hackler
Date: 10/03/2003

Exercise 16-21
(Count_down stopwatch) Write a program that allows the user to enter time in seconds
in the text field and press the Enter key to count down the seconds, as shown below.
The remaining seconds are redisplayed every one second. When the seconds are expired.
the program starts to play music continuously.

Use this UTL for your Media:
https://liveexample.pearsoncmg.com/common/audio/anthem/anthem0.mp3
 */
import javafx.animation.Timeline;
import javafx.animation.KeyFrame;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.geometry.Insets;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.StackPane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.util.Duration;

public class Stopwatch extends Application {
    //Timeline to control the animation of counting down and playing music
    TextField tf = new TextField(); //Creating a text field
    Timeline timer = new Timeline(new KeyFrame(Duration.millis(1000), e -> {
        String userText = tf.getText(); //Getting user text from field
        Integer newText = Integer.parseInt(userText); //Changing user string to an integer value
        newText--; //Counting down
        //if statement to control when the seconds reach 0 to play music and stop the countdown
        if (newText == 0) {
            timerStop();
        }
        tf.setText(newText.toString());
    }));

    //Creating a Media and media player for the song
    Media media = new Media(MEDIA_URL);
    MediaPlayer mp = new MediaPlayer(media);
    private static final String MEDIA_URL =
            "https://liveexample.pearsoncmg.com/common/audio/anthem/anthem0.mp3";

    @Override //Override the start method in the Application class
    public void start (Stage primaryStage){
        timer.setCycleCount(Timeline.INDEFINITE);
        //Enter Key press action
        tf.setOnKeyPressed(ev -> {
            if (ev.getCode() == KeyCode.ENTER)
            timer.play();
        });

        tf.setAlignment(Pos.CENTER); //Setting the text to the center of the text field
        tf.setText("Enter Seconds");

        StackPane pane = new StackPane(); // making a pane
        pane.setPadding(new Insets(5,5,5,5));
        pane.getChildren().add(tf); //Adding the text field to the pane

        Scene scene = new Scene(pane, 230, 35);
        primaryStage.setTitle("Stopwatch"); //Set the stage title
        primaryStage.setScene(scene); //Place the scene in the stage
        primaryStage.show(); //Display the stage
    }

    //Method for when the timer reaches "0"
    public void timerStop(){
        timer.stop();
        mp.play();
        mp.setCycleCount(1000);
    }

    //Main method
    public static void main(String[] args){
        launch(args);
    }
}

