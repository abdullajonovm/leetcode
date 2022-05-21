public class Rotate_String_796 {
    public static void main(String[] args) {
        String str = "sda";


    }

    public static boolean rotateString(String s, String goal) {
        for (int i = 1; i < s.length(); i++) {
            if ((s.substring(i).concat(s.substring(0, i)).equals(goal))){
                return true;
            }
        }
        return false;
    }

    public static boolean rotateString1(String A, String B) {

        return A.length() == B.length() && (A + A).contains(B);

    }
}
