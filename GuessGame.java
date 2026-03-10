import java.util.*;

public class GuessGame {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int number = rand.nextInt(100) + 1;
        
   //*System.out.println("Secret number: " + number);

        while (true) {

            System.out.print("Enter your guess: ");
            int guess = sc.nextInt();

            int diff = Math.abs(number - guess);

            if (guess == number) {
                System.out.println("Correct! You guessed the number.");
                break;
            }
            else if (diff <= 10) {
                System.out.println("Hot");
            }
            else {
                System.out.println("Cold");
            }

        }

        sc.close();
    }
}