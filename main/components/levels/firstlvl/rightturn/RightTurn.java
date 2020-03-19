package components.levels.firstlvl.rightturn;

import entities.Summoner;

import static utils.DisplayText.printText;

public class RightTurn {
    private Summoner summoner;

    public RightTurn(Summoner summoner) {
        this.summoner = summoner;
    }

    public void run() {
        if (summoner.isWeapon()) {
            System.out.println("You aready been here. Back to the crossroad...");
        } else {
            summoner.setWeapon(true);
            String pathToTxt = "src/main/text/lvl1/right/ancientArteFound.txt";
            printText(pathToTxt);
        }

    }
}
