package components.userinterface;

/*
* Main UI class. Here should be called every other UI component.
*/

import utils.ReadUserInput;

public class UI {
    ReadUserInput readUserInput = new ReadUserInput();

    private void greeting() {
        System.out.println("=== Welcome To the Dungeons and Dragons ===");
    }

    private void menu() {
        System.out.println("===================");
        System.out.println("===Choose action===");
        System.out.println("===================");
    }

    private void options() {
        while (true) {
            System.out.println();
            System.out.println("[1] Create character");
            System.out.println("[2] Start the game");
            System.out.println("[3] Exit");
            System.out.print("> ");
            String option = readUserInput.getUserInput();
            switch (option) {
                case "1":
                    CreateSummonerUI createSummonerUI = new CreateSummonerUI();
                    createSummonerUI.run();
                    break;
                case "2":
                    System.out.println("Incoming...");
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
        menu();
        options();
    }
}
