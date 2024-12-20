/* Check a number is perfect or not

 * Input : 6
 * Output : Perfect Number
 * 
 * Explaination
 * --------------------------
 * The divisors of 6 = 1,2,3. 1+2+3 = 6
 * Sum of the factors is equal to the given number. So this is perfect
 * 
 * Input : 8
 * Output : Not Perfect Number
 * 
 * Explaination
 * -------------------------
 * Factors of 8 = 1,2,4, but 1+2+4 = 7 not equal to 8.
 */

/*
int n = 8;
	int fact [] = new int[0];
	
	for(int i = 1; i<=n/2; i++){
	    if(n % i == 0){
	        fact = Arrays.copyOf(fact, fact.length  + 1);
	        fact [fact. length - 1] = i;
	    }
	    
	}
	    int sum = 0;
	    for(int i = 0; i<fact.length; i++){
	   //  System.out.println(fact[i]);
	      sum+=fact[i];
	    }
        if(sum == n) {
            System.out.println("Perfect num");
        }
        else{
              System.out.println("Not a Perfect num");
        }
*/

import java.util.*;
public class PerfectNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean check = isPerfect(n);
        if(check == true)
        {
            System.out.println("Perfect Number");
        }
        else
        {
            System.out.println("Not Perfect Number");
        }
    }
    public static boolean isPerfect(int n)
    {
        int sum = 0;
        for (int i = 1; i < n; i++) 
        {
            if(n % i == 0)
            {
                sum += i;
            }
        }
        if(sum == n)
        {
            return true;
        }
        return false;
    }
}
