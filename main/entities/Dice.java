package entities;

import utils.DiceType;

public class Dice {
    private String name;        // name of the die: D4, D6 etc
    private int numberOfSides; // should be set based on the name

    public Dice(String name) {
        this.name = name;
        this.numberOfSides = setNumberOfSides(name);
    }
    // getters, setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int setNumberOfSides(String name) {
        return DiceType.valueOf(name).sides();
    }

    public int getNumberOfSides() {
        return numberOfSides;
    }

    @Override
    public String toString() {
        return "Dice{" +
                "name='" + name + '\'' +
                ", numberOfSides=" + numberOfSides +
                '}';
    }
}