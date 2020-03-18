package components.levels.firstlvl;

import utils.DisplayText;
import utils.ReadUserInput;

public class FirstLevel {
    private DisplayText displayText = new DisplayText();
    private ReadUserInput readUserInput = new ReadUserInput();
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
                    rightChose();
                    break;
                case "left":
                    break;
                case "forward":
                    break;
                default:
                    System.err.println("Invalid option.");
                    break;
            }
        }

    }

    private void rightChose() {
        String pathToTxt = "src/main/text/lvl1/right/ancientArteFound.txt";
        displayText.printText(pathToTxt);
    }

    public void run() {
        greeting();
        choice();
    }
}
