/* Marge two strings using comma

Input: 
Arijit,Ghosh
Pop:Mom

Output:
Arijit, Ghosh, Pop:Mom
*/
/*
import java.util.*;
public class Marge {
    public static void main(String[] args) {
        String str1 = "Arijit,Ghosh";
        String str2 = "Pop:Mom,ABDS";
        String ans[] = new String [0];
        String s1 [] =str1.split(",");
        String s2 [] =str2.split(",");
     //add all elements of s1 in ans
     for (int i = 0; i <s1.length; i++) {
        ans = Arrays.copyOf(ans, ans.length + 1);
        ans[ans.length - 1] = s1[i];
         
     }

    //  then  add all elements of s2 in ans
     for (int i = 0; i <s2.length; i++) {
        ans = Arrays.copyOf(ans, ans.length + 1);
        ans[ans.length - 1] = s2[i];
         
     }
    //  for (int i = 0; i <s2.length + s1.length; i++) {
    //    System.out.println(ans[i]); 
    //  }
    //  System.out.println(Arrays.toString(ans)); 
     String n = Arrays.toString(ans);
     String k = n.substring(1, n.length()-1);
     System.out.println(k);
    }
}
*/
import java.util.*;
public class Marge_Two_String
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        String p1 = sc.nextLine();
        String[] s1 = p1.split(",");
        String p2 = sc.nextLine();
        String[] s2 = p2.split(",");
        for(int i=0 ;i<s2.length; i++)
        {
            s1 = Arrays.copyOf(s1,s1.length+1);
            s1[s1.length-1] = s2[i];
        }
        String n = Arrays.toString(s1);
        String k = n.substring(1, n.length()-1);
        System.out.println(k);
    }
}
