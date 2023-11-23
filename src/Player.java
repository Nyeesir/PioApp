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
        if (firstName != null && firstName.matches("^[\\p{Lu}\\p{Ll}\\p{Nd}.\\-_]{3,}$")) { //^[A-Za-z0-9.\-_]{3,}$
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
