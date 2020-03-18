package components.actions;

import entities.Dice;

public class ThrowDiceAction {

    public int rollTheDie(Dice dice) {
        return (int) (Math.random() * dice.getNumberOfSides() + 1);
    }

    public int rolleTheNDiced() {
        return 0;
    }


}
