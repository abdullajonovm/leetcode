public class Power_of_Thre {
    public static void main(String[] args) {
//        int a = 243;
//        double v = Math.log1p(243) / Math.log1p(3);
//        System.out.println("v = " + v);
//        double b = Math.log(a)/Math.log(3);
//        int c = (int) b;
//        System.out.println("b = " + b);
//        System.out.println("a = " + a);
//        System.out.println(c == b);
//
//        int i = a << 3;
//        System.out.println("i = " + i);
        System.out.println("isPowerOfThree(243) = " + isPowerOfThree(243));
        System.out.println("Math.log(1162261467)/Math.log(3) = " + Math.log(1162261467) / Math.log(3));
    }

    public static boolean isPowerOfThree(int n)
    {
        return (n > 0 && 1162261467 % n == 0);      // 3 ^ 19 = 1162261467
    }
}
