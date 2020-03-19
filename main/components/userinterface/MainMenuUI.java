package components.userinterface;

/*
* Main UI class. Here should be called every other UI component.
*/

import entities.Summoner;
import utils.ReadUserInput;

import static components.actions.DisplayStaticTextActions.displayGreeting;
import static components.actions.DisplayStaticTextActions.displayTitle;
import static components.actions.DisplaySummonerStats.displaySummonerCurrentStats;
import static components.actions.Terminate.terminate;

public class MainMenuUI {
    ReadUserInput readUserInput = new ReadUserInput();

    private Summoner displayCreateSummoner() {
        Summoner summoner;
        System.out.println("====Create character====");
        CreateSummonerUI createSummonerUI = new CreateSummonerUI();
        summoner = createSummonerUI.createSummoner();
        return summoner;
    }

    private void main() {
        // main controller of the game...sort of...
        // returns created summoner by the Player
        // later used this summoner to pass around to other components, lol
        // send help...
        Summoner summoner = displayCreateSummoner();
        // to keep IDE quiet, lol
        //noinspection InfiniteLoopStatement
        while (true) {
            System.out.println();
            System.out.println("[1] Start the game");
            System.out.println("[2] Show current character stats");
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
                    terminate();
                    break;
                default:
                    System.err.println("Unknown option.");
            }
        }
    }

    public void run() {
        displayGreeting();
        main();
    }
}
