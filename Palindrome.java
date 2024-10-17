/* Check a string is palindrome or not
 * Input: pop
 * Output: Palindrome
 * 
 * Input: Papa
 * Output: None
 */
/*
public class Palindrome {
 public static void main(String[] args) {
     //rev == or ori then palindrome
    String str = "pop";
    String temp = "";
    for(int i = 0; i< str.length(); i++){
        temp = str.charAt(i) + temp;
    }
   if(str.equals(temp))
        System.out.println("Palindrome");
        else{
            System.out.println("Not");
        }
    

 }   
}
*/
import java.util.*;
public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        boolean check = true;
        for(int i=0; i<s.length(); i++)
        {
            if(s.charAt(i)!=s.charAt(s.length()-1-i))
            {
                check = false;
                break;
            }
        }
        if(check == true)
        {
            System.out.println("Palindrome");
        }
        else
        {
            System.out.println("None");
        }
    }
}
