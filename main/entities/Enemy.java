package entities;

public class Enemy {
    private String name;
    private int lvl;
    private int HP;             // enemy health bar
    private double physicalDmg; // Physacal damage dealt by the enemy
    private double magicalDmg;  // ---- || -----
    private int expPer;         // How much experience Summoner get per one killed Enemy

    public Enemy(String name, int lvl, int HP, double physicalDmg, double magicalDmg, int expPer) {
        this.name = name;
        this.lvl = lvl;
        this.HP = HP;
        this.physicalDmg = physicalDmg;
        this.magicalDmg = magicalDmg;
        this.expPer = expPer;
    }

    // get and set
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLvl() {
        return lvl;
    }

    public void setLvl(int lvl) {
        this.lvl = lvl;
    }

    public int getHP() {
        return HP;
    }

    public void setHP(int HP) {
        this.HP = HP;
    }

    public double getPhysicalDmg() {
        return physicalDmg;
    }

    public void setPhysicalDmg(double physicalDmg) {
        this.physicalDmg = physicalDmg;
    }

    public double getMagicalDmg() {
        return magicalDmg;
    }

    public void setMagicalDmg(double magicalDmg) {
        this.magicalDmg = magicalDmg;
    }

    public int getExpPer() {
        return expPer;
    }

    public void setExpPer(int expPer) {
        this.expPer = expPer;
    }

    @Override
    public String toString() {
        return "Enemy{" +
                "name='" + name + '\'' +
                ", lvl=" + lvl +
                ", HP=" + HP +
                ", physicalDmg=" + physicalDmg +
                ", magicalDmg=" + magicalDmg +
                ", expPer=" + expPer +
                '}';
    }
}
