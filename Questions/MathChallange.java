package Questions;

import java.util.Scanner;

public class MathChallange {

    String Division(int n1, int n2) {
        Integer result = (int) Math.round(n1 / (double) n2);
        String str[] = result.toString().split("");
        int count = 0;
        for (int i = str.length - 2; i >= 0; i--) {
            count++;
            if (count % 3 == 0) {
                str[i] = str[i] + ",";
                count = 0;
            }
        }
        String op = "";
        for (int i = 0; i < str.length; i++) {
            op += str[i];
        }
        return op;
    }

    public static void main(String[] args) {
        System.out.println("Math Challenge......");
        Scanner sc = new Scanner(System.in);
        MathChallange c = new MathChallange();
        System.out.println("Enter n1 ");
        int n1 = sc.nextInt();
        System.out.println("Enter n2 ");
        int n2 = sc.nextInt();
        System.out.print(c.Division(n1, n2));
    }
}