package components.levels.firstlvl.leftturn;

/*
* If hero didnt die in trap.
* He finds this...
* An empty class, lol
* */


import entities.Summoner;

import static utils.DisplayText.printText;

public class SecretPassage {
    private Summoner summoner;

    public SecretPassage(Summoner summoner) {
        this.summoner = summoner;
    }

    public void findsItem() {
        if (summoner.isArmor()) {
            System.out.println("You already been here. Back to the crossroad...");
        } else {
            printText("src/main/text/lvl1/left/armorFound.txt");
            summoner.setArmor(true);
        }
    }
}
