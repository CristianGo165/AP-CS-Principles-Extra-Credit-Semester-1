public class solveRaffle {
    public String solveRaffleTwo(int winNum, int[] raffles){

        int sumStore = 0;
        int bestIndexOne = 0;
        int bestIndexTwo = 0;

        int distance = 0;
        int distanceCurrent = 0;

        sumStore = raffles[0] + raffles[1];
        distance = Math.abs((sumStore - winNum));

        //Finds sum closest to the winning number
        for(int i = 0 ; i < raffles.length - 1 ; i++){
            //Second loop looks for the sum, after index i, closest to the winning value
            for(int j = i + 1 ; j < raffles.length - 1 ; j++){
                distanceCurrent = Math.abs(((raffles[i] + raffles[j+1]) - winNum));
                //
                if(distanceCurrent <= distance){
                    sumStore = raffles[i] + raffles[j+1];
                    //Changes the "best distance" between the sums and target value
                    distance = distanceCurrent;
                    //Saves the best indices
                    bestIndexOne = i;
                    bestIndexTwo = j+1;
                }
            }
        }

        //Prints the best ticket numbers to the terminal
        System.out.println("Best ticket numbers are: " + raffles[bestIndexOne] + " and " + raffles[bestIndexTwo]);

        //Decides the message based on if sumStore was the winning number
        if(sumStore == winNum){
            return "Winning sum, " + sumStore + ", was found";
        } else{
            return "Closest sum is " + sumStore;
        }
    }
}
