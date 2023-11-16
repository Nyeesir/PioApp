import java.util.Random;

abstract public class Player {
    private Random random = new Random();
    private String firstName = "Anonim";

    public Player() {}
    public Player(String firstName) {
        setFirstName(firstName);
    }

    abstract public int guess();

    public void setFirstName(String firstName) {
        if (firstName != null && !firstName.isEmpty()) {
            this.firstName = firstName;
        }
        else {
            throw new IllegalArgumentException();
        }
    }

    public String getFirstName() {
        return this.firstName;
    }
}