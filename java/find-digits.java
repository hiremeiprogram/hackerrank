import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            
            int div = 0;
            int m = n;
            while(m > 0){
                if(((m%10) != 0)){
                    if(n%(m%10) == 0){
                        div += 1; 
                    }
                }
                m = m / 10;
                
            }

            System.out.println(div);
        }
        
    }
}
