import java.util.Arrays;
import java.util.Random;

public class AA_BenchSort_Algoritm {
    public static void main(String[] args) {
        int maxArraySize = 1000; // this is the size of the array
        int[] sortArrayOne = new int[maxArraySize]; // First array
        int[] sortArrayTwo = new int[maxArraySize]; // Second array
        for (int i = 0; i < sortArrayOne.length; i++) {
            sortArrayOne[i] = new Random().nextInt();
            sortArrayTwo[i] = sortArrayOne[i];
        }
        long startTimeArrayTwo = System.currentTimeMillis();
        Arrays.sort(sortArrayTwo);
        long runTimeArrayTwo = System.currentTimeMillis() - startTimeArrayTwo;
        long startTimeArrayOne = System.currentTimeMillis();
        SelectionSort(sortArrayOne);
        long runTimeArrayOne = System.currentTimeMillis() - startTimeArrayOne;

        System.out.println("SelectionSort time(sec) = " + runTimeArrayOne / 1000.0);
        System.out.println("Arrays.sort time(sec) = " + runTimeArrayTwo / 1000.0);

        System.out.println("sortArrayTwo.toString().equals(sortArrayOne.toString()) = " + (sortArrayTwo.toString().substring(10).equals(sortArrayOne.toString().substring(10))));
        for (int i = 0; i < maxArraySize; i++) {
            System.out.print("sortArrayOne[i] = " + sortArrayOne[i] + "  ");
            System.out.println("sortArrayTwo[i] = " + sortArrayTwo[i]);
        }
    }

    static void SelectionSort(int[] A) {
        for (int lastPlace = A.length - 1; lastPlace > 0; lastPlace--) {
            int maxLoc = 0;
            for (int j = 1; j <= lastPlace; j++) {
                if (A[j] > A[maxLoc]){
                    maxLoc = j;
                }
            }
            int temp = A[maxLoc];
            A[maxLoc] = A[lastPlace];
            A[lastPlace] = temp;
        }
    }

}
