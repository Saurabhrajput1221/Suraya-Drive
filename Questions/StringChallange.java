package Questions;

import java.util.Arrays;
import java.util.Scanner;

public class StringChallange {
    static String Strchallenge(String str1, String str2) {
        char[] str1char = str1.toCharArray();
        char[] str2char = str2.toCharArray();
        boolean[] used = new boolean[str1char.length];
        Arrays.fill(used, false);

        Arrays.sort(str1char);
        Arrays.sort(str2char);

        for (char c : str2char) {
            boolean found = false;
            for (int i = 0; i < str1char.length; i++) {
                if (str1char[i] == c && !used[i]) {
                    used[i] = true;
                    found = true;
                    break;
                }
            }
            if (!found) {
                return "false";
            }
        }
        return "true";
    }

    public static void main(String[] args) {
        System.out.println("String challange......");
        Scanner sc = new Scanner(System.in);
        StringChallange c = new StringChallange();
        // System.out.println(c.Strchallenge("rkqodlw", "world"));
        // System.out.println(c.Strchallenge("h3llko", "hello"));
        System.out.println(Strchallenge(sc.nextLine(), sc.nextLine()));

    }
}
