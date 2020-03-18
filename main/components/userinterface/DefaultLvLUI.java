package components.userinterface;
/*
* Some default User Interface for Each lvl.
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


}
