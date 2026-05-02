import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BirthOfBot birthOfBot = new BirthOfBot("Aid", 2026);

        System.out.println("Hello! My name is "+ birthOfBot.getBotName());
        System.out.println("I was created in "+ birthOfBot.getBirthOfBot());
    }
}
