import java.util.Random;

public class Player {
    private Random random = new Random();
    private String firstName;

    public Player(String firstName) {
        this.firstName = firstName;
    }

    public int guess() {
        return random.nextInt(6)+1;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return this.firstName;
    }
}
