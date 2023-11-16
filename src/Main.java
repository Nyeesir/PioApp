import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Random rand = new Random();

        int mode = 1;
        Player player;
        if (mode == 1)
            player = new PlayerComp();
        else
            player = new PlayerHuman();

        try{
            player.setFirstName("");
        }
        catch (IllegalArgumentException ex){
            System.err.println("błąd");
        }

        int number;
        int guess;

        do {
            System.out.println("---------------------");

            number = rand.nextInt(6) + 1;
            System.out.println("Kostka: " + number);

            guess = player.guess();
            System.out.println("Gracz " + player.getFirstName()+ ": " + guess);

            if (number != guess) {
                System.out.println("PUDŁO!");
            }
            else {
                System.out.println("BRAWO!");
            }

        } while (number != guess);
    }
}