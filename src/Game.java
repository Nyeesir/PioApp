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

    public void play() {
        checkIfEmpty();

        int number;
        int guess;

        boolean guessed;
        do {
            guessed = false;
            System.out.println("---------------------");

            number = rand.nextInt(6) + 1;
            System.out.println("Kostka: " + number);

            for (Player player : playerList) {
                System.out.println("Gracz "+player.getFirstName());
                guess = player.guess();
                if (number != guess) {
                    System.out.println("PUDŁO!");
                } else {
                    System.out.println("BRAWO!");
                    guessed = true;
                }
            }

        } while (!guessed);
    }
}
