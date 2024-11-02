/* Find average of a number array between two limit numbers (except the two numbers)
 * Input
 * ---------------
 *  5
    1 
    2
    3
    4
    5
 *  1
 *  4
 * 
 * Output
 * ---------------
 * 2
 */
/*

//corner cases :

//case 1 :low  > up
//case 2 :repeated nums (act as greedy)
//case 3 : both limit up and low same
//case 4 : count is 0 that is low is just behind up, no  number between low an up
//case 5 :  low or high doesnt exist in array element

public class AVG
{
    //not for repeated nums in array or not for when bith limits are samw
	public static void main(String[] args) {
  
        int[] arr = {13,21,322,43,15 ,12,3};
        int low = 21;
        int up = 3;
        
        // int[] arr = {13, 21, 322, 43, 15 ,3};
        // int low = 322;
        // int up = 3;
        
        int findInxexLow = 0;
        int findInxexUP = 0;
        
        
        
         //1. search that num on index and store index in another num for both low and up values
        for (int i = 0; i < arr.length ; i++){
            if(arr[i] == low){
                findInxexLow = i; 
                // System.out.println(findInxexLow);
            }
            if(arr[i] == up){
                findInxexUP = i; 
                //  System.out.println(findInxexUP);
            }
            
        } 
        
        if( findInxexLow >=  findInxexUP) { //case 1 :low  > up //case 3 : both limit up and low same
            System.out.printf("Index not found");
            }
            
            
        int sum = 0;
        int count = 0;
        
        
        //2. if both of them exist then use them as start and end for taking elemnts of arr[i]
        if(findInxexLow != 0 && findInxexUP != 0 ){
         for (int i = findInxexLow + 1; i < findInxexUP ; i++){
            // System.out.println(arr[i]);
             sum+=arr[i];
             count++;
        }
           if(count > 0) //case 4 : count is 0 that is low is just behind up
              System.out.println(sum/count);
        }
        
        
        else{
            System.out.println("Index not found"); //case 5 :  low or high doesnt exist in array element

        }
        
      
         
         
	}
}

*/
import java.util.*;
public class avg 
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++)
        {
            arr[i] = sc.nextInt();
        }
        int low = sc.nextInt();
        int up = sc.nextInt();

        int lowerIndex = index(arr, low);
        
        int upperIndex = index(arr, up);
        if(upperIndex==0)
        {
            System.out.println("Index not found");
        }
        int sum=0, count=0;
        if(upperIndex>0 && lowerIndex+1<upperIndex)
        {
            for(int i=lowerIndex+1; i<upperIndex; i++)
            {
                sum = sum+arr[i];
                count++;
            }
            System.out.println(sum/count);
        }
        
    }

    public static int index(int[] arr, int num)
    {
        for(int i =0; i<arr.length; i++)
        {
            if(arr[i]==num)
            {
                return i;
            }
        }
        return 0;
    }
}
