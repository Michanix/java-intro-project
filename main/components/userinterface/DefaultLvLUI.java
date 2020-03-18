package components.userinterface;
/*
* Some default User Interface for Each lvl.
*/


import utils.ReadUserInput;

public class DefaultLvLUI {
    private ReadUserInput readUserInput = new ReadUserInput();

    public String displayDiceOptions() {
        System.out.println("[1] D4");
        System.out.println("[2] D6");
        System.out.println("[3] D8");
        System.out.println("[4] D10");
        System.out.println("[5] D12");
        System.out.println("[6] D20");
        System.out.print("Type the dice name> ");
        String dice = readUserInput.getUserDice();
        return dice;
    }
}
