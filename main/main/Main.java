package main;

import components.Dice;
import components.ReadInput;
import utils.DiceType;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<DiceType> dieTypeList = new ArrayList<>(List.of(DiceType.values()));
        for (DiceType die: dieTypeList) {
            System.out.println(die);
        }
        System.out.println("Choose die to roll: ");
        ReadInput input = new ReadInput();
        Dice die1 = new Dice(input.getUserDice());
        System.out.printf("You rolled %s\n", die1.getName());
        System.out.printf("The number is %d", die1.rollTheDie());
    }
}
