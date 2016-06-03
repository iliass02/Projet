/**
 * Created by iliass on 01/03/2016.
 */
public class Enemy extends Character {

    private String name;

    public Enemy () {
    }

    public void physicalAttack(Hero hero) {
        setName(name);
        System.out.println(getClass().getName() + " lance attaque physique");
        hero.setHp(hero.getHp() - (getPower() - (hero.getDef())));

        if (hero.getHp() < 0) {
            hero.setHp(0);
        }

        System.out.println(hero.getName() + " a maintenant " + hero.getHp() + " HP\n");
    }


    public void armedAttack(Hero hero) {

        System.out.println(getClass().getName()+" lance attaque armée");

        if (getIntelligence() - hero.getDef() < 0) {
            hero.setHp(hero.getHp());
        } else {
            hero.setHp(hero.getHp() - (getIntelligence() - (hero.getDef())));
        }

        if (hero.getHp() < 0) {
            hero.setHp(0);
        }

        System.out.println(hero.getName()+" a maintenant "+hero.getHp()+" HP\n" );
    }



    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }
}
