package components.levels.firstlvl;

import components.actions.ThrowDice;
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
                "You come to the crossroads, where will you go? ");
    }

    private void choice() {
        while (true) {
            System.out.println("Do you want to go left, right or forward?");
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
        displayText.printText(pathToTxt);
    }

    private void leftChoice() {
        String dice = defaultLvLUI.displayDiceOptions();  // Returns dice choosen by player
        Dice userDice = new Dice(dice);
        ThrowDice throwDiceAcion = new ThrowDice();
        int points = throwDiceAcion.rollTheDie(userDice);
        System.out.println("You rolled " + points);
    }

    public void run() {
        greeting();
        choice();
    }
}
