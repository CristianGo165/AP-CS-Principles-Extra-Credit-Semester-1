import java.util.Random;
import java.util.Arrays;

public class raffle{
    public int[] generateRandomList(){

        Random random = new Random();
        int listLength = 10;
        int extent = 1000;
        int[] randList = new int[listLength];

        //Generates the list of random ticket numbers
        for (int i = 0; i < randList.length; i++) {
            randList[i] = random.nextInt(extent);
        }

        //Sorts List
        Arrays.sort(randList);

        /*Prints list
        System.out.println("Raffle List");
        for (int i = 0; i < randList.length; i++) {
            System.out.println(randList[i]);
        }
        System.out.println("Raffle List");
        prints list*/
        
        return randList;
    }


}
