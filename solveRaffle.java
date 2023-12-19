public class solveRaffle {
    public String solveRaffleTwo(int winNum, int[] raffles){
        int sumStore = 0;
        for (int i = 0; i < (raffles.length - 1); i++) {
            int currentSum = raffles[i] + raffles[i+1];
            if((currentSum) == winNum){
                return ("Winning indexes are: " + i + " and " + (i+1) + " and winning sums are " + raffles[i] + " and " + raffles[i+1]);
            }

            if((currentSum) > sumStore){
                sumStore = raffles[i] + raffles[i+1];
            }
        }

        return ":[" + " closest sum is " + sumStore;
    }
}
