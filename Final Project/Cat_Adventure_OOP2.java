/*
 * Author: Nicole Hackler
 * Date: 10/00/2023
 *
 * This is my Final Project for Objects Oriented Programming 2.
 * This is a modified version of a previous projects. I've created on object called Choice and placed it in
 * an array.
 *
 * *** Note:There is a "Hidden" variable for each scene, this is for my notes of knowing what choice and
 * reaction is tied together in the methods below. there is notes on each one knowing where they go to next
 * for debugging purposes. For now the Int variable has nothing for the program but to help me keep track of
 * the scenes. ***
 *
 * *The shortest way through the story is to use the 2nd option the whole way, FYI.*
 */
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Cat_Adventure_OOP2 extends Application {
    static TextArea textArea = new TextArea(); //Class wide variables
    static HBox buttonsHBox = new HBox(35);
    @Override
    public void start(Stage primaryStage) {
        BorderPane bPane = new BorderPane(); //Creating boarder pane
        Button[] btArray = new Button[3]; //Array for buttons
        btArray[0] = new Button("1");
        btArray[1] = new Button("2");
        btArray[2] = new Button("3");
        btArray[0].setMinWidth(50); //Setting the size for the buttons to be bigger then the number
        btArray[1].setMinWidth(50);
        btArray[2].setMinWidth(50);

        Choice[] choices = new Choice[39]; //Creating the array for the objects
        //Array of objects containing the different scenes, the "hidden" number is for reference to the Scene (reaction) numbers
        choices[0] = new Choice(0, "You blink, yawn and look comfy. You sun sunbathe for awhile longer, and then something catches your eyes outside.\n");
        choices[1] = new Choice(1, "Stepping down from the window, you take a stretch and yawn one more time. Time to go in search for your owner.\n");
        choices[2] = new Choice(2, "Your owner doesn't come right away. \"MEOW!!\" You make your voice heard until they do. When you see them you stretch BIG and touch the handle of the door to let us out, as they open the door you race outside to see what we can find!\n");
        choices[3] = new Choice(3, "You walk through the doorway and see your owner inside. \"MEOW!!\" You get their attention and rub your body between their legs, then walk back to the door leading outside. Your owner follows you as you reach the door you \"Meow\" one more time to let them know you want outside. They open the door to let you out. Where to start exploring?\n");
        choices[4] = new Choice(4, "Stepping into the living room you do not see your owner. What do you do?\n");
        choices[5] = new Choice(8, "Jumping down from the windowsill and prance to the door. Looking back to see if your owner is following. They are you meow loudly again, as they open the door you race outside to start exploring! Where to start?\n");
        choices[6] = new Choice(9, "As you get close to the bushes, out jump two dogs! \"HISSSS\" You run as fast as you can into the forest behind the house to get away.\n");
        choices[7] = new Choice(10, "You start sniffing around, and looking under the underbrush. Something catches your eyes inside the forest.\n");
        choices[8] = new Choice(11, "You climb up the nearest tree, and your little heart is pounding. Up here you can see everything, the mountains, the forest, and even your house. What do you do?\n");
        choices[9] = new Choice(12, "You keep running, your heart is just pounding. After some time you realize you are alone and lost. What do you do?\n");
        choices[10] = new Choice(13, "You see there is no way down without getting attacked by the dogs. You find a nice branch and soon fall asleep tucked up in the tree. You are awoken to your owner's voice calling your name. Looking down you see the dogs are gone and it's safe to climb down. As you hit the forest floor on all four you take off in the direction of the familiar voice.\n");
        choices[11] = new Choice(14, "\"MEEEOOOOW!!\" You meow loud over and over. This causes the dogs to bark even louder.\n");
        choices[12] = new Choice(15, "The dogs keep barking, but in the distance you hear a door close. You can see your owner heading in this direction. Do you jump down and try to run out run the dogs to get to your owner?\n");
        choices[13] = new Choice(17, "You try to climb down the tree, but the dogs start jumping at you. You become even more frightened and climb higher into the tree. What now?\n");
        choices[14] = new Choice(18, "\"MEOW, MEEOOOW!!\" You hear your owner's voice, so you meow even more so they know you are there. They see you are in the tree, and scare the dogs away. Seeing the dogs running away you climb down the tree to reach your owner. You feel safe in their arms as they walk you back home.\n");
        choices[15] = new Choice(20, "As you climb further up the tree you see a branch from another tree. Do you stay and meow or are are you brave enough to jump?\n");
        choices[16] = new Choice(22, "You jump to the branch, the dogs follow you on the ground. You are trapped. \"MEOW!\" Crying out as loud as you can. You hear your owner's voice. They are yelling at the dogs and manage to scare them away from you. \"Meow, Meow.\" Climbing down to your owner's are, you are safe now.\n");
        choices[17] = new Choice(23, "Curiosity of a cat leads you to the underbrush. You hear rustling in the brushes, the hair on your back stands up... \"HHHIIISSS!\" Out jump wild dogs!\n");
        choices[18] = new Choice(24, "Curiosity of a cat gets you wondering further into the forest, or does it?\n");
        choices[19] = new Choice(25, "Everything outside doesn't catch your interest at all, you'd rather be inside getting pets and love from your owner. As you head across the back yard you hear rustling in the bushes..?\n");
        choices[20] = new Choice(26, "Your eyes and ears find a bee wondering from flower to flower.\n");
        choices[21] = new Choice(27, "You ignore the noise and head home. As you reach the door leading inside, \"MEOW!\" you meow loudly until your owner opens the door for you. You greet them with \"meow, meow,\" and rubbing your body all over their legs. You are safe and sound, just the purrrrfect day.\n");
        choices[22] = new Choice(30, "The noise from the the bee's wings are so catching. You stalk the bee moving around a patch of flowers. You make yourself as small as you can and your back legs start to wiggle. SPRING! You jump on the bee, but it hurts. \"RWAAR, MEOOW!\" You cry out in pain. you try to run away from the hurt.\n");
        choices[23] = new Choice(31, "Slowly making your way back, you smell as you go, then you catch the smell of something canine. What do you do?\n");
        choices[24] = new Choice(32, "You start exploring some more and hear the sound of running water. Do you choose to investigate the water sound or explore a different direction?\n");
        choices[25] = new Choice(34, "As you venture back the way you came. the smell of the canine disappears.\n");
        choices[26] = new Choice(35, "As you smell your way back, you hear a voice calling your name. This makes you pick up the pace and run, you know its dinner time, and this adventure has made you hungry. You come out of the forest seeing your owner standing there waiting to greet you. \"MEOW!\"\n");
        choices[27] = new Choice(37, "Coming through the underbrush you see a little stream and a tiny waterfall.\n");
        choices[28] = new Choice(38, "Something catches your eyes, its movement. It doesn't sound scary and you want to investigate.\n");
        choices[29] = new Choice(40, "You feel sleepy and find a nice little space up against a tree to fall asleep. You are woken by noises in the underbrush, it catches you off guard.\n");
        choices[30] = new Choice(41, "You follow the small stream and see a den like opening. Do you venture close?\n");
        choices[31] = new Choice(42, "You are so sleepy your survival instinct kicks in. You start running, as you get further away from the sound of water you hear a familiar voice. You are still frightened by the sound that woke you.\n");
        choices[32] = new Choice(43, "You see an empty decaying log and rush to get inside. Just as you do you hear a familiar voice, \"There you are. I've been looking for you everywhere.\" You stop and are instantly excited, your owner has found you. \"MEOW!!\" You start rubbing all over their legs. \"PppUURrrr.\" You start purring, they pick you up and walk you out of the forest. You know it's dinner time are you are HUNGRY!\n");
        choices[33] = new Choice(45, "As you keep running you feel as if something is chasing you. You're scared, but you hear a distant sound that is familiar to you. You hear the sound of your owner's voice this makes you know you are close to home. Plus your stomach is grumbling. You pick up the pace and run across the forest floor, coming out from under the underbrush seeing your owner standing there waiting for you with a big smile.\n");
        choices[34] = new Choice(46, "As you venture close to the opening of the den, the hair on your back starts to stand up and the air doesn't smell right.\n");
        choices[35] = new Choice(47, "The hair on your back starts to stand up. Your body is telling you \"NO WAY ARE WE GOING IN THERE!\" The sun is going down.\n");
        choices[36] = new Choice(52, "You get into your 'pounce' stance and decide to go for it! Just as you land you catch a mouse. You hear your owner's voice calling your name. They will be so happy to see the mouse you've caught! You prance off with your price for the day. \"Pppuuurrr.\" You purr the whole way home.\n");
        choices[37] = new Choice(52, "Just as you decide to chase the movement it goes quiet and you can't find it. The sun is fading, you can hear the sound of your owner's voice. It's dinner time!\n");
        choices[38] = new Choice(54, "\n\t\t\t\tThanks for reading and exploring. \n\t\t\t\t\t\t THE END");
        //choices[40] = new Choice(55, "As you smell your way back, you hear a voice calling your name. This makes you pick up the pace and run, you know its dinner time, and this adventure has made you hungry. You come out of the forest seeing your owner standing there waiting to greet you. \"MEOW!\"\n"); //Copy of Choice[35] but without buttons

        //Title and the beginning of the adventure

        textArea.setText("Welcome to choose your own adventure. Please press a button to progress the story.\n");
        textArea.appendText("\t\t_______________________________________________________\n \n");
        textArea.appendText("Your day starts off inside your cozy home.\n");

        // start of the options made be the reader
        textArea.appendText("Looking out the window, your owner comes by and asks, \"do you want to go outside?\"\n \n");
        textArea.appendText("1: \"meow\" (want to stay inside)\n \n");
        textArea.appendText("2: \"MEOW!\" (want to go outside YES!)");

        //First choices to start the story
        btArray[0].setOnAction(e -> {
            choice0(choices, btArray); //choice 0 / Reaction 0
        });

        btArray[1].setOnAction(e -> {
            choice8(choices, btArray); //choice 8 / Reaction 8
        });

        //Text area properties
        textArea.setMaxWidth(400);
        textArea.setMaxHeight(405);
        textArea.setWrapText(true);
        textArea.setEditable(false);
        //Hbox properties
        buttonsHBox.setPadding(new Insets(10,10,10,10));
        buttonsHBox.setAlignment(Pos.CENTER);
        buttonsHBox.getChildren().addAll(btArray[0], btArray[1]);

        bPane.setCenter(textArea); //Setting text area
        bPane.setBottom(buttonsHBox); //setting Hbox for buttons
        Scene scene = new Scene(bPane, 400, 450); //Creating the scene
        primaryStage.setTitle("Cat Adventure"); //Set stage and title
        primaryStage.setScene(scene); //Place scene on the stage
        primaryStage.setResizable(false);
        primaryStage.show(); //Display the stage
    } //end of Start method
    //** Choice methods... **
    //Choice0 method begin
    public static void choice0(Choice[] choices, Button[] btArray) {
        textArea.setText(choices[0].getChoice() + "\n\n\n1: Find owner to go outside.\n\n " +
                "\n2: Meow loudly at the door. \"MEOW!\"");//choice0 / reaction 0
        buttonsHBox.getChildren().clear();
        buttonsHBox.getChildren().addAll(btArray[0], btArray[1]);

        btArray[0].setOnAction(e -> {
            choice1(choices, btArray); //choice 1 / reaction 1
        });

        btArray[1].setOnAction(e -> {
            choice2(choices, btArray); //choice 2 / reaction 2
        });
    } //Choice0 method end
    //Choice1 method begin
    public static void choice1(Choice[] choices, Button[] btArray) {
        textArea.setText(choices[1].getChoice() + "\n \n1: Look for owner in the bedroom?\n"
                + "\n2: Look for owner in the living room?\n \n3: Change your mind and meow "
                + "loudly at the door?");//choice 1 / reaction 1
        buttonsHBox.getChildren().clear();
        buttonsHBox.getChildren().addAll(btArray[0], btArray[1], btArray[2]);

        btArray[0].setOnAction(e -> {
            choice3(choices, btArray); //choice 3 / to outside (9/10)
        });

        btArray[1].setOnAction(e -> {
            choice4(choices, btArray); //choice 4 / reaction 4
        });

        btArray[2].setOnAction(e -> {
            choice2(choices, btArray); //choice 7 goes to reaction 2
        });
    }//Choice1 method end
    //Choice2 method begin
    public static void choice2(Choice[] choices, Button[] btArray) {
        textArea.setText(choices[2].getChoice() + "\n \n1: Rustling in the bushes?..\n \n"
                + "2: Edge of the forest?.."); //choice 2 / reaction 2);
        buttonsHBox.getChildren().clear();
        buttonsHBox.getChildren().addAll(btArray[0], btArray[1]);

        btArray[0].setOnAction(e -> {
            choice9(choices, btArray); //choice 9 / reaction 6
        });

        btArray[1].setOnAction(e -> {
            choice10(choices, btArray); //choice 10 / reaction 7
        });
    } //Choice2 method end
    //Choice3 method begin
    public static void choice3(Choice[] choices, Button[] btArray) {
        textArea.setText(choices[3].getChoice() + "\n \n1: Rustling in the bushes?..\n \n"
                + "2: Edge of the forest?.."); //choice 3 / reaction 3
        buttonsHBox.getChildren().clear();
        buttonsHBox.getChildren().addAll(btArray[0], btArray[1]);

        btArray[0].setOnAction(e -> {
            choice9(choices, btArray); //choice 9 / reaction 6
        });

        btArray[1].setOnAction(e -> {
            choice10(choices, btArray); //choice 10 / reaction 7
        });
    } //Choice3 method end
    //Choice3 method begin
    public static void choice4(Choice[] choices, Button[] btArray) {
        textArea.setText(choices[4].getChoice() + "\n \n1: Look for owner in the bedroom?\n \n"
                + "2: Go back to the door and \"MEOW\" at the door?"); //choice 4 / reaction 4
        buttonsHBox.getChildren().clear();
        buttonsHBox.getChildren().addAll(btArray[0], btArray[1]);

        btArray[0].setOnAction(e -> {
            choice3(choices, btArray); //choice 5 / reaction 3
        });

        btArray[1].setOnAction(e -> {
            choice2(choices, btArray); //choice 6 / reaction 2 to outside (9/10)
        });
    } //Choice3 method end
    //Choice8 method begin
    public static void choice8(Choice[] choices, Button[] btArray) {
        textArea.setText(choices[5].getChoice() + "\n \n1: Rustling in the bushes?..\n \n"
                + "2: Edge of the forest?.."); //choice 8 / reaction 5
        buttonsHBox.getChildren().clear();
        buttonsHBox.getChildren().addAll(btArray[0], btArray[1]);

        btArray[0].setOnAction(e -> {
            choice9(choices, btArray); //choice 9 / reaction 6
        });

        btArray[1].setOnAction(e -> {
            choice10(choices, btArray); //choice 10 / reaction 7
        });
    } //Choice8 method end
    //Choice9 method begin
    public static void choice9(Choice[] choices, Button[] btArray) {
        textArea.setText(choices[6].getChoice() + "\n \n1: Climb a tree!?!?\n \n"
                + "2: or continue to run further into the forest?"); //choice 9 / reaction 6
        buttonsHBox.getChildren().clear();
        buttonsHBox.getChildren().addAll(btArray[0], btArray[1]);

        btArray[0].setOnAction(e -> {
            choice11(choices, btArray); //choice 11 / reaction 8
        });

        btArray[1].setOnAction(e -> {
            choice12(choices, btArray); //choice 12 / reaction 9
        });
    } //Choice9 method end
    //Choice10 method begin
    public static void choice10(Choice[] choices, Button[] btArray) {
        textArea.setText(choices[7].getChoice() + "\n \n1: Do you stay exploring the yard?\n \n"
                + "2: Head off into the forest to see what the movement is.."); //choice 10 / reaction 7
        buttonsHBox.getChildren().clear();
        buttonsHBox.getChildren().addAll(btArray[0], btArray[1]);

        btArray[0].setOnAction(e -> {
            textArea.setText(choices[17].getChoice() + "\n \n"); //choice 23 / reaction 17
                    choice9(choices, btArray); // returns to choice 9
        });

        btArray[1].setOnAction(e -> {
            choice24(choices, btArray); //choice 24 / reaction 18
        });
    } //Choice10 method end
    //Choice11 method begin (story ending in this method)
    public static void choice11(Choice[] choices, Button[] btArray) {
        textArea.setText(choices[8].getChoice() + "\n \n1: \"MEOW!!\" meow loud as you can in hopes your owner hears you?"
                + "\n \n2: Wait the dogs out?"); //choice 11 / reaction 8
        buttonsHBox.getChildren().clear();
        buttonsHBox.getChildren().addAll(btArray[0], btArray[1]);

        btArray[0].setOnAction(e -> {
            choice14(choices, btArray); //choice 14 / reaction 11
        });

        btArray[1].setOnAction(e -> {
            textArea.setText(choices[13].getChoice() + "\n \n"); //choice 13 / reaction 10
                textArea.appendText(choices[38].getChoice()); //Ending to story
            buttonsHBox.getChildren().clear(); //Clear buttons for ending
        });
    } //Choice11 method end
    //Choice12 method begin
    public static void choice12(Choice[] choices, Button[] btArray) {
        textArea.setText(choices[9].getChoice() + "\n \n1: Dare to back track your steps?\n \n"
                + "2: Too scared to go back that way? Find a new path."); //choice 12 / reaction 9
        buttonsHBox.getChildren().clear();
        buttonsHBox.getChildren().addAll(btArray[0], btArray[1]);

        btArray[0].setOnAction(e -> {
            choice31(choices, btArray); //choice 31 / reaction 23
        });

        btArray[1].setOnAction(e -> {
            choice32(choices, btArray); //choice 32 / reaction 24
        });
    } //Choice12 method end
    //Choice14 method begin (story ending in this method)
    public static void choice14(Choice[] choices, Button[] btArray) {
        textArea.setText(choices[11].getChoice() + "\n \n1: Keep meowing? \"MEOW!!\"\n \n"
                + "2: Wait the dogs out?"); //choice 14 / reaction 11
        buttonsHBox.getChildren().clear();
        buttonsHBox.getChildren().addAll(btArray[0], btArray[1]);

        btArray[0].setOnAction(e -> {
            choice15(choices, btArray); //choice 15 / reaction 12
        });

        btArray[1].setOnAction(e -> {
            textArea.setText(choices[13].getChoice() + "\n \n"); //choice 16 / reaction 10
                textArea.appendText(choices[38].getChoice()); //Ending to story
            buttonsHBox.getChildren().clear(); //Clear buttons for ending
        });
    } //Choice14 method end
    //Choice15 method begin (story ending in this method)
    public static void choice15(Choice[] choices, Button[] btArray) {
        textArea.setText(choices[12].getChoice() + "\n \n1: Jump down and make a run for it!\n \n"
                + "2: Meow loader and draw your owner to you."); //choice 15 / reaction 12
        buttonsHBox.getChildren().clear();
        buttonsHBox.getChildren().addAll(btArray[0], btArray[1]);

        btArray[0].setOnAction(e -> {
            choice17(choices, btArray); //choice 17 / reaction 13
        });

        btArray[1].setOnAction(e -> {
            textArea.setText(choices[14].getChoice() + "\n \n"); //choice 18 / reaction 14
                textArea.appendText(choices[38].getChoice()); //Ending to story
            buttonsHBox.getChildren().clear(); //Clear buttons for ending
        });
    } //Choice15 method end
    //Choice17 method begin (story ending in this method)
    public static void choice17(Choice[] choices, Button[] btArray) {
        textArea.setText(choices[13].getChoice() + "\n \n1: Continue to Meow so your owner will hear your voice?"
                + "\n \n2: Climbing further up the tree?"); //choice 17 / reaction 13
        buttonsHBox.getChildren().clear();
        buttonsHBox.getChildren().addAll(btArray[0], btArray[1]);

        btArray[0].setOnAction(e -> {
            textArea.setText(choices[14].getChoice() + "\n \n"); //choice 19 / reaction 14
                textArea.appendText(choices[38].getChoice()); //Ending to story
            buttonsHBox.getChildren().clear(); //Clear buttons for ending
        });

        btArray[1].setOnAction(e -> {
            choice20(choices, btArray); //choice 20 / reaction 15
        });
    } //Choice17 method end
    //Choice20 method begin (story ending in this method)
    public static void choice20(Choice[] choices, Button[] btArray) {
        textArea.setText(choices[15].getChoice() + "\n \n1: Jump down and make a run for it!\n \n"
                + "2: Meow loader and draw your owner to you."); //choice 20 / reaction 15
        buttonsHBox.getChildren().clear();
        buttonsHBox.getChildren().addAll(btArray[0], btArray[1]);

        btArray[0].setOnAction(e -> {
            textArea.setText(choices[14].getChoice() + "\n \n"); //choice 21 / reaction 14
                textArea.appendText(choices[38].getChoice()); //Ending to story
            buttonsHBox.getChildren().clear(); //Clear buttons for ending
        });

        btArray[1].setOnAction(e -> {
            textArea.setText(choices[16].getChoice() + "\n \n"); //choice 22 / reaction 16
                textArea.appendText(choices[38].getChoice()); //Ending to story
            buttonsHBox.getChildren().clear(); //Clear buttons for ending
        });
    } //Choice20 method end
    //Choice 24 method begin
    public static void choice24(Choice[] choices, Button[] btArray) {
        textArea.setText(choices[18].getChoice() + "\n \n1: Decide to go home..\n \n"
                + "2: Let curiosity take you.."); //choice 24 / reaction 18
        buttonsHBox.getChildren().clear();
        buttonsHBox.getChildren().addAll(btArray[0], btArray[1]);

        btArray[0].setOnAction(e -> {
            choice25(choices, btArray); //choice 25 / reaction 19
        });

        btArray[1].setOnAction(e -> {
            choice26(choices, btArray); //choice 26 / reaction 20
        });
    } //Choice 24 method end
    //Choice25 method begin (story ending in this method)
    public static void choice25(Choice[] choices, Button[] btArray) {
        textArea.setText(choices[19].getChoice() + "\n \n1: Ignore the bushes and head to the back door.\n \n"
                + "2: The noise in the bushes is calling your name."); //choice 25 / reaction 19
        buttonsHBox.getChildren().clear();
        buttonsHBox.getChildren().addAll(btArray[0], btArray[1]);

        btArray[0].setOnAction(e -> {
            textArea.setText(choices[21].getChoice() + "\n \n"); //choice 27 / reaction 21
                textArea.appendText(choices[38].getChoice()); //Ending to story
            buttonsHBox.getChildren().clear(); //Clear buttons for ending
        });

        btArray[1].setOnAction(e -> {
            choice9(choices, btArray); //choice 28, returns to choice 9
        });
    } //Choice 25 method end
    //Choice26 method begin
    public static void choice26(Choice[] choices, Button[] btArray) {
        textArea.setText(choices[20].getChoice() + "\n \n1: See whats in the bushes..\n \n"
                + "2: Continue to follow the bee as his little noises and movement keep your attention..");
                                                                        //choice 26 / reaction 20
        buttonsHBox.getChildren().clear();
        buttonsHBox.getChildren().addAll(btArray[0], btArray[1]);

        btArray[0].setOnAction(e -> {
            choice9(choices, btArray); //choice 30, returns to choice 9
        });

        btArray[1].setOnAction(e -> {
            textArea.setText(choices[22].getChoice() + "\n \n"); //choice 30 / reaction 22
                choice12(choices, btArray); //returns to choice 12
        });
//        }
    } //Choice26 method end
    //Choice31 method begin
    public static void choice31(Choice[] choices, Button[] btArray) {
        textArea.setText(choices[23].getChoice() + "\n \n1: Go back and find a new path?\n \n"
                + "2: Continue in hope there are no dogs?"); //choice 31 / reaction 23
        buttonsHBox.getChildren().clear();
        buttonsHBox.getChildren().addAll(btArray[0], btArray[1]);

        btArray[0].setOnAction(e -> {
            choice32(choices, btArray); //choice 33 / reaction 24 (returns to choice 32)
        });

        btArray[1].setOnAction(e -> {
            choice34(choices, btArray); //choice 34 / reaction 25
        });
    } //Choice31 method end
    //Choice32 method begin (story ending in this method)
    public static void choice32(Choice[] choices, Button[] btArray) {
        textArea.setText(choices[24].getChoice() + "\n \n1: Investigate the water sound?\n \n"
                + "2: Choose to explore a different direction?\n \n"
                + "3: Venture back the way you came and go home?"); //choice 32 / reaction 24
        buttonsHBox.getChildren().clear();
        buttonsHBox.getChildren().addAll(btArray[0], btArray[1], btArray[2]);

        btArray[0].setOnAction(e -> {
            choice37(choices, btArray); //choice 37 / reaction 27
        });

        btArray[1].setOnAction(e -> {
            choice38(choices, btArray); //choice 38 / reaction 28
        });

        btArray[2].setOnAction(e -> {
            textArea.setText(choices[26].getChoice() + "\n \n"); //choice 39 / reaction 26
                textArea.appendText(choices[38].getChoice()); //end story
            buttonsHBox.getChildren().clear(); //Clear buttons for ending
        });
    } //Choice32 method end
    //Choice34 method begin (story ending in this method)
    public static void choice34(Choice[] choices, Button[] btArray) {
        textArea.setText(choices[25].getChoice() + "\n \n1: Keep going forward.\n \n"
                + "2: Continue to explore."); //choice 34 / reaction 25
        buttonsHBox.getChildren().clear();
        buttonsHBox.getChildren().addAll(btArray[0], btArray[1]);

        btArray[0].setOnAction(e -> {
            textArea.setText(choices[26].getChoice() + "\n \n"); //choice 35 / reaction 26
                textArea.appendText(choices[38].getChoice()); //end story
            buttonsHBox.getChildren().clear(); //Clear buttons for ending
        });

        btArray[1].setOnAction(e -> {
            choice32(choices, btArray); //choice 36 / reaction 24 (returns to choice 32)
        });
    } //Choice34 method end
    //Choice37 method begin
    public static void choice37(Choice[] choices, Button[] btArray) {
        textArea.setText(choices[27].getChoice() + "\n \n1: Take a nap.\n \n"
                + "2:Continue to explore the stream and waterfall."); //choice 37 / reaction 27
        buttonsHBox.getChildren().clear();
        buttonsHBox.getChildren().addAll(btArray[0], btArray[1]);

        btArray[0].setOnAction(e -> {
            choice40(choices, btArray); //choice 40 / reaction 29
        });

        btArray[1].setOnAction(e -> {
            choice41(choices, btArray); //choice 41 / reaction 30
        });
    } //Choice37 method end
    //Choice38 method begin (story ending in this method)
    public static void choice38(Choice[] choices, Button[] btArray) {
        textArea.setText(choices[28].getChoice() + "\n \n1: What could it hurt?\n \n"
                + "2: The sun is fading, go home."); //choice 38 / reaction 28
        buttonsHBox.getChildren().clear();
        buttonsHBox.getChildren().addAll(btArray[0], btArray[1]);

        btArray[0].setOnAction(e -> {
            textArea.setText(choices[36].getChoice() + "\n \n"); //choice 52 / reaction 36
                textArea.appendText(choices[38].getChoice()); //end story
            buttonsHBox.getChildren().clear(); //Clear buttons for ending
        });

        btArray[1].setOnAction(e -> {
            textArea.setText(choices[37].getChoice() + "\n \n"); //choice 53 / reaction 37
                textArea.appendText(choices[38].getChoice()); //end story
            buttonsHBox.getChildren().clear(); //Clear buttons for ending
        });
    } //Choice38 method end
    //Choice40 method begin (story ending in this method)
    public static void choice40(Choice[] choices, Button[] btArray) {
        textArea.setText(choices[29].getChoice() + "\n \n1: Run Away?\n \n"
                + "2: Run and hide close by and let the noise pass you by?"); //choice 40 / reaction 29
        buttonsHBox.getChildren().clear();
        buttonsHBox.getChildren().addAll(btArray[0], btArray[1]);

        btArray[0].setOnAction(e -> {
            choice42(choices, btArray); //choice 42 / reaction 31
        });

        btArray[1].setOnAction(e -> {
            textArea.setText(choices[32].getChoice() + "\n \n"); //choice 43 / reaction 32
                textArea.appendText(choices[38].getChoice()); //end story
            buttonsHBox.getChildren().clear(); //Clear buttons for ending
        });
    } //Choice40 method end
    //Choice41 method begin
    public static void choice41(Choice[] choices, Button[] btArray) {
        textArea.setText(choices[30].getChoice() + "\n \n1: Yes...\n \n"
                + "2: \"MEOW!\" No!..."); //choice 41 / reaction 30
        buttonsHBox.getChildren().clear();
        buttonsHBox.getChildren().addAll(btArray[0], btArray[1]);

        btArray[0].setOnAction(e -> {
            choice46(choices, btArray); //choice 46 / reaction 34
        });

        btArray[1].setOnAction(e -> {
            choice47(choices, btArray); //choice 47 / reaction 35
        });
    } //Choice41 method end
    //Choice42 method begin (story ending in this method)
    public static void choice42(Choice[] choices, Button[] btArray) {
        textArea.setText(choices[31].getChoice() + "\n \n1: Climb a tree?\n \n"
                + "2: Keep running?"); //choice 42 / reaction 31
        buttonsHBox.getChildren().clear();
        buttonsHBox.getChildren().addAll(btArray[0], btArray[1]);

        btArray[0].setOnAction(e -> {
            textArea.setText("You hear the sound of barking and growling..\n \n");
                choice11(choices, btArray); //choice 44 / reaction 8
        });

        btArray[1].setOnAction(e -> {
            textArea.setText(choices[33].getChoice() + "\n \n"); //choice 45 / reaction 33
                textArea.appendText(choices[38].getChoice()); //end story
            buttonsHBox.getChildren().clear(); //Clear buttons for ending
        });
    } //Choice42 method end
    //Choice46 method begin (story ending in this method)
    public static void choice46(Choice[] choices, Button[] btArray) {
        textArea.setText(choices[34].getChoice() + "\n \n1: Run and hide.\n \n"
                + "2: Choose a different direction."); //choice 46 / reaction 34
        buttonsHBox.getChildren().clear();
        buttonsHBox.getChildren().addAll(btArray[0], btArray[1]);

        btArray[0].setOnAction(e -> {
            textArea.setText(choices[32].getChoice() + "\n \n"); //choice 49 / returns to reaction 32
                textArea.appendText(choices[38].getChoice()); //end story
            buttonsHBox.getChildren().clear(); //Clear buttons for ending
        });

        btArray[1].setOnAction(e -> {
            choice38(choices, btArray); //choice 48 / returns to reaction 28
        });
    } //Choice46 method end
    //Choice47 method begin (story ending in this method)
    public static void choice47(Choice[] choices, Button[] btArray) {
        textArea.setText(choices[35].getChoice() + "\n \n1: choose to head home.\n \n"
                + "2: Choose to explore more."); //choice 47 / reaction 35
        buttonsHBox.getChildren().clear();
        buttonsHBox.getChildren().addAll(btArray[0], btArray[1]);

        btArray[0].setOnAction(e -> {
            textArea.setText(choices[26].getChoice() + "\n \n"); //choice 50 / returns to reaction 26
                textArea.appendText(choices[38].getChoice()); //end story
            buttonsHBox.getChildren().clear(); //Clear buttons for ending
        });

        btArray[1].setOnAction(e -> {
            choice38(choices, btArray); //choice 51 / returns to reaction 28
        });
    } //Choice46 method end
    //Main Method
    public static void main(String[] args) {
        Application.launch(args);
    }
} //class
