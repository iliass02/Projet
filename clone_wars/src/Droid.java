/**
 * Created by iliass on 01/03/2016.
 */
public class Droid extends Enemy {
    public Droid(int lvl) {
        if (lvl > 1) {
            setLvl(lvl);
            setHp((int) ((50*1.1) * lvl));
            setDef((int) ((100*1.1) * lvl));
            setPower((int) ((25*1.1) * lvl));
            setForce((int) ((0*1.1) * lvl));
            setIntelligence((int) ((200*1.1) * lvl));
        } else {
            setHp(50);
            setDef(100);
            setPower(25);
            setForce(0);
            setIntelligence(200);
            setLvl(1);
        }
        System.out.println("Un Droid apparait");
        System.out.println("L'ennemie au niveau "+ getLvl());
    }
}
