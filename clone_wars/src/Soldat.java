/**
 * Created by iliass on 01/03/2016.
 */
public class Soldat extends Enemy {
    public Soldat(int lvl) {

        if (lvl > 1) {
            setLvl(lvl);
            setHp((int) ((100*1.1) * lvl));
            setDef((int) ((150*1.1) * lvl));
            setPower((int) ((125*1.1) * lvl));
            setForce((int) ((0*1.1) * lvl));
            setIntelligence((int) ((125*1.1) * lvl));
        } else {
            setHp(100);
            setDef(150);
            setPower(125);
            setForce(0);
            setIntelligence(125);
            setLvl(1);
        }
        System.out.println("Un Soldat apparait");
        System.out.println("L'ennemie au niveau "+ getLvl());
    }
}
