package entities;

import utils.DiceType;

/*
* Class for Summoner abilities
*/

import java.util.Arrays;

public class Abilities {
    private int strength;
    private int dexterity;
    private int constitution;
    private int intelligence;
    private int wisdom;
    private int charisma;

    public Abilities() {
        this.strength = generateRndAbilityVal();
        this.dexterity = generateRndAbilityVal();
        this.constitution = generateRndAbilityVal();
        this.intelligence = generateRndAbilityVal();
        this.wisdom = generateRndAbilityVal();
        this.charisma = generateRndAbilityVal();
    }

    // "Roll four 6-sided dice and record the total of the highest three dice"
    // generate random value for an ability
    // by rolling 6-sided dice 4 times
    public int generateRndAbilityVal() {
        int d20 =  DiceType.valueOf("D20").sides();
        int[] vals = new int[4];

        for (int i = 0; i < 4; i++) {
            int x = (int) (Math.random() * d20 + 1);
            vals[i] = x;
        }
        Arrays.sort(vals);
        return vals[1] + vals[2] + vals[3];
    }

    // get and set
    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getDexterity() {
        return dexterity;
    }

    public void setDexterity(int dexterity) {
        this.dexterity = dexterity;
    }

    public int getConstitution() {
        return constitution;
    }

    public void setConstitution(int constitution) {
        this.constitution = constitution;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public int getWisdom() {
        return wisdom;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public int getCharisma() {
        return charisma;
    }

    public void setCharisma(int charisma) {
        this.charisma = charisma;
    }

    @Override
    public String toString() {
        return String.format(
                "[1] Strength: %d\n" +
                "[2] Dexterity: %d\n" +
                "[3] Constitution: %d\n"+
                "[4] Intelligence: %d\n" +
                "[5] Wisdom: %d\n" +
                "[6] Charisma: %d",
                strength, dexterity, constitution,
                intelligence, wisdom, charisma);
    }
}
