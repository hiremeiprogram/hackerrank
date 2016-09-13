import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int q = in.nextInt();
        int a[] = new int[n];
        for(int arr_i=0; arr_i < n; arr_i++){
            a[arr_i] = in.nextInt();
        }
        int qu[] = new int[q];
        for(int arr_j=0; arr_j < q; arr_j++){
            qu[arr_j] = in.nextInt();
        }
        int b[] = new int[n];
        
        if(k > n){
            for(int i = 0; i < k; i++){
            for(int j = 0; j < n-1; j++){
                b[j+1] = a[j]; 
            }
            b[0] = a[n-1];
            int c[];
            c = a;
            a = b;
            b = c;
        }
        for(int z = 0; z < q; z++){
            System.out.println(a[qu[z]]);
        }
        }
        
        for(int j = 0; j < n-k; j++){
            b[j+k] = a[j]; 
        }
        for(int y = 0; y < k; y++){
            b[y] = a[n-k+y];
        }

        for(int z = 0; z < q; z++){
            System.out.println(b[qu[z]]);
        }
    }
}
