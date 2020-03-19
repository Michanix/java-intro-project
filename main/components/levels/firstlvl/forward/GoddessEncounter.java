package components.levels.firstlvl.forward;

import entities.Summoner;
import utils.ReadUserInput;

import java.util.concurrent.TimeUnit;

import static components.actions.DisplayStaticTextActions.deathMessage;
import static components.actions.ThrowDiceAction.roll2D10;
import static utils.DisplayText.printText;

public class GoddessEncounter {
    private Summoner summoner;
    ReadUserInput readUserInput = new ReadUserInput();

    public GoddessEncounter(Summoner summoner) {
        this.summoner = summoner;
    }

    private void encounterGoddess() {
        String pathToText = "src/main/text/lvl1/forward/goddessOfModestyAndGold.txt";
        printText(pathToText);
        String choice = getChoice();
        if (choice.equals("1")) {
            System.out.println("Back to the village");
        } else if (choice.equals("2")) {
            System.out.println("You are rolling the dice....");
            int result = roll2D10();
            if (result < 60) {
                printText("src/main/text/lvl1/forward/lessThan60(D20).txt");
                deathMessage();
                summoner.setState(false);
            } else {
                printText("src/main/text/lvl1/forward/moreThan60(D20).txt");
            }
        }
    }

    private String getChoice() {
        System.out.println("What do you choose?");
        System.out.println("[1] Go back");
        System.out.println("[2] Bet your luck and roll the dice(You have to get more than 60% to survive.)");
        System.out.print("> ");
        String choice = readUserInput.getUserInput();
        return choice;
    }



    public void run() {encounterGoddess();}
}
