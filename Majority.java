package JAVA;

// Majority of an element means if an element is present in an array for more than n/2 times, 
//  where n is the length of the Array
//  Array = {3, 3, 4, 2, 4, 4, 2, 4, 4} => 4


/*

int arr[] = {3, 3, 4, 2, 4, 4, 2, 4, 4};
        int n = arr.length;
        int threshold = n / 2;
        int count = 1;

        Arrays.sort(arr);
        for (int i = 1; i < n; i++) {
            if (arr[i] == arr[i - 1]) {
                count++;
            } else {
                count = 1;
            }

            if (count > threshold) {
                System.out.println("Majority element is: " + arr[i]);
            
            }
        }
*/



import java.util.*;
public class Majority{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            int  l = sc.nextInt();
            arr[i] = l;
        }
        int k = (n/2);
        int[] p = new int[0];
        int m = 0;
        for (int i = 0; i < n; i++) {
            int count=1;
            for (int j = i+1; j < arr.length; j++)
            {
                if(arr[i]==arr[j] && !Arrays.asList(p).contains(arr[i]))
                {
                    count++;
                }
            }
            p = Arrays.copyOf(p,p.length+1);
            p[p.length-1]=arr[i];
            if(count>k)
            {
                System.out.println("The element : "+arr[i]);
                m++;
            }
        }
        if(m==0)
        {
            System.out.println("There are no elements");
        }
    }
}
