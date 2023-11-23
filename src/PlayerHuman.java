import java.util.Scanner;

public class PlayerHuman extends Player{
    Scanner scanner = new Scanner(System.in);
    public PlayerHuman(){}
    public PlayerHuman(String firstName){
        super(firstName);
    }
    @Override
    public int guess(){
        System.out.print("Wprowadź liczbę z zakresu 1-6: ");
        return scanner.nextInt();
    }
}
