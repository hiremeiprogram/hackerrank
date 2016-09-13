import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String time = in.next();
        String hour = time.substring(0,2);
        String rest = time.substring(2,8);
        if(time.startsWith("12") && time.contains("AM")){
            System.out.println("00" + rest);
        }
        else if(time.startsWith("12") && time.contains("PM")){
            System.out.println(hour + rest);
        }
        else if(time.contains("PM")){
            int h = 12 + Integer.valueOf(hour);
            hour = Integer.toString(h);
            System.out.println(hour + rest);
        }
        else{
            System.out.println(hour + rest);
        }
    }
}
