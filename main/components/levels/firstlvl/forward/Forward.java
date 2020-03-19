package components.levels.firstlvl.forward;

import entities.Summoner;
import utils.ReadUserInput;

import static utils.DisplayText.printText;

public class Forward {
    private Summoner summoner;
    ReadUserInput readUserInput = new ReadUserInput();

    public Forward(Summoner summoner) {
        this.summoner = summoner;
    }

    private void moveForward() {
        while (summoner.isState()) {
            printText("src/main/text/lvl1/forward/moveForward1.txt");
            String choice = getChoice();
            if (choice.equals("y")) {
                // help villagers
            } else if (choice.equals("n")) {
                // move somewhere else
                movePassVillage();
            } else {
                System.err.println("Invalid option.");
            }
        }

    }

    private String getChoice() {
        System.out.println("Do you agree or not?(y/n)");
        System.out.print("> ");
        String choice = readUserInput.getUserInput();
        return choice;
    }

    private void movePassVillage() {
        GoddessEncounter goddessEncounter = new GoddessEncounter(summoner);
        goddessEncounter.run();
    }

    public void run() {
        moveForward();
    }
}
