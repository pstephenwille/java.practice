import java.io.Serializable;

public class GameCharacter implements Serializable{
    transient int power;
    String type;
    String[] weapons;
    DotCom dcom;

    public int getPower() {
        return power;
    }

    public String getType() {
        return type;
    }

    public String getWeapons() {
        String weaponsList = "";

        for (int i = 0; i < weapons.length; i++) {
            weaponsList += weapons[i] + ", ";
        }
        return weaponsList;
    }


    public GameCharacter(int p, String t, String[] w) {
        power = p;
        type = t;
        weapons = w;
        dcom = new DotCom();
    }

}
