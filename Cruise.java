/*

// https://chatgpt.com/share/67272b34-3914-8006-b024-e82183d70ef7

// Searched 4 sites

// “Java code maximum number of guests on cruise at an instance”
// bing.com

// GitHub — csa0820/A party has been organised on a cruise. The party is organised for a limited time (T). The number of guests entering (E[i]) and leaving (L[i]) the party at every hour is represented as elements of the array. The task is to find the maximum number of guests present on the cruise at any given instance within T hours. Sample Input: 5 ---> Value of T [7,0,5,1,3] ---> E[], element of E[0] to E[N-1], where input each element is separated by new line [1,2,1,3,4] -----> L[],element of L[0] to L[N-1], where input each element is separated by new line Sample Output: 8 -----> Maximum number of guests on cruise at an instance at main · mokshithreddymettireddy/csa0820 · GitHub
// github.com

// GitHub — TCS Coding Questions | Practice Questions - PrepInsta
// prepinsta.com

// PREP INSTA — CSA0861/A party has been organised on a cruise. The party is organised for a limited time (T). The number of guests entering (E[i]) and leaving (L[i]) the party at every hour is represented as elements of the array. The task is to find the maximum number of guests present on the cruise at any given instance within T hours at main · NandaGopalaKrishna192211859/CSA0861 · GitHub
// github.com

// Programming Language Tutorials - ISNT — Maximum Number Of Guests On Cruise At An Instance Tcs With Code Examples
// isnt.org.in
 
// https://github.com/Soummyas/Java-Solutions-TCS-IPA-Questions/blob/main/Cruise.java
// https://prepinsta.com/tcs-coding-questions/question-5/
public class  Cruise
{
	public static void main(String[] args) {
		int curG = 0;
		int maxG = 0;
		int maxhour = 0;
		int curhour = 0;
		
// 		int T = 5;
// 		int [] E = {7,0,5,1,3 };
// 		int [] L = {1,2,1,3,4};
	
		int T = 4 ;
		int [] E = {3,5,2,0};
		int [] L = {0,2,4,4};
		
		if(1 <=T && T <= 25){
		for(int  i  = 0; i <T ; i++){
		    curhour ++;	 // 1 2 
		    curG += E[i] - L[i]; // 3 
		         if(maxG < curG){ 
    		        maxG = curG;
    		        maxhour = curhour;
		        }
		}
		System.out.println(maxG);
			System.out.println(maxhour );
		}
		
		
	}
}

*/
import java.util.*;
public class practice3
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of time : ");
        int n = sc.nextInt();
        int[] E = new int[n];
        int[] L = new int[n];
        if(1<=n && n<=25)
        {
            for(int i=0; i<n; i++)
            {
                System.out.print("Entry "+(i+1)+":");
                E[i] = sc.nextInt();
            }
            for(int i=0; i<n; i++)
            {
                System.out.print("Leave "+(i+1)+":");
                L[i] = sc.nextInt();
            }
        }
        int[] rem = new int[n];
        int r = 0;
        for (int i=0; i<n; i++)
        {
             r = r+E[i]-L[i];
             rem[i] = r;
        }
        for(int i=0;i<n;i++)
        {
            System.out.print(rem[i]+" ");
        }
        System.out.print("\nMaximum number of guests on cruise at an instance : ");
        int k = Arrays.stream(rem).max().getAsInt();
        System.out.println(k);

    }
}
