//a2b3c1 = aabbbc
/*

public class Main
{
	public static void main(String[] args) {
	    String str = "a5b3c1";
		for (int i  = 0; i<str.length(); i++) {
		   if(Character.isDigit(str.charAt(i))){
		        int x = Integer.parseInt(Character.toString(str.charAt(i)));
		        for(int j = 0; j < x; j++){
		            System.out.print(str.charAt(i - 1));
		        }
		    }
		   
		}
	}
}
*/
import java.util.*;
public class RepeatedNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        for (int i = 0; i < s.length(); i++) 
        {
            if(Character.isAlphabetic(s.charAt(i)))
            {
                System.out.print(s.charAt(i));
            }
            else if(Character.isDigit(s.charAt(i))){
                int x = Integer.parseInt(String.valueOf(s.charAt(i)));
                for (int j = 1; j < x; j++) {
                System.out.print(s.charAt(i-1));
                }
            }
        }
    }
}
/*

public class Main
{
	public static void main(String[] args) {
		String str = "a4b3c1";
		String temp = "";
		for (int i = 0; i<str.length(); i++){
		    if(Character.isAlphabetic(str.charAt(i))){
		        temp += str.charAt(i);
		    }
		    else if(Character.isDigit(str.charAt(i))){
		        int x = Integer.parseInt(String.valueOf(str.charAt(i)));
		        for(int j = 1; j<x; j++){
		            temp+=str.charAt(i - 1);
		        }
		    }
		}
		System.out.println(temp);
	}
}
*/
