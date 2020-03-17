package components;

import utils.Abilities;

public class Character {
    private String name;
    private String race;
    private Abilities abilities;

    public Character(String name, String race) {
        this.name = name;
        this.race = race;
        this.abilities = new Abilities();
    }

    // get and set
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
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
