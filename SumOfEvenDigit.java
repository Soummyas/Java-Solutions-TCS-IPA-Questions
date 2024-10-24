import java.util.*;
public class SumOfEvenDigit {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        /*int num = sc.nextInt();
        while(num>0)
        {
            int rem = num%10;
            if(rem%2==0)
            {
                sum+=rem;
            }
            num = num/10;
        }*/
        // Another solution
        String str = sc.nextLine();
        for (int i = 0; i < str.length(); i++) 
        {
            int k = Integer.parseInt(String.valueOf(str.charAt(i)));
            if(k%2==0)
            {
                sum+=k;
            }
        }
        System.out.println("The sum of even digit : "+sum);
    }
}



// package smallCodes;

// public class SumOfEvenDigit {
//     public static void main(String[] args) {
//     int sum = 0;
//     String n = "9081726354";
//     for(int i = n.length() - 1; i>=0 ; i--){
//         int ld = Integer.parseInt(Character.toString(n.charAt(i)));
//             if(ld % 2 == 0){
//                 sum+=ld;
//             }
//     }
//     System.out.println(sum);

//     }
// }

