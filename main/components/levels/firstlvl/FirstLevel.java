package components.levels.firstlvl;

import components.levels.firstlvl.forward.Forward;
import components.levels.firstlvl.leftturn.LeftTurn;
import components.levels.firstlvl.rightturn.RightTurn;
import entities.Summoner;
import utils.ReadUserInput;

import static components.actions.DisplaySummonerStats.displaySummonerCurrentStats;

public class FirstLevel {
    private ReadUserInput readUserInput = new ReadUserInput();
    private Summoner summoner;

    public FirstLevel(Summoner summoner) {
        this.summoner = summoner;
    }

    private void LvlMenu() {
        // whenever hero backs in the main menu,
        // he is being recovered from adventure
        summoner.setState(true);
        while (summoner.isState()) {
            // checking whether lvl is still going or not
            // little hack to leave the adventure without terminating the game.
            boolean lvlState = true;
            listOfOptions();
            String choice = readUserInput.getUserInput();
            switch (choice) {
                case "1":
                    rightTurn();
                    break;
                case "2":
                    leftTurn();
                    break;
                case "3":
                    moveForward();
                    break;
                case "4":
                    displaySummonerCurrentStats(summoner);
                    break;
                case "5":
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
    private void greeting() {
        System.out.print("You are on the way of your first adventure.\n" +
                "You come to the crossroads, where will you go?\n");
    }

    private void listOfOptions() {
        System.out.println();
        System.out.println("You are on the crossroad. "
                + "Do you want to go left, right or forward?");
        System.out.println("[1] Go right");
        System.out.println("[2] Go left");
        System.out.println("[3] Go forward");
        System.out.println("[4] Show current stats");
        System.out.println("[5] Leave adventure");
        System.out.print("> ");
    }

    private void rightTurn() {
        System.out.println(summoner);
        RightTurn rightTurn = new RightTurn(summoner);
        rightTurn.run();
    }

    private void leftTurn() {
        LeftTurn leftTurn = new LeftTurn(summoner);
        leftTurn.run();
    }

    private void moveForward() {
        Forward forward = new Forward(summoner);
        forward.run();
    }

    public void run() {
        greeting();
        LvlMenu();
    }
}
