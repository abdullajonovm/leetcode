import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Combination_Sum_39 {
    public static void main(String[] args) {
        int[] candidates = new  int[]{2, 3, 6, 7, 8, 8, 2};//[2,3,6,7]
        List<List<Integer>> combinationSum = combinationSum(candidates, 8);
        System.out.println("combinationSum.toString() = " + combinationSum.toString());
        for (List<Integer> integerList : combinationSum) {
            for (Integer integer : integerList) {
                System.out.print(" " + integer);
            }
            System.out.println();
        }

    }


    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<Integer> numbers = new ArrayList<>();
        List<List<Integer>> num = new ArrayList<>();

        for (int candidate : candidates) {
            if (candidate < target) {
                if (target % candidate == 0) {
                    List<Integer> integerList = new ArrayList<>();
                    for (int i = 0; i < target / candidate; i++) {
                        integerList.add(candidate);
                    }
                    num.add(integerList);
                }
                numbers.add(candidate);

            } else if (candidate == target) {
                num.add(Collections.singletonList(candidate));
            }
        }
        Collections.sort(numbers, Collections.reverseOrder());
        for (int i = 0; i < numbers.size(); i++) {

        }
        return num;
    }
}
