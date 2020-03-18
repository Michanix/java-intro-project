package components.actions;
/*
* Class to handle all the dice actions
*/

import utils.DiceType;

public class ThrowDiceAction {

    public int rollTheDie(int numberOfSides) {
        return (int) (Math.random() * numberOfSides);
    }

    public int roll2D10() {
        // method to calculate the outcome of the n dices rolled percentile vice
        // eg. Usually rolled 2 D10 -> First D10 shows 7 and Second 1
        // based on that the overall percantage calculated -> 71%
        int d10 = DiceType.D10.sides();
        int firstDigit = rollTheDie(d10);
        int secondDigit = rollTheDie(d10);
        int total = Integer.valueOf(String.valueOf(firstDigit) + String.valueOf(secondDigit));
        return total;
    }


}
