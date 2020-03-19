package components.levels.firstlvl;

import entities.Summoner;

import static utils.DisplayText.printText;

public class RightTurn {
    private Summoner summoner;

    public RightTurn(Summoner summoner) {
        this.summoner = summoner;
    }

    public void run() {
        String pathToTxt = "src/main/text/lvl1/right/ancientArteFound.txt";
        if (summoner.isWeapon()) {
            System.out.println("You aready been here.");
        } else {
            summoner.setWeapon(true);
            printText(pathToTxt);
        }

    }
}
