package components.levels.firstlvl.leftturn;

import entities.Summoner;
import utils.ReadUserInput;

import static components.actions.DisplayStaticTextActions.deathMessage;
import static components.actions.ThrowDiceAction.roll2D10;
import static utils.DisplayText.printText;

public class LeftTurn {
    private Summoner summoner;
    private ReadUserInput readUserInput = new ReadUserInput();

    public LeftTurn(Summoner summoner) {
        this.summoner = summoner;
    }

    private void leftChoice() {
        int percent = roll2D10();   // throws 2 D10 dices
        System.out.println("It's a trap! (you roll for dexterity. Need more than 30% to dodge it!");
        System.out.println("You got " + percent + "%");
        if (percent < 30) {
            // Player dies
            String pathToText = "src/main/text/lvl1/left/lessThanNPercent.txt";
            printText(pathToText);
            deathMessage();
            summoner.setState(false);
        } else {
            // Player survives
            String pathToText = "src/main/text/lvl1/left/moreThanNPercent.txt";
            printText(pathToText);
            System.out.println("Do you check it out or you go back?(y/n)");
            System.out.print("> ");
            String answer = readUserInput.getUserInput();
            if (answer.equals("y")) {
                SecretPassage s = new SecretPassage(summoner);
                s.findsItem();
            }
        }
    }


    public void run() {
        leftChoice();
    }

}
