import java.util.HashSet;

public class Buddy_Strings_859 {
    public static void main(String[] args) {
        System.out.println("buddyStrings(\"aa\", \"aa\") = " + buddyStrings("ab", "ba"));
    }

    public static boolean buddyStrings(String s, String goal) {
        HashSet<Character> hashSet = new HashSet<>();

        if (s.length() == goal.length()) {
            int count = 0;
            for (int i = 0; i < s.length(); i++) {
                hashSet.add(s.charAt(i));
                if (s.charAt(i) != goal.charAt(i)) {
                    count++;
                    if (count > 2) {
                        return false;
                    }
                }
            }
            if (hashSet.size() != s.length()) return true;
            if (count == 0) return false;
            else return true;


        }
        return false;
    }
}
