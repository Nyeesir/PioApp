import java.util.Random;

public class PlayerComp extends Player{
    private Random random = new Random();
    public PlayerComp() {
    }
    public PlayerComp(String firstName) {
        super(firstName);
    }
    @Override
    public int guess() {
        return random.nextInt(6)+1;
    }
}
