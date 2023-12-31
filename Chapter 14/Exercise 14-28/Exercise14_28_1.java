/**
 Author: Nicole Hackler
 Date: 9/13/2023

 (Random time) Modify the ClockPane class with three new Boolean properties
 -hourHandVisible, minuteHandVisible, and secondHandVisible - and have their
 associated accessor and mutator methods. You can use the set methods to make
 a hand visible or invisible.

 Write a test program that displays only the hour and minute hands. the hour and
 minute values are randomly generated. The hour is between 0 and 11, and the
 minute is either 0 or 30.
 */
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Exercise14_28_1 extends Application {
    @Override // Override the start method in the Application class
    public void start(Stage primaryStage) {
        // Create a clock and a label
        ClockPane clock = new ClockPane();
        String timeString = clock.getHour() + ":" + clock.getMinute() + ":" + clock.getSecond();
        Label lblCurrentTime = new Label(timeString);

        // Place clock and label in border pane
        BorderPane pane = new BorderPane();
        pane.setCenter(clock);
        pane.setBottom(lblCurrentTime);
        BorderPane.setAlignment(lblCurrentTime, Pos.TOP_CENTER);

        // Create a scene and place it in the stage
        Scene scene = new Scene(pane, 250, 250);
        primaryStage.setTitle("DisplayClock"); // Set the stage title
        primaryStage.setScene(scene); // Place the scene in the stage
        primaryStage.show(); // Display the stage
    }
    public static void main(String[] args) {
        Application.launch(args);
    }
}
class ClockPane extends Pane {
    private int hour;
    private int minute;
    private int second;
    private boolean minuteHandVisible = true;
    private boolean secondHandVisible = false; //changed to false so it will be colored white
    private boolean hourHandVisible = true;

    /** Construct a default clock with the current time*/
    public ClockPane() {
        setCurrentTime();
    }

    /** Construct a clock with specified hour, minute, and second */
    public ClockPane(int hour,int minute,int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    /** Return hour */
    public int getHour() {
        return hour;
    }

    /** Set a new hour */
    public void setHour(int hour) {
        this.hour = hour;
        paintClock();
    }

    /** Return minute */
    public int getMinute() {
        return minute;
    }

    /** Set a new minute */
    public void setMinute(int minute) {
        this.minute = minute;
        paintClock();
    }

    /** Return second */
    public int getSecond() {
        return second;
    }

    /** Set a new second */
    public void setSecond(int second) {
        this.second = second;
        paintClock();
    }

    /** Get hour hand visible */
    public boolean isHourHandVisible() {
        return hourHandVisible;
    }

    /** Set hour hand Visible */
    public void setHourHandVisible(boolean hourHandVisible) {
        this.hourHandVisible = hourHandVisible;
    }

    /** Get minute hand visible */
    public boolean isMinuteHandVisible() {
        return minuteHandVisible;
    }

    /** Set minute hand visible */
    public void setMinuteHandVisible(boolean minuteHandVisible) {
        this.minuteHandVisible = minuteHandVisible;
    }

    /** Get second hand visible */
    public boolean isSecondHandVisible() {
        return secondHandVisible;
    }

    /** Set second hand visible */
    public void setSecondHandVisible(boolean secondHandVisible) {
        this.secondHandVisible = secondHandVisible;
    }

    /** Set the current time for the clock */
    public void setCurrentTime() {
        // Construct a calendar for the current date and time
        Calendar calendar = new GregorianCalendar();

        // Set current hour, minute and second
        this.hour = (int)(Math.random() * 12);
        this.minute = (int)(Math.random() * 31);
        this.second = (int)(Math.random() * 61);

        paintClock(); // Repaint the clock
    }

    /** Paint the clock */
    private void paintClock() {
        // Initialize clock parameters
        double clockRadius = Math.min(getWidth(), getHeight()) * 0.8 * 0.5;
        double centerX = getWidth() / 2;
        double centerY = getHeight() / 2;

        // Draw circle
        Circle circle = new Circle(centerX, centerY, clockRadius);
        circle.setFill(Color.WHITE);
        circle.setStroke(Color.BLACK);
        Text t1 = new Text(centerX - 5, centerY - clockRadius + 12, "12");
        Text t2 = new Text(centerX - clockRadius + 3, centerY + 5, "9");
        Text t3 = new Text(centerX + clockRadius - 10, centerY + 3, "3");
        Text t4 = new Text(centerX - 3, centerY + clockRadius - 3, "6");

        // Draw second hand
        double sLength = clockRadius * 0.8;
        double secondX = centerX + sLength * Math.sin(second * (2 * Math.PI / 60));
        double secondY = centerY - sLength * Math.cos(second * (2 * Math.PI / 60));
        Line sLine = new Line(centerX, centerY, secondX, secondY);
        sLine.setStroke(Color.RED);

        // If false it will not be visible
        if (isSecondHandVisible() == false) {
            sLine.setStroke(Color.WHITE);
        }

        // Draw minute hand
        double mLength = clockRadius * 0.65;
        double xMinute = centerX + mLength * Math.sin(minute * (2 * Math.PI / 60));
        double minuteY = centerY - mLength * Math.cos(minute * (2 * Math.PI / 60));
        Line mLine = new Line(centerX, centerY, xMinute, minuteY);
        mLine.setStroke(Color.BLUE);

        //if false it will not be visible
        if (isMinuteHandVisible() == false) {
            mLine.setStroke(Color.WHITE);
        }

        // Draw hour hand
        double hLength = clockRadius * 0.5;
        double hourX = centerX + hLength * Math.sin((hour % 12 + minute / 60.0) * (2 * Math.PI / 12));
        double hourY = centerY - hLength * Math.cos((hour % 12 + minute / 60.0) * (2 * Math.PI / 12));
        Line hLine = new Line(centerX, centerY, hourX, hourY);
        hLine.setStroke(Color.GREEN);

        //if false it is not visible
        if (isHourHandVisible() == false) {
            hLine.setStroke(Color.WHITE);
        }

        getChildren().clear();
        getChildren().addAll(circle, t1, t2, t3, t4, sLine, mLine, hLine);
    }

    @Override
    public void setWidth(double width) {
        super.setWidth(width);
        paintClock();
    }

    @Override
    public void setHeight(double height) {
        super.setHeight(height);
        paintClock();
    }
}


