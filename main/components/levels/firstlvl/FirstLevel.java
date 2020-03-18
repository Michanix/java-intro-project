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
                    rightChoise();
                    break;
                case "left":
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

    private void rightChoise() {
        String pathToTxt = "src/main/text/lvl1/right/ancientArteFound.txt";
        System.out.println("=============================================");
        displayText.printText(pathToTxt);
        System.out.println("=============================================");
    }

    private void leftChoice() {
        String dice = defaultLvLUI.displayAllDiceOptions();  // Returns dice choosen by player
        Dice userDice = new Dice(dice);
        ThrowDiceAction throwDiceActionAcion = new ThrowDiceAction();
        int points = throwDiceActionAcion.rollTheDie(userDice);
        System.out.println("You rolled " + points);
    }

    public void run() {
        greeting();
        choice();
    }
}
