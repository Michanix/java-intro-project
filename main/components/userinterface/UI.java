package components.userinterface;

/*
* Main UI class. Here should be called every other UI component.
*/

import components.actions.DisplaySummonerStats;
import entities.Summoner;
import utils.ReadUserInput;

import static components.actions.DisplaySummonerStats.displaySummonerCurrentStats;
import static components.actions.DisplaySummonerStats.displaySummonerInitStats;

public class UI {
    ReadUserInput readUserInput = new ReadUserInput();

    private void greeting() {
        System.out.println("=== Welcome To the Dungeons and Dragons ===");
    }

    private void displayTitle() {
        System.out.println("===================");
        System.out.println("===Choose action===");
        System.out.println("===================");
    }

    private Summoner displayCreateSummonerUI() {
        Summoner summoner;
        System.out.println("====Create character====");
        CreateSummonerUI createSummonerUI = new CreateSummonerUI();
        summoner = createSummonerUI.createSummoner();
        return summoner;
    }

    private void main() {
        // main controller of the game...sort of...
        displayTitle();
        // returns created summoner by the Player
        // later used this summoner to pass around other components, lol
        // send help...
        Summoner summoner = displayCreateSummonerUI();
        while (true) {
            System.out.println();
            System.out.println("[1] Start the game");
            System.out.println("[2] Show character stats");
            System.out.println("[3] Exit");
            System.out.print("> ");
            String option = readUserInput.getUserInput();
            switch (option) {
                case "1":
                    LvLsMenuUI lvLsMenuUI = new LvLsMenuUI(summoner);
                    lvLsMenuUI.run();
                    break;
                case "2":
                    displaySummonerCurrentStats(summoner);
                    break;
                case "3":
                    System.out.println("See you on the next adventure!");
                    terminate();
                    break;
                default:
                    System.err.println("Unknown option.");
            }
        }
    }

    private void terminate() {
        System.exit(0);
    }

    public void run() {
        greeting();
        main();
    }
}
