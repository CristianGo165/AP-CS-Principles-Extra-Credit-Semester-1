import java.util.Scanner;
public class userInput {
    Scanner scanner = new Scanner(System.in);
    public int userPrompt(){
        //Gets the winning number from the user
        System.out.println("Enter the winning raffle number! (0 - 1000): ");
        int winningNum = scanner.nextInt();
        System.out.println("Winning raffle is: " + winningNum);
        return winningNum;
    }
}
