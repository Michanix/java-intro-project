package components.levels.firstlvl;

import utils.ReadUserInput;

public class FirstLevel {
    private ReadUserInput readUserInput = new ReadUserInput();

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
                    System.out.println("Need more than 30% to dodge it!");
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
        RightTurn rightTurn = new RightTurn();
        rightTurn.run();
    }

    private void leftChoice() {
        LeftTurn leftTurn = new LeftTurn();
        leftTurn.run();
    }

    public void run() {
        greeting();
        choice();
    }
}
