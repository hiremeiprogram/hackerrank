import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[][] = new int[n][n];
        for(int a_i=0; a_i < n; a_i++){
            for(int a_j=0; a_j < n; a_j++){
                a[a_i][a_j] = in.nextInt();
            }
        }
        int sum_ltr = 0;
        int sum_rtl = 0;
        for(int a_x=0; a_x < n; a_x++){
            sum_ltr += a[a_x][a_x];
            sum_rtl += a[(n-1)-a_x][a_x];
        }
        System.out.println(Math.abs(sum_ltr-sum_rtl));
    }
}

