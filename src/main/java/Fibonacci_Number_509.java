public class Fibonacci_Number_509 {
    public static void main(String[] args) {
        System.out.println("fib(10) = " + fib(10));
        System.out.println("fibonachi(10) = " + fibonachi(10));
    }

    public static int fibonachi(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1 || n == 2) {
            return 1;
        }
        n = n -1;
        int num1 = 0, num2 = 1, num3 = 0;
        while (n !=0){
            num3 = num1 + num2;
            num1 = num2;
            num2 = num3;
            n--;
        }
        return num3;
    }

    public static int fib(int n) {
        if (n == 1 || n == 2) {
            return 1;
        } else if (n == 0) {
            return 0;
        }
        return fib(n - 1) + fib(n - 2);
    }
}
