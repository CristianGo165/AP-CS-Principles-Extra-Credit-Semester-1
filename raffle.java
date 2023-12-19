import java.util.Random;

public class raffle{

    public int[] generateRandomList(){

        Random random = new Random();
        int listLength = 10;
        int extent = 1000;
        int[] randList = new int[listLength];

        for (int i = 0; i < randList.length; i++) {
            randList[i] = random.nextInt(extent);
        }

        System.out.println("Raffle List");
        //Prints list
        for (int i = 0; i < randList.length; i++) {
            System.out.println(randList[i]);
        }
        //prints list
        System.out.println("Raffle List");

        return randList;
    }


}
