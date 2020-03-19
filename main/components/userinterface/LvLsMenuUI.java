package components.userinterface;

/*
* Here will be handled all lvl starts.
* May we need better name for the class, tho...
*/

import components.levels.firstlvl.FirstLevel;
import entities.Summoner;
import utils.ReadUserInput;

public class LvLsMenuUI {
    private ReadUserInput userInput = new ReadUserInput();
    private Summoner summoner;

    public LvLsMenuUI(Summoner summoner) {
        this.summoner = summoner;
    }

    private void displayOptions() {
        listOptions();
        String option = userInput.getUserInput();
        switch (option) {
            case "1":
                FirstLevel firstLevel = new FirstLevel(summoner);
                firstLevel.run();
                break;
            case "2":
                System.err.println("Lvl in development...");
                break;
            case "3":
                break;
            default:
                System.err.println("Invalid option. Please select option from the list!");
                break;
            }
    }

    private void listOptions() {
        System.out.println();
        System.out.println("[1] First level");
        System.out.println("[2] Second level(Coming soon...)");
        System.out.println("[3] Go back");
        System.out.print("> ");
    }

    public void run() {
        displayOptions();
    }
}
