import java.io.*;
import java.util.*;

public class Solution {
    Stack<Character> lifo = new Stack<>();
    Queue<Character> fifo = new LinkedList<>();
    
    void pushCharacter(char ch){
        lifo.push(ch);
    }
    
    char popCharacter(){
        return lifo.pop();
    }
    
    void enqueueCharacter(char ch){
        fifo.add(ch);
    }
    
    char dequeueCharacter(){
        return fifo.remove();
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        scan.close();

        // Convert input String to an array of characters:
        char[] s = input.toCharArray();

        // Create a Solution object:
        Solution p = new Solution();

        // Enqueue/Push all chars to their respective data structures:
        for (char c : s) {
            p.pushCharacter(c);
            p.enqueueCharacter(c);
        }

        // Pop/Dequeue the chars at the head of both data structures and compare them:
        boolean isPalindrome = true;
        for (int i = 0; i < s.length/2; i++) {
            if (p.popCharacter() != p.dequeueCharacter()) {
                isPalindrome = false;                
                break;
            }
        }

        //Finally, print whether string s is palindrome or not.
        System.out.println( "The word, " + input + ", is " 
                           + ( (!isPalindrome) ? "not a palindrome." : "a palindrome." ) );
    }
}
