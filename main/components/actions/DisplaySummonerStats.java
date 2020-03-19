package components.actions;

import entities.Summoner;

public class DisplaySummonerStats {

    public static void displaySummonerCurrentStats(Summoner summoner) {
        System.out.println("You character name: " + summoner.getName());
        System.out.println("Your game race: " + summoner.getRace());
        System.out.println("Your abilities: ");
        System.out.println(summoner.getAbilities());
        System.out.println("Weapon: " + summoner.isWeapon());
        System.out.println("Armor: " + summoner.isArmor());
    }
}
