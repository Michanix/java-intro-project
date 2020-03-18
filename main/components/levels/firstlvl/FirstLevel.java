package components.levels.firstlvl;

import components.actions.ThrowDiceAction;
import components.userinterface.DefaultLvLUI;
import entities.Dice;
import utils.DisplayText;
import utils.ReadUserInput;

public class FirstLevel {
    private DisplayText displayText = new DisplayText();
    private ReadUserInput readUserInput = new ReadUserInput();
    private DefaultLvLUI defaultLvLUI = new DefaultLvLUI();

    public FirstLevel() {
    }

    private void greeting() {
        System.out.print("You are on the way of your first adventure.\n" +
                "You come to the crossroads, where will you go?\n");
    }

    private void choice() {
        while (true) {
            System.out.println("You are on the crossroad. Do you want to go left, right or forward?");
            System.out.print("> ");
            String choice = readUserInput.getUserInput();
            switch (choice) {
                case "right":
                    rightChoice();
                    break;
                case "left":
                    System.out.println("It's a trap! (you roll for dexterity)");
                    leftChoice();
                    break;
                case "forward":
                    break;
                default:
                    System.err.println("Invalid option.");
                    break;
            }
        }

    }

    private void rightChoice() {
        String pathToTxt = "src/main/text/lvl1/right/ancientArteFound.txt";
        System.out.println("=============================================");
        displayText.printText(pathToTxt);
        System.out.println("=============================================");
    }

    private void leftChoice() {
        ThrowDiceAction throwDiceAction = new ThrowDiceAction();
        int percent = throwDiceAction.roll2D10();
        if (percent < 30) {
            displayText.printText("src/main/text/lvl1/left/lessThan50.txt");
        } else {
            displayText.printText("src/main/text/lvl1/left/moreThan50.txt");
        };
    }

    public void run() {
        greeting();
        choice();
    }
}
