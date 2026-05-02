import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        Name and Birth of the Bot
        BirthOfBot birthOfBot = new BirthOfBot("Aid", 2026);

        System.out.println("Hello! My name is "+ birthOfBot.getBotName());
        System.out.println("I was created in "+ birthOfBot.getBirthOfBot());

//        Introduction and Greeting the user
        System.out.println("Please, Remind me your name.");
        System.out.print(" > ");
        UserIntroduction userIntroduction = new UserIntroduction(scanner.next());
        System.out.println("What a great name you have, "+ userIntroduction.getYourName());

//        Age Guessing
        System.out.println("Let me guess your age.");
        System.out.println("Enter remainders od dividing you age by 3, 5 and 7.");
        AgeGuess ageGuess = new AgeGuess(scanner);
        System.out.println("Your age is "+ ageGuess.guessTheAgeOfUser()+ "; that's a good time to start programming!");
    }
}
