public class Add_Digits_258 {
    public static void main(String[] args) {
        System.out.println("addDigits(38) = " + addDigits(38));
    }

    public static int addDigits(int num) {
        int sum = num;
        while (sum / 10 > 0.) {
            sum = 0;
            System.out.println("num = " + num);
            System.out.println("num/10 = " + num / 10);
            while (num / 10 > 0. ) {
                sum += num % 10;
                System.out.println("sum = " + sum);
                num = num / 10;
            }
            num = sum;
            System.out.println("num = " + num);
        }
        return sum;
    }

}
