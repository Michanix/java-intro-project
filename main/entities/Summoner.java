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
    private boolean onTheRoad;      // Dirty hack to check, if Summoner is stil in adventure
    private GameRace race;
    private Abilities abilities;
    private boolean weapon;         // coming soon...(Seperate class for Weapon)
    private boolean armor;           // coming soon...(Seperate class for Armor)

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

    public boolean isOnTheRoad() {
        return onTheRoad;
    }

    public void setOnTheRoad(boolean onTheRoad) {
        this.onTheRoad = onTheRoad;
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

    public boolean isWeapon() {
        return weapon;
    }

    public void setWeapon(boolean weapon) {
        this.weapon = weapon;
    }

    public boolean isArmor() {
        return armor;
    }

    public void setArmor(boolean armor) {
        this.armor = armor;
    }

    @Override
    public String toString() {
        return "Summoner{" +
                "name='" + name + '\'' +
                ", experience=" + experience +
                ", state=" + state +
                ", onTheRoad=" + onTheRoad +
                ", race=" + race +
                ", abilities=" + abilities +
                ", weapon=" + weapon +
                ", armor=" + armor +
                '}';
    }
}
