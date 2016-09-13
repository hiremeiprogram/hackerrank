import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();
        int answer = factorial(input);
        System.out.println(answer);
    }
    public static int factorial(int input){
        if(input == 1){
            return 1;
        }
        else{
            return input * factorial(input-1);
        }
    }
}
