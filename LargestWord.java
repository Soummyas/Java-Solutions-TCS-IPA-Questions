/* Find largest word from a given sentence
 * 
 Input: He is so funny boy
 Output: funny
 */
/*
import  java.util.*;
public class LargestWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String ans = "";
        String [] arr = str.split(" ");
        int n = arr[0].length();
        for(int i = 0; i<arr.length; i++){
            if(arr[i].length() > n){
                ans = arr[i];
                n = arr[i].length();
            }
        }
        System.out.println(ans);
    }
}

*/
import java.util.*;
public class LargestWord {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] arr = s.split(" ");
        String large = "";
        for (int i = 0; i < arr.length; i++) 
        {
             if(arr[i].length()>large.length())
             {
                 large = arr[i];
             }
        }
        System.out.println("The largest string is: "+large);
     } 
}
