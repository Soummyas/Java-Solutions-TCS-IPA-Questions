/*Write a Java program to check if a given number is an Armstrong number or not.

Here's an example of the expected input and output:

Input number: 153
Output: "Yes, the number is an Armstrong number."

*/

import java.util.*;
public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num = sc.nextLine();
        int sum = 0;
        for (int i = 0; i < num.length(); i++) {
            sum+= Math.pow(Integer.parseInt(String.valueOf(num.charAt(i))),3);   
        }
        if(sum == Integer.parseInt(num))
        {
            System.out.println("Yes, the number is an Armstrong number.");
        }
        else{
            System.out.println("No, the number is not an Armstrong number.");
        }
    }
}



/*
/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Main
{
    public static boolean isAmstrong(int n){
        int x = n; 
        int sum = 0;
        int count = 0; //to count the num length to use in power function
        
        //calculate num length
        while(n!=0){
            n=n/10;
            count ++;
        }
       n = x;
        
        while(x!=0){
            int ld = x%10;
            sum+=Math.pow(ld,count);
            x/=10;
        }
        
        
        if(sum == n) return true;
        
        
        return false;
        
    }
	public static void main(String[] args) {
		System.out.println("Hello World");
		int n = 153;
	System.out.println(isAmstrong(n));
	}
}
*/
