package components.levels.firstlvl;

import entities.Summoner;

import static components.actions.Terminate.terminate;
import static components.actions.ThrowDiceAction.roll2D10;
import static utils.DisplayText.printText;

public class LeftTurn {
    private Summoner summoner;

    public LeftTurn(Summoner summoner) {
        this.summoner = summoner;
    }

    private void leftChoice() {
        int percent = roll2D10();       // throws 2 D10 dices
        if (percent < 30) {
            // Player dies
            printText("src/main/text/lvl1/left/lessThanNPercent.txt");
            summoner.setState(false);
        } else {
            // Player survives
            printText("src/main/text/lvl1/left/moreThanNPercent.txt");
        }
    }


    public void run() {
        leftChoice();
    }

}
