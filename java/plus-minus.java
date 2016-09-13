import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        for(int arr_i=0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        double pos = 0;
        double neg = 0;
        double zer = 0;
        for(int x = 0; x < n; x++){
            if(arr[x] > 0){
                pos += 1;
            }
            else if(arr[x] < 0){
                neg += 1;
            }
            else{
                zer += 1;
            }
        }
        
        System.out.println(pos/n);
        System.out.println(neg/n);
        System.out.println(zer/n);
    }
}

