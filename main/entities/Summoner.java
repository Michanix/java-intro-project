package entities;

import utils.GameRace;

public class Summoner {
    private String name;
    private int experience;
    private GameRace race;
    private Abilities abilities;

    public Summoner(String name, GameRace race) {
        this.name = name;
        this.race = race;
        this.abilities = new Abilities();
        this.experience = 0;
    }

    // get and set
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public GameRace getRace() {
        return race;
    }

    public void setRace(GameRace race) {
        this.race = race;
    }

    public Abilities getAbilities() {
        return abilities;
    }

    public void setAbilities(Abilities abilities) {
        this.abilities = abilities;
    }

    @Override
    public String toString() {
        return "Character{" +
                "name='" + name + '\'' +
                ", race='" + race + '\'' +
                ", abilities=" + abilities +
                '}';
    }
}
