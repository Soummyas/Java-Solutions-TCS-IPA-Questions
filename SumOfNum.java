/* Input : 123Arijit1998Arijit10

 * Process :
 * -----------
 * Array : [123, Arijit, 1998, Arijit, 10]
 * Now you should sum up the position of that array where numbers are stored.
 * 123 + 1998 = 2121
 * 
 * Output :
 * --------------
 * 2131
 */
//https://chatgpt.com/share/66f8332f-8840-8006-84cb-4f239a59a7b3


package smallCodes;
// https://github.com/Soummyas/Java-Solutions-TCS-IPA-Questions/edit/main/SumOfNum.java
// https://chatgpt.com/c/671a0644-dbcc-8008-a05a-8ee97bd52929
// My code
// public class SumOfNum {
//     public static void main(String[] args) {
//         String str = "123abc1998def10zxy31";
//         int x =0;
//         String numTemp = "";
//         int sum = 0;
//         for (int i = 0; i < str.length(); i++) {
//            char ch = str.charAt(i);
//            if(Character.isDigit(ch)){
//             numTemp += Character.toString(ch);
//            }
//            else{
//              x = Integer.parseInt(numTemp);
//             sum+=x;
//             numTemp = "0";
            
//            }
//         }
//         if (!numTemp.isEmpty()) {
//             x = Integer.parseInt(numTemp);
//             sum += x;
//         }
//         System.out.println(sum);
//     }
// }


// ChatGPT Code
// package smallCodes;
// public class SumOfNum {
//     public static void main(String[] args) {
//         String str = "123abc1998def10zxy5869";
//         int x = 0;
//         String numTemp = "";
//         int sum = 0;

//         for (int i = 0; i < str.length(); i++) {
//             char ch = str.charAt(i);
//             if (Character.isDigit(ch)) {
//                 numTemp += ch;  // Append the digit to numTemp
//             } else {
//                 // Only parse and add if numTemp is not empty
//                 if (!numTemp.isEmpty()) {
//                     x = Integer.parseInt(numTemp);
//                     sum += x;
//                     numTemp = "";  // Reset numTemp after processing
//                 }
//             }
//         }

//         // After the loop, check if there's a number left in numTemp
//         if (!numTemp.isEmpty()) {
//             x = Integer.parseInt(numTemp);
//             sum += x;
//         }

//         System.out.println(sum);
//     }
// }




import java.util.*;
public class SumOfNum 
{
    public static void main(String[] args) 
    {
        int sum=0,num=0;
        String str = "123Arijit1998Arijit10";
        for (int i = 0; i < str.length(); i++) {
            if(Character.isDigit(str.charAt(i)))
            {
                num=(num*10)+Integer.parseInt(String.valueOf(str.charAt(i)));
            }
            else if(num!=0)
            {
                sum = sum+num;
                num=0;
            }
        }
        if(num>0)
        {
            sum = sum+num;
        }
        System.out.println(sum);
    }
}
