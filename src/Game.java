import java.util.ArrayList;
import java.util.MissingResourceException;
import java.util.Random;

public class Game {
    Random rand = new Random();
    ArrayList<Player> playerList = new ArrayList<Player>();

    private void checkIfEmpty(){
        if (playerList.isEmpty()){
            throw new IllegalArgumentException();
        }
    }
    public void addPlayer(Player player){
        playerList.add(player);
    }

    public void play(){
        checkIfEmpty();

        int number;
        int guess;

        do {
            System.out.println("---------------------");

            number = rand.nextInt(6) + 1;
            System.out.println("Kostka: " + number);

            guess = playerList.get(0).guess();
            System.out.println("Gracz " + playerList.get(0).getFirstName()+ ": " + guess);

            if (number != guess) {
                System.out.println("PUDŁO!");
            }
            else {
                System.out.println("BRAWO!");
            }

        } while (number != guess);
    }
}
