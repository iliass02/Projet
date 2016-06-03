/**
 * Created by iliass on 01/03/2016.
 */
public class Hero extends Character {

    public Hero () {

    }


    public void stats(Hero hero, Enemy enemy) {
        System.out.println("\n---------------- Stats de "+hero.getName()+" --------------");
        System.out.println("---------------- HP : "+hero.getHp()+" ------------------");
        System.out.println("---------------- Def : "+hero.getDef()+" ------------------");
        System.out.println("---------------- Force : "+hero.getForce()+" ------------------");
        System.out.println("---------------- Intelligence : "+hero.getIntelligence()+" ------------------");
        System.out.println("---------------- Power : "+hero.getPower()+" ------------------");
        System.out.println("---------------- Xp : "+hero.getXp()+" ------------------");
        System.out.println("---------------- Lvl : "+hero.getLvl()+" ------------------\n");

        System.out.println("---------------- Stats de "+enemy.getClass().getName()+" --------------");
        System.out.println("---------------- HP : "+enemy.getHp()+" ------------------");
        System.out.println("---------------- Def : "+enemy.getDef()+" ------------------");
        System.out.println("---------------- Force : "+enemy.getForce()+" ------------------");
        System.out.println("---------------- Intelligence : "+enemy.getIntelligence()+" ------------------");
        System.out.println("---------------- Power : "+enemy.getPower()+" ------------------");
        System.out.println("---------------- Xp : "+enemy.getXp()+" ------------------");
        System.out.println("---------------- Lvl : "+enemy.getLvl()+" ------------------\n");
    }


    public void physicalAttack(Enemy enemy) {

        System.out.println(getName() + " lance attaque physique");

        if (getPower() - enemy.getDef() < 0 ){
            enemy.setHp(enemy.getHp());
        } else {
            enemy.setHp(enemy.getHp() - (getPower() - (enemy.getDef())));

        }

        if (enemy.getHp() < 0) {
            enemy.setHp(0);
        }

        System.out.println(enemy.getClass().getName() + " a maintenant " + enemy.getHp() + " HP\n");
    }

    public void forceAttack(Enemy enemy) {

        System.out.println(getName() + " lance attaque force");

        if ((getForce() / 10) * 2 < 0) {
            enemy.setHp(enemy.getHp());
        } else {
            enemy.setHp(enemy.getHp() - ((getForce() / 10) * 2));
        }


        if (enemy.getHp() < 0) {
            enemy.setHp(0);
        }

        System.out.println(enemy.getClass().getName() + " a maintenant " + enemy.getHp() + " HP\n");
    }

    public void armedAttack(Enemy enemy) {

        System.out.println(getName()+" lance attaque armée");

        if (getIntelligence() - enemy.getDef() < 0) {
            enemy.setHp(getHp());
        } else {
            enemy.setHp(enemy.getHp() - getIntelligence() - (enemy.getDef()));
        }

        if (enemy.getHp() < 0) {
            enemy.setHp(0);
        }

        System.out.println(enemy.getClass().getName()+" a maintenant "+enemy.getHp()+" HP\n" );
    }


}
