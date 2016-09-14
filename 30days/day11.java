import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[][] = new int[6][6];
        for(int i=0; i < 6; i++){
            for(int j=0; j < 6; j++){
                arr[i][j] = in.nextInt();
            }
        }
        int greatest = arr[1][1] + arr[1][2] + arr[1][3] + arr[2][2] + arr[3][1] + arr[3][2] + arr[3][3];
        int current;
        for(int k=0; k < 4; k++){
            for(int l=0; l < 4; l++){
                current = arr[k][l] + arr[k][l+1] + arr[k][l+2] + arr[k+1][l+1] + arr[k+2][l] + arr[k+2][l+1] + arr[k+2][l+2];
                
                if(current > greatest){
                    greatest = current;
                }
            }
        }
        System.out.println(greatest);
    }
}
