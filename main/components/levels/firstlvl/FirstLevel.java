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

    private void LvlMenu() {
        // whenever hero backs in the main menu,
        // he is being recovered from adventure
        summoner.setState(true);
        while (summoner.isState()) {
            // checking whether lvl is still going or not
            // little hack to leave the adventure without terminating the game.
            boolean lvlState = true;
            System.out.println("You are on the crossroad. Do you want to go left, right or forward(Or type exit to left the adventure)?");
            System.out.print("> ");
            String choice = readUserInput.getUserInput();
            switch (choice) {
                case "right":
                    rightTurn();
                    break;
                case "left":
                    leftTurn();
                    break;
                case "forward":
                    break;
                case "exit":
                    lvlState = false;
                    break;
                default:
                    System.err.println("Invalid option.");
                    break;
            }
            if (!lvlState) {
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
        LvlMenu();
    }
}
