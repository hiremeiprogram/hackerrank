import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        
        for(int x = 1; x <= 10; x++){
            int mul = N * x;
            System.out.println(N + " x " + x + " = " + mul);
        }
    }
}
