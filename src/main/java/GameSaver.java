import java.io.*;

public class GameSaver {
    public static void main(String[] args) {
        GameCharacter one = new GameCharacter(50, "Elf", new String[]{"bow", "sword", "dust"});
        GameCharacter two = new GameCharacter(200, "Troll", new String[]{"bare hands", "big ax"});
        GameCharacter three = new GameCharacter(120, "Magician", new String[]{"spells", "invisibility"});


        try {
            FileOutputStream fs = new FileOutputStream("Game.txt");
            System.out.println(fs);
            ObjectOutputStream stream = new ObjectOutputStream(new FileOutputStream("Game.txt"));
            stream.writeObject(one);
            stream.writeObject(two);
            stream.writeObject(three);
            stream.writeObject(new Integer(5));


            stream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        one = null;
        two = null;
        three = null;



        try {
            ObjectInputStream stream = new ObjectInputStream(new FileInputStream("Game.txt"));
            GameCharacter oneRestored = (GameCharacter) stream.readObject();
            GameCharacter twoRestored = (GameCharacter) stream.readObject();
            GameCharacter threeRestored = (GameCharacter) stream.readObject();

            stream.close();
            System.out.println(oneRestored.getWeapons());

        }
        catch(Exception e){

        }



    }

}
