import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created by iliass on 02/03/2016.
 */
public class Zone  {

    private int room;
    private int lvlEnemy;

    public Zone (int room) {
        this.room = room;
        System.out.println("Vous êtes maintenant dans la zone "+room);
    }


    public int randomLvlEnemy() {
        double d = Math.random();

        if(d >= 0 && d <= 0.33) {
            setLvlEnemy(room);
         } else if (d > 0.33 && d <= 0.66) {
            setLvlEnemy(room + 1);
        } else if (d > 0.66 && d <= 0.99) {
            setLvlEnemy(room + 2);
        }
        return lvlEnemy;
    }

    public int getRoom() {
        return room;
    }

    public void setRoom(int room) {
        this.room = room;
    }

    public int getLvlEnemy() {
        return lvlEnemy;
    }

    public void setLvlEnemy(int lvlEnemy) {
        this.lvlEnemy = lvlEnemy;
    }
}
