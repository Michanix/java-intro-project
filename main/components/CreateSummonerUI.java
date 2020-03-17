package components;

import utils.GameRace;

public class CreateSummonerUI {
    private String name;
    private ReadInput userInput = new ReadInput();

    private void createSummoner() {
        System.out.println("How shall we call you, summoner?");
        System.out.print("> ");
        String name = userInput.getUserInput();
        GameRace race = null;
        System.out.println("What is your race? ");
        while (race == null) {
            System.out.println();
            raceOptions();
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
        System.out.println("Welcome to the Great Adventure, " + name + "!");
        System.out.println("Your game race: " + race.getRaceName());
        System.out.println("You initial abilities: ");
        System.out.println(newSummoner.getAbilities());
    }

    private void raceOptions() {
        System.out.println("[1] Elf");
        System.out.println("[2] Mountain Dwarf");
        System.out.println("[3] Human");
        System.out.println("[4] High elf");
        System.out.print("> ");
    }

    public void run() {
        createSummoner();
    }
}
