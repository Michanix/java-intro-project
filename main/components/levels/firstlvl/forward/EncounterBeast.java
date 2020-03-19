package components.levels.firstlvl.forward;

import entities.Summoner;

import static components.actions.DisplayStaticTextActions.deathMessage;
import static components.actions.DisplayStaticTextActions.victoryMessage;
import static components.actions.ThrowDiceAction.roll2D10;
import static utils.DisplayText.printText;

public class EncounterBeast {
    private Summoner summoner;

    public EncounterBeast(Summoner summoner) {
        this.summoner = summoner;
    }

    private void fightControllerHelper(String equipStateTxt, String ifDiesTxt, String ifSurvivesTxt, int percent) {
        // first parameter takes in text that will be displayed based on the equipment Sumonner currently posses
        // second parameter take in text that will be displayed if Summoner dies
        // third parameter take in text that will be displayed if Summoner survives
        // last parameter take in percentage number to control against the Summoner luck
        printText(equipStateTxt);
        int roll = roll2D10();
        System.out.println("You are rolling the dice....");
        System.out.println("You got " + roll + "%");
        if (roll < percent) {
            printText(ifDiesTxt);
            deathMessage();
            summoner.setState(false);
        } else {
            printText(ifSurvivesTxt);
            victoryMessage();
        }
    }

    private void figthTheBeastController() {
        if (!summoner.isWeapon() && !summoner.isArmor()) {
            fightControllerHelper(
                    "src/main/text/lvl1/forward/noArmorOrWeap.txt",
                    "src/main/text/lvl1/forward/ifLessThan80.txt",
                    "src/main/text/lvl1/forward/moreThan80.txt",
                    80);
        } else if(summoner.isWeapon() && !summoner.isArmor()) {
            fightControllerHelper(
                    "src/main/text/lvl1/forward/weaponButNoArmor.txt",
                    "src/main/text/lvl1/forward/lesstThan60.txt",
                    "src/main/text/lvl1/forward/moreThan60.txt",
                    60
            );
        } else if(!summoner.isWeapon() && summoner.isArmor()) {
            fightControllerHelper(
                    "src/main/text/lvl1/forward/armorButNoWeap.txt",
                    "src/main/text/lvl1/forward/lesstThan40.txt",
                    "src/main/text/lvl1/forward/moreThan40.txt",
                    40
            );
        } else {
            fightControllerHelper(
                    "src/main/text/lvl1/forward/fullEquip.txt",
                    "src/main/text/lvl1/forward/lessThan20.txt",
                    "src/main/text/lvl1/forward/moreThan20.txt",
                    20
            );
        }

    }
    public void run() {
        figthTheBeastController();
    }
}
