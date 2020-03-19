package components.userinterface;
/*
* Some default User Interface for Each lvl.
* Kinda useless for now. But if anything, its here
*/


import utils.DiceType;
import utils.ReadUserInput;

public class DefaultLvLUI {
    private ReadUserInput readUserInput = new ReadUserInput();

    public String displayAllDiceOptions() {
        for(DiceType dice : DiceType.values()) {
            System.out.printf("%s\n", dice.name());
        }
        System.out.print("Choose the dice > ");
        String dice = readUserInput.getUserDice();
        return dice;
    }

    public String chooseAction() {
        System.out.println();
        System.out.println("[1] Roll 2D10");
        System.out.println("[2] Exit");
        System.out.print("> ");
        String action = readUserInput.getUserInput();
        return action;
    }


}
