// https://prepinsta.com/tcs-coding-questions/question-5/

/*
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
