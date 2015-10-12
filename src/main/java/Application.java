import java.util.ArrayList;

public class Application {

    public static void main(String[] args) {
        System.out.println("..."+ Math.random());
        int numOfGuesses = 0;
        GameHelper helper = new GameHelper();
        SimpleDotCom theDotCom = new SimpleDotCom();
        System.out.println(theDotCom.getName("Paul"));

        ArrayList<Object> mylist = new ArrayList<Object>();
        mylist.add(new DotCom());

        DotCom dot = (DotCom)mylist.get(0);

//        System.out.println(theDotCom.myFinal());

        int randomNum = (int) (Math.random() * 5);
        int[] locations = {randomNum, ++randomNum, ++randomNum};
        System.out.println("...locs "+ locations[0] + locations[1] + locations[2]);
        theDotCom.setLocationCells(locations);

        boolean isAlive = true;

        while (isAlive == true) {
            String guess = helper.getUserInput("enter a number");
            String result = theDotCom.checkYourself(guess);
            numOfGuesses++;

            if (result.equals("kill")) {
                isAlive = false;
                System.out.println("you took "+ numOfGuesses +" guesses");
            }
        }


    }
}
