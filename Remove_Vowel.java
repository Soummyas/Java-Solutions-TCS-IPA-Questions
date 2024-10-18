/* Remove Vowel From A String 

 * Input : Arijit Ghosh
 * Output : rjt Ghsh
 */
/*
// String str = "Arijit Ghosh";
        // String ans= "";
        
        // for (int i = 0; i < str.length(); i++) {
        //   if(str.charAt(i) != 'A' && str.charAt(i) !=  'a' && str.charAt(i) != 'E' && str.charAt(i) !=  'e' && str.charAt(i) != 'I' && str.charAt(i) !=  'i' && str.charAt(i) != 'O' && str.charAt(i) !=  'o' && str.charAt(i) != 'U' && str.charAt(i) !=  'u' ){
        //         ans+=str.charAt(i);
        //   }
        // }
        // System.out.println(ans);
*/
import java.util.*;
public class Remove_Vowel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String s="";
        char[] dic = {'A','a','E','e','I','i','O','o','U','u'};
        for (int i = 0; i < str.length(); i++) {
            int c = 0;
            for (int j = 0; j < dic.length; j++) {
                if(str.charAt(i)==dic[j])
                {
                    c++;
                }
            }
            if(c==0)
            {
                s = s + str.charAt(i);
            }
        }
        System.out.println(s);
    }
}
