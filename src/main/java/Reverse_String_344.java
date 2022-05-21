import java.util.Arrays;

public class Reverse_String_344 {
    public static void main(String[] args) {
        char[] arr = new char[] {'a', 'b', 'c', 'd', 'e'};
        System.out.println("arr.toString() = " + Arrays.toString(arr));
        reverseString(arr);
    }

    public static void reverseString(char[] s) {
        System.out.println("s.toString() = " + Arrays.toString(s));
        int len = s.length - 1;
        System.out.println("len = " + len);
        for (int i = 0; i <= len / 2; i++) {
            System.out.println(len - i);
            char a = s[i];
            System.out.println("a = " + a);
            s[i] = s[len - i];
            s[len - i] = a;
        }
        System.out.println("s.toString() = " + Arrays.toString(s));
    }
}
