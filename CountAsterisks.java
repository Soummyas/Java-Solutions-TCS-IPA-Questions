// https://chatgpt.com/share/67272b04-0ae4-8006-8473-5616e2f8057f
import java.util.*;
public class practice2
{
    public static void main(String[]args)
    {
        int a=0,b=0;
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char[] arr = s.toCharArray();
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]=='*')
            {
                a++;
            }
            if(arr[i]=='#')
            {
                b++;
            }
        }
        System.out.println(a-b);
    }    
}
