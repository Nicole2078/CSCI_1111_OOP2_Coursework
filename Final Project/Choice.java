/*
 * Author: Nicole Hackler
 * Date: 8/31/2023
 *
 * This is the class to create a Choice object for the final project for Objects Oriented 1
 * This class contains a getChoice(), getChoice(), setChoiceNumber(int choiceNumber), getChoiceNumber()
 * in order to set and get new Choice and to set a new "Hidden" reverence variable if needed.
 */
public class Choice {
    private String choice = "";
    private int choiceNumber = 0;
    //non-args constructor
    Choice(){
    }
    //constructor with sceneNumber and string scene
    Choice(int choiceNumber, String choice){
        this.choice = choice;
        this.choiceNumber = choiceNumber;
    }
    //Methods to get and set the data fields
    public String getChoice() {
        return this.choice;
    }
    public void setChoice(String choice) {
        this.choice = choice;
    }
    public void setChoiceNumber(int choiceNumber) {
        this.choiceNumber = choiceNumber;
    }
    public int getChoiceNumber() {
        return this.choiceNumber;
    }
}
