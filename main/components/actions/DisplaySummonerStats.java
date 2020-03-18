package components.actions;

import entities.Summoner;

public class DisplaySummonerStats {
    private Summoner summoner;

    public DisplaySummonerStats(Summoner summoner) {
        this.summoner = summoner;
    }

    public static void displaySummonerInitStats(Summoner summoner) {
        System.out.println("Welcome to the Great Adventure, " + summoner.getName() + "!");
        System.out.println("Your game race: " + summoner.getRace());
        System.out.println("You initial abilities: ");
        System.out.println(summoner.getAbilities());
    }

    public static void displaySummonerCurrentStats(Summoner summoner) {
        System.out.println("You character name: " + summoner.getName());
        System.out.println("Your game race: " + summoner.getRace());
        System.out.println("Your abilities: ");
        System.out.println(summoner.getAbilities());
    }
}
