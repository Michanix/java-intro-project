package main;

import components.*;
import utils.Abilities;
import utils.DiceType;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<DiceType> dieTypeList = new ArrayList<>(List.of(DiceType.values()));
        UI ui = new UI();
        CreateSummonerUI createSummonerUI = new CreateSummonerUI();
        createSummonerUI.run();

        /*
        for (DiceType die: dieTypeList) {
            System.out.println(die);
        }
        System.out.println("Choose die to roll: ");
        ReadInput input = new ReadInput();
        Dice die1 = new Dice(input.getUserDice());
        System.out.printf("You rolled %s\n", die1.getName());
        System.out.printf("The number is %d", die1.rollTheDie());
         */
    }
}
