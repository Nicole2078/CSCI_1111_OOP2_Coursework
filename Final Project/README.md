# JavaCatAdventureChooseAdventureGame
Text based choose your own Adventure
### Synopsis
This is a choose your own Adventure text story. It is designed to have the user of the program progress the story with imputing a choice of a number.
### Motivation
The reasons I chose to make a choose your own adventure text-base program is because I wanted to make something fun that I could include my daughter in the story of making it. She sat down with me and helped me come up with ideas on how and what the story inside the program would consist of. I wanted to include her in my school work somehow. At the time, of the course I was also struggling with methods a little, and this program help to experience those a lot more firsthand. This Verion of the Program is slightly modified to inculed an object called Scene. This was a requirement for the final project of this part of the course. I also included a contingency for if the user put the wrong number in, this was not part of the first verison of this.
### Code Example
```
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
    
```
### Contributors
My Daughter, Vesta helped with the story itself. Plus she loves cats.
My course insturctors Rhet and Jason all contributed input on how i could make this a better project. Jason helped me find some bugs and work on the the buttons still showing up when the story ended and helped to work those out. He also helped with making the GUI. Rhet helped with making my practice GUI function inside my code and methods. He taught me more a about methods and how sometimes they are great but at times can be a hindrance and using a class wide variable would be better. he also helped me to make my Hbox containing the buttons to work inside all the methods so I would't have to make new buttons every single time I needed them. 
