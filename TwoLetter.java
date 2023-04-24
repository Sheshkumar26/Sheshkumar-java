import java.util.*;

public class TwoLetter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int count = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            StringBuilder sb = new StringBuilder(s);
            sb.delete(i, i + 2);
            String newString = sb.toString();
            Set<Character> set = new HashSet<>();
            for (int j = 0; j < newString.length(); j++) {
                set.add(newString.charAt(j));
            }
            if (set.size() > count) {
                count = set.size();
            }
        }
        System.out.println(count);
    }
}
