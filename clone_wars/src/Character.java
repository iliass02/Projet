/**
 * Created by iliass on 01/03/2016.
 */
public class Character {

    private  String name;
    private int hp;
    private int def;
    private int power;
    private int force;
    private int intelligence;
    private int lvl;
    private int xp;

    public Character () {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getDef() {
        return def;
    }

    public void setDef(int def) {
        this.def = def;
    }

    public int getXp() {
        return xp;
    }

    public void setXp(int xp) {
        this.xp = xp;
    }

    public int getLvl() {

        return lvl;
    }

    public void setLvl(int lvl) {
        this.lvl = lvl;
    }

    public int getIntelligence() {

        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public int getForce() {

        return force;
    }

    public void setForce(int force) {
        this.force = force;
    }

    public int getPower() {

        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }
}
