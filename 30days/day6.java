import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String [] s = new String[n];
        String z = scan.nextLine();
        for(int i = 0; i < n; i++){
            String t = scan.nextLine();
            s[i] = t;
        }
        for(int l=0; l<n; l++){
            for(int j = 0; j < s[l].length(); j+=2){
                System.out.print(s[l].charAt(j));
            }
            System.out.print(" ");
            for(int k = 1; k < s[l].length(); k+=2){
                System.out.print(s[l].charAt(k));
            }
            System.out.println("");
        }
       
    }
}
