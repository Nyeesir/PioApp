import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Player player;
        try {
            player = new PlayerComp("KamilŚlimaK");
        } catch (IllegalArgumentException ex){
            player = new PlayerComp("Anonim");
        }
        Game game = new Game();
        game.addPlayer(player);
        game.play();
    }
}