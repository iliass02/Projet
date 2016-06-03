import java.util.Objects;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        Room game = new Room(1);
        Enemy enemy;
        String classe;

        while (true) {
            System.out.println("-------------- Clone Wars -------------- ");

            System.out.println("Nom du personnage : ");
            String name;
            name = keyboard.next();

            System.out.println("Choisir une classe : Jedi, Sith, BountyHunters, Mercenary, Jawa, ImperialAgent");
            classe = keyboard.next().toLowerCase();

             while(game.start(classe, name) == 1) {
                classe = keyboard.next();
             }

            break;
        }

        game.generateEnemy();

        while (true) {

            System.out.println("Quelle attaque voullez vous lancer ? armée, physique, force");
            String attaque = keyboard.next().toLowerCase();

            while (!Objects.equals(attaque, "force") && !Objects.equals(attaque, "armée") && !Objects.equals(attaque, "physique") && !Objects.equals(attaque, "stats")) {
                System.out.println("Erreur : Attaque invalide");
                attaque = keyboard.next().toLowerCase();
            }

            game.attack(attaque, classe);

            if (game.figth() == 1) {
                break;
            }

        }
    }
}
