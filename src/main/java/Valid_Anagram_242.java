import java.util.*;

public class Valid_Anagram_242 {

    public static void main(String[] args) {

    }

    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        SortedSet<Character> sortedSet1 = new TreeSet<>();
        SortedSet<Character> sortedSet2 = new TreeSet<>();

        for (int i = 0; i < s.length(); i++) {
            boolean add = sortedSet1.add(s.charAt(i));
            sortedSet2.add(t.charAt(i));
        }
        return sortedSet1.toString().equals(sortedSet2.toString());

    }
}
