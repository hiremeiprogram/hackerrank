import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
	
    public static void main(String[] args) {
		// Given
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";
        Scanner scan = new Scanner(System.in);
		// Declare Variables
        int i2;
        double d2;
        String s2;
		// Scan for values
        i2 = scan.nextInt();
        d2 = scan.nextDouble();
        s2 = scan.nextLine();
        s2 += scan.nextLine();
		// Print values
        System.out.println(i + i2);
		System.out.println(d + d2);
        System.out.println(s + s2);
		scan.close();
    }
}
