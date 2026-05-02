import java.util.Scanner;

public class AgeGuess {
    private int remainder3;
    private int remainder5;
    private int remainder7;

    public AgeGuess(Scanner scanner){
        System.out.print(" > ");
        this.remainder3 = scanner.nextInt();
        System.out.print(" > ");
        this.remainder5 = scanner.nextInt();
        System.out.print(" > ");
        this.remainder7 = scanner.nextInt();
    }

    public int guessTheAgeOfUser(){
        return (remainder3 * 70 + remainder5 * 21 + remainder7 * 15) % 105;
    }
}
