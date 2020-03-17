package components;

public class CreateSummonerUI {
    private String name;
    private ReadInput userInput = new ReadInput();

    private void createSummoner() {
        System.out.println("How shall we call you, summoner?");
        System.out.print("> ");
        String name = userInput.getUserInput();
        System.out.println("What is your race? ");
        raceOptions();
        System.out.print("> ");
        String race = userInput.getUserInput();
        Summoner newSummoner = new Summoner(name, race);
        System.out.println("Welcome to the Great Adventure, " + name + "!");
        System.out.println("Your game race: " + race);
        System.out.println("You initial abilities: ");
        System.out.println(newSummoner.getAbilities());
    }

    private void raceOptions() {
        System.out.println("[1] Elf");
        System.out.println("[2] Dwarf");
        System.out.println("[3] Human");
        System.out.println("[4] Dark elf");
    }

    public void run() {
        createSummoner();
    }
}
