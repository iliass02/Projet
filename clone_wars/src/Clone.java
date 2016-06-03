/**
 * Created by iliass on 01/03/2016.
 */
public class Clone extends Enemy {
    public Clone(int lvl) {

        if (lvl > 1) {
            setLvl(lvl);
            setHp((int) ((100*1.1) * lvl));
            setDef((int) ((100*1.1) * lvl));
            setPower((int) ((100*1.1) * lvl));
            setForce((int) ((0*1.1) * lvl));
            setIntelligence((int) ((100*1.1) * lvl));
        } else {
            setHp(100);
            setDef(100);
            setPower(100);
            setForce(0);
            setIntelligence(100);
            setLvl(1);
        }
        System.out.println("Un Clone apparait");
        System.out.println("L'ennemie au niveau "+ getLvl());
    }
}
