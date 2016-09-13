import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String binary = "";
        String zero = "0";
        String one = "1";
        while(n > 0){
            if(n%2 == 0){
                binary = binary.concat(zero);   
            }
            else{
                binary = binary.concat(one); 
            }
            n = n/2;
        }
        
        int curStreak = 0;
        int bestStreak = 0;
        for(int i = 0; i < binary.length(); i++){
            if(binary.substring(i, i+1).equals("1")){
                
                curStreak = curStreak+1;
                if(curStreak > bestStreak){
                    bestStreak = curStreak;
                }
            }
            else {
                curStreak = 0;
            }
                
            }
        System.out.println(bestStreak);
        }
    }

