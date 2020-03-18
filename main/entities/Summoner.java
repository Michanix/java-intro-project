package entities;

/*
* Summoner object. Every attribute that is related to the character should be here.
*
*/

import utils.GameRace;

public class Summoner {
    private String name;
    private int experience;
    private boolean state;          // Dead or Alive
    private GameRace race;
    private Abilities abilities;
    private Weapon weapon;         // coming soon...
    private Armor armor;           // coming soon...

    public Summoner(String name, GameRace race) {
        this.name = name;
        this.race = race;
        this.state = true;
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

    public boolean isState() {
        return state;
    }

    public void setState(boolean state) {
        this.state = state;
    }

    public String getRace() {
        return race.getRaceName();
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

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public Armor getArmor() {
        return armor;
    }

    public void setArmor(Armor armor) {
        this.armor = armor;
    }

    @Override
    public String toString() {
        return "Summoner{" +
                "name='" + name + '\'' +
                ", experience=" + experience +
                ", state=" + state +
                ", race=" + race +
                ", abilities=" + abilities +
                '}';
    }
}
