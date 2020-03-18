package components.actions;

import entities.Dice;

public class ThrowDice {

    public int rollTheDie(Dice dice) {
        return (int) (Math.random() * dice.getNumberOfSides() + 1);
    }
}
