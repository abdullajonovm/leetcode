public class Ugly_Number_263 {
    public static void main(String[] args) {
        System.out.println("isUgly(100) = " + isUgly(100));
    }
    public static boolean isUgly(int num) {
        if(num == 0) return false;
        while(num % 2 == 0) num /= 2;
        while(num % 3 == 0) num /= 3;
        while(num % 5 == 0) num /= 5;

        return num == 1;
    }
}
