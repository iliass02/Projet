import java.util.Objects;

/**
 * Created by iliass on 01/03/2016.
 */
public class Room {

    private int room;
    private String name;
    private Enemy enemy;
    private Hero hero;


    public Room(int room) {
        this.room = room;
        Character character = new Character();
        character.setLvl(1);


    }



    public int start(String classe, String name) {
        int i = 0;
        switch (classe) {
            case "jedi":
                hero = new Jedi(name);
                break;
            case "sith":
                hero = new Sith(name);
                break;
            case "bountyhunters":
                hero = new BountyHunter(name);
                break;
            case "mercenary":
                hero = new Mercenary(name);
                break;
            case "jawa":
                hero = new Jawa(name);
                break;
            case "imperialagent":
                hero = new ImperialAgent(name);
                break;
            default:
                System.out.println("Erreur : Veuillez entrer une classe valide");
                i = 1;
                break;
        }
        return i;
    }

    public Enemy generateEnemy() {

        Zone zone = new Zone(room);
        int lvlEnemy = zone.randomLvlEnemy();

        double d = Math.random();

        if (d >= 0 && d <= 0.60) {
            enemy = new Clone(lvlEnemy);
        } else if (d > 0.60 && d <= 0.90) {
            enemy = new Soldat(lvlEnemy);
        } else if (d > 0.90 && d <= 100) {
            enemy = new Droid(lvlEnemy);
        }
        return enemy;
    }

    public void attack (String attack, String classe) {
        switch (attack) {
            case "force":
                if (Objects.equals(attack, "force") && !Objects.equals(classe, "jedi") && !Objects.equals(classe, "sith")) {
                    System.out.println("Attaque impossible : seul les Jedi et les Sith ont le pouvoir de la force");
                } else {
                    hero.forceAttack(enemy);
                    if (enemy.getHp() > 0) {
                        enemy.armedAttack(hero);
                    }
                }
                break;
            case "armée":
                hero.armedAttack(enemy);
                if (enemy.getHp() > 0) {
                    enemy.armedAttack(hero);
                }
                break;
            case "physique":
                hero.physicalAttack(enemy);
                if (enemy.getHp() > 0) {
                    enemy.armedAttack(hero);
                }
                break;
            case "stats":
                hero.stats(hero, enemy);
                break;
            default:
                System.out.println("Erreur: attaque non valide");
                break;
        }
    }


    public int figth () {
        int i = 0;
        if (enemy.getHp() <= 0) {
            System.out.println("Vous avez gagner !");
            hero.setXp(hero.getXp()+10);
            System.out.println("Vous avez maintenant "+hero.getXp()+" points d'XP");
            lvlUp(hero.getXp());
        } else if (hero.getHp() <= 0) {
            System.out.println("Game Over : Vous avez perdue !");
            i = 1;
        }
        return i;
    }

    public void lvlUp(int xp) {
        float checkXp = xp % 50;
        if(checkXp == 0 && xp != 0) {
            hero.setLvl(hero.getLvl()+1);
            hero.setDef((int) (hero.getDef()*1.5));
            hero.setForce((int) (hero.getForce()*1.5));
            hero.setHp((int) (hero.getHp()*1.5));
            hero.setIntelligence((int) (hero.getIntelligence()*1.5));
            hero.setPower((int) (hero.getPower()*1.5));
            System.out.println("Vous êtes maintenant au niveau "+hero.getLvl());

            //check si le niveau du hero est supérieur à sa zone
            if (hero.getLvl() - getRoom() == 2) {
                setRoom(getRoom()+1);
            }
            generateEnemy();

        } else {
            generateEnemy();
        }
    }

    public int getRoom() {
        return room;
    }

    public void setRoom(int room) {
        this.room = room;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Enemy getEnemy() {
        return enemy;
    }

    public void setEnemy(Enemy enemy) {
        this.enemy = enemy;
    }

    public Hero getHero() {
        return hero;
    }

    public void setHero(Hero hero) {
        this.hero = hero;
    }
}
