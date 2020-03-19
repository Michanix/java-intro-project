package components.actions;

/*
* Class to store functions to display general text like greetings, titles used in the game.
* Dont store stuff specific to lvls.
*/

import static utils.DisplayText.printText;

public class DisplayStaticTextActions {

    public static void displayGreeting() {
        System.out.println("=== Welcome To the Dungeons and Dragons ===");
    }

    public static void displayTitle() {
        System.out.println("===================");
        System.out.println("===Choose action===");
        System.out.println("===================");
    }

    public static void deathMessage() {
        System.out.println("You died and returned to the main menu.");
    }

    public static void victoryMessage() {
        printText("src/main/text/lvl1/forward/ifBeastSlayed.txt"); }
}
