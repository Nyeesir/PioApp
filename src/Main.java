import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Random rand = new Random();
        Player player = new Player("Janek");
        int number;
        int guess;

        do {
            System.out.println("---------------------");

            number = rand.nextInt(6) + 1;
            System.out.println("Kostka: " + number);

            guess = player.guess();
            System.out.println("Gracz " + player.getFirstName()+ ": " + guess);

            if (number != guess) {
                System.out.println("PUD£O!");
            }
            else {
                System.out.println("BRAWO!");
            }

        } while (number != guess);
    }
}