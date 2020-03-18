package components.levels.firstlvl;

import entities.Summoner;
import utils.ReadUserInput;

public class FirstLevel {
    private ReadUserInput readUserInput = new ReadUserInput();
    private Summoner summoner;

    public FirstLevel(Summoner summoner) {
        this.summoner = summoner;
    }

    private void greeting() {
        System.out.print("You are on the way of your first adventure.\n" +
                "You come to the crossroads, where will you go?\n");
    }

    private void choice() {
        //noinspection InfiniteLoopStatement
        while (summoner.isState()) {
            System.out.println("You are on the crossroad. Do you want to go left, right or forward?");
            System.out.print("> ");
            String choice = readUserInput.getUserInput();
            switch (choice) {
                case "right":
                    rightTurn();
                    break;
                case "left":
                    System.out.println("It's a trap! (you roll for dexterity)");
                    System.out.println("(Need more than 30% to dodge it!)");
                    leftTurn();
                    break;
                case "forward":
                    break;
                default:
                    System.err.println("Invalid option.");
                    break;
            }
        }
    }

    private void rightTurn() {
        RightTurn rightTurn = new RightTurn();
        rightTurn.run();
    }

    private void leftTurn() {
        LeftTurn leftTurn = new LeftTurn(summoner);
        leftTurn.run();
    }

    public void run() {
        greeting();
        choice();
    }
}
