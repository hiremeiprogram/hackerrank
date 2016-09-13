import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String month = in.next();
        String day = in.next();
        String year = in.next();
        Calendar date = Calendar.getInstance();
        date.set(Integer.parseInt(year), Integer.parseInt(month)-1, Integer.parseInt(day));
        
        String weekday = date.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG, Locale.US);
        
        System.out.println(weekday.toUpperCase());
    }
}
