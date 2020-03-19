package components.userinterface;

import entities.Summoner;
import utils.GameRace;
import utils.ReadUserInput;

import static components.actions.DisplaySummonerStats.displaySummonerCurrentStats;

public class CreateSummonerUI {
    private ReadUserInput userInput = new ReadUserInput();

    public Summoner createSummoner() {
        System.out.println("How shall we call you, summoner?");
        System.out.print("> ");
        String name = userInput.getUserInput();
        GameRace race = null;
        System.out.println("What is your race? ");
        while (race == null) {
            System.out.println();
            displayRaceOptions();
            String option = userInput.getUserInput();
            switch (option) {
                default:
                    System.err.println("Invalid option. Please select option from the list!");
                    break;
                case "1":
                    race = GameRace.ELF;
                    break;
                case "2":
                    race = GameRace.MOUNTAINDWARF;
                    break;
                case "3":
                    race = GameRace.HUMAN;
                    break;
                case "4":
                    race = GameRace.HIGHELF;
                    break;
            }
        }
        Summoner newSummoner = new Summoner(name, race);
        displaySummonerCurrentStats(newSummoner);
        return newSummoner;
    }

    private void displayRaceOptions() {
        System.out.println("[1] Elf");
        System.out.println("[2] Mountain Dwarf");
        System.out.println("[3] Human");
        System.out.println("[4] High elf");
        System.out.print("> ");
    }
}
