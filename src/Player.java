import java.util.Random;

public class Player {
    private Random random = new Random();
    private String firstName = "domyœlny";

    public Player() {}
    public Player(String firstName) {
        setFirstName(firstName);
    }

    public int guess() {
        return random.nextInt(6)+1;
    }

    public void setFirstName(String firstName) {
        if (firstName != null && !firstName.isEmpty()) {
        	this.firstName = firstName;
        }
        else {
        	System.err.println("Nieprawid³owe dane");
        }
    }

    public String getFirstName() {
        return this.firstName;
    }
}