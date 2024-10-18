/*
 * You are given a string S consisting of lowercase letters. Your task is to remove all the consecutive duplicates from
 * the string and output the result. For example, if the input string is "abbcddeff", the output should be "abcdef".
 * 
 * Input: abbcddeff
 * Output: abcdef
 */

/*
 String str = "aaaaaaazzaaabbcddeffa";
       String ans = Character.toString(str.charAt(0));
       for (int i = 1; i < str.length(); i++) {
         char prev = str.charAt(i - 1);
         char curr = str.charAt(i);
         if(prev != curr){
            ans+=curr;
         }    
       }

       System.out.println(ans);
*/
/*

public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		String str = "abbbccddeefffa";
		char ch = '\0';
		String ans = "";
		for (int i = 0; i<str.length(); i++){
		    if(str.charAt(i) != ch){
		        ch = str.charAt(i);
		        ans += ch;
		    }
		}
		System.out.print(ans);
		
	}
}
*/
import java.util.*;
public class Remove2ConsecutiveLetter 
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String result = removeConsecutiveDuplicates(s);
        System.out.println(result);
    }

    private static String removeConsecutiveDuplicates(String s) {
        String str = "";
        char ch = '\0';
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)!=ch)
            {
                ch = s.charAt(i);
                str += ch;
            }
        }
        return str;
    }
}

