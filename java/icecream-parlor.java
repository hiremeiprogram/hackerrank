import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        for(int i = 0; i < t; i++){
            int m = scan.nextInt();
            int n = scan.nextInt();
            int c[] = new int[n];
            for(int j = 0; j < n; j++){
                c[j] = scan.nextInt();
            }
            for(int k = 0; k < n; k++){
                for(int l = k+1; l < n; l++){
                    if((c[k] + c[l]) == m){
                        System.out.println((k+1) + " " + (l+1));
                        
                    }
                }
            }
        }
        
    }
}
