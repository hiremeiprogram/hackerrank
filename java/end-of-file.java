import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = 1;
        String s = "";
        while(scan.hasNext()){
            s = scan.nextLine();
            System.out.println(i + " " + s);
            i++;
        }
    }
}

