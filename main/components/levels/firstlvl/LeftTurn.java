package components.levels.firstlvl;

import components.actions.ThrowDiceAction;

import static utils.DisplayText.printText;

public class LeftTurn {

    private void leftChoice() {
        ThrowDiceAction throwDiceAction = new ThrowDiceAction();
        int percent = throwDiceAction.roll2D10();
        if (percent < 30) {
            printText("src/main/text/lvl1/left/lessThanNPercent.txt");
        } else {
            printText("src/main/text/lvl1/left/moreThanNPercent.txt");
        };
    }

    public void run() {
        leftChoice();
    }

}
