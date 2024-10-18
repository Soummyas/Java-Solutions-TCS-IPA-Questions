/* Remove duplicate characters in a string
 * 
 * Input : Arijit Ghosh
 * Output : Arijt Ghos
 */
/*
public class Remove_Duplicate {
    public static String  removeDup(String s){
        String ans = "";
        for (int i = 0; i < s.length(); i++) {
            if(!ans.contains(Character.toString(s.charAt(i)))){
                ans+=Character.toString(s.charAt(i));
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        String str = "Arijit Ghoshi";
       String s []  = str.split(" ");
        for (int i = 0; i < s.length; i++) {
            System.out.print(removeDup(s[i]) + " ");
        }


        // String str = "Arijit Ghosh";
        // String ans = "";
        // for(int i = 0; i< str.length(); i++){
        //     if(!ans.contains(Character.toString(str.charAt(i)))){
        //         ans+=Character.toString(str.charAt(i));
        //     }
        // }
        // System.out.println(ans+"");
    }
}


*/
import java.util.*;
public class Remove_Duplicate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String ch = "";
        int i,j;
        for (i = 0; i < str.length(); i++) {
            for (j = 0; j < i; j++)
            {
                if(str.charAt(i)==str.charAt(j))
                {
                    break;
                }
            }
            if(i==j)
            {
                ch = ch+str.charAt(i);
            }
        }
        System.out.println("New string removing Duplicates : "+ch);
    }
}
