public class PerfectNumber_507 {
    public static void main(String[] args) {
        System.out.println("checkPerfectNumber(28) = " + checkPerfectNumber(7));
    }

    public static boolean checkPerfectNumber(int num) {
        if (num == 1) return false;

        int sum = 0;
        int number = (int) Math.sqrt(num);
        if (number == Math.sqrt(num)){
            sum += number;
        }
        for (int i = 2; i < number; i++) {
            if (num % i == 0) {
                sum += i;
                sum += num / i;
            }
        }
        sum++;

        return sum == num;
    }

    // if (num == 1) return false;
    //
    //        int sum = 0;
    //        for (int i = 2; i <= Math.sqrt(num); i++) {
    //            if (num % i == 0) {
    //                sum += i;
    //                if (i != num / i) sum += num / i;
    //            }
    //        }
    //        sum++;
    //
    //        return sum == num;
}
