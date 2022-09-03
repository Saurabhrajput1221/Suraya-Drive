package Questions;

import java.util.Scanner;

public class Matrixchallange {
    public static boolean check(int row, int col, int sum) {
        if (sum < 10) {
            if (sum <= col)
                return true;
            else {
                return false;
            }
        }
        // String z = Integer.toString(sum);
        String str = Integer.toString(sum);
        int n = str.length();
        char[] arr = new char[n];
        for (int i = 0; i < n; i++) {
            arr[i] = str.charAt(i);
        }
        int mid = n / 2;
        int i = 0;
        String str1 = "";
        String str2 = "";
        while (i < mid) {
            str1 += str.charAt(i);
            i++;
        }
        int j = mid;
        while (j < n) {
            str2 += str.charAt(j);
            j++;
        }
        int lno = Integer.valueOf(str2);
        int rno = Integer.valueOf(str2);

        if (lno <= row && rno <= col)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        System.out.println("Matrix Challenge......");
        // your code goes here
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        int result = 0;
        int[][] mat = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                mat[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {

                if (i + 1 < row && j + 1 < col) {
                    int sum = mat[i][j] + mat[i][j + 1] + mat[i + 1][j];

                    boolean flage = check(row, col, sum);
                    if (flage == true)
                        result = Math.max(sum, result);
                }

                if (i + 1 < row && j - 1 >= 0) {
                    int sum = mat[i][j] + mat[i][j - 1] + mat[i + 1][j];
                    if (check(row, col, sum))
                        result = Math.max(sum, result);
                }

                if (i - 1 >= 0 && j - 1 >= 0) {
                    int sum = mat[i][j] + mat[i][j - 1] + mat[i - 1][j];
                    if (check(row, col, sum))
                        result = Math.max(sum, result);
                }

                if (i - 1 >= 0 && j + 1 < col) {
                    int sum = mat[i][j] + mat[i - 1][j] + mat[i][j + 1];
                    if (check(row, col, sum))
                        result = Math.max(sum, result);
                }

            }
        }
        System.out.print(result);
    }
}