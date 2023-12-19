public class runMain{
    public static void main(String[] args){
        raffle raffleScript = new raffle();
        userInput input = new userInput();
        solveRaffle solver = new solveRaffle();

        int winningRaffle = input.userPrompt();
        int[] raffle = raffleScript.generateRandomList();

        System.out.println(solver.solveRaffleTwo(winningRaffle, raffle));
    }
}