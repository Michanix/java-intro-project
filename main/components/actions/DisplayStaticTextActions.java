package components.actions;

/*
* Class to store functions to display general text like greetings, titles used in the game.
* Dont store stuff specific to lvls.
*/

public class DisplayStaticTextActions {

    public static void displayGreeting() {
        System.out.println("=== Welcome To the Dungeons and Dragons ===");
    }

    public static void displayTitle() {
        System.out.println("===================");
        System.out.println("===Choose action===");
        System.out.println("===================");
    }
}
