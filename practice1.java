/*
https://chatgpt.com/share/67270fab-9008-8008-86d5-d9527cb40e5d

https://github.com/GhoshAgniva/TCS-NQT-QUESTIONS

An automobile company manufactures both a two wheeler (TW) and a four wheeler (FW). 
A company manager wants to make the production of both types of vehicle according to the given data below:

1st data, Total number of vehicle (two-wheeler + four-wheeler)=v 2nd data, Total number of wheels = W 
The task is to find how many two-wheelers as well as four-wheelers need to manufacture as per the given data. Example :
Input : 200 -> Value of V 540 -> Value of W
Output : TW =130 FW=70

Explanation: 130+70 = 200 vehicles (704)+(1302)= 540 wheels

Constraints :

2<=W W%2=0 V<W Print “INVALID INPUT” , if inputs did not meet the constraints.
The input format for testing The candidate has to write the code to accept two positive numbers separated by a new line.

First Input line – Accept value of V. Second Input line- Accept value for W. The output format for testing
Written program code should generate two outputs, 
each separated by a single space character(see the example) Additional messages in the output will result in the failure of test case

*/

/*
To understand the logic for calculating `FW` (the number of four-wheelers) in this problem, let's break down the relationship between `v` (total vehicles) and `w` (total wheels):

1. **Set Up the Problem**:  
   - Let `TW` represent the number of two-wheelers.
   - Let `FW` represent the number of four-wheelers.
   - Since `v` is the total number of vehicles, we know that:
     \[
     TW + FW = v
     \]

2. **Relate Wheels to Vehicle Types**:  
   - Each two-wheeler has 2 wheels, so two-wheelers contribute \( 2 \times TW \) wheels.
   - Each four-wheeler has 4 wheels, so four-wheelers contribute \( 4 \times FW \) wheels.
   - The total number of wheels (`w`) is therefore:
     \[
     2 \times TW + 4 \times FW = w
     \]

3. **Isolate `FW`**:  
   To solve for `FW`, we use these two equations:
   - \( TW + FW = v \)
   - \( 2 \times TW + 4 \times FW = w \)

   Substitute \( TW = v - FW \) from the first equation into the second equation:
   \[
   2 \times (v - FW) + 4 \times FW = w
   \]
   Expanding and simplifying:
   \[
   2v - 2FW + 4FW = w
   \]
   \[
   2FW = w - 2v
   \]
   \[
   FW = \frac{w - 2v}{2}
   \]

4. **Use `FW` to Find `TW`**:  
   After calculating `FW`, you can substitute back to find `TW` as:
   \[
   TW = v - FW
   \]

### Example Walkthrough:
If `v = 200` and `w = 540`:
1. Calculate `FW`:
   \[
   FW = \frac{540 - 2 \times 200}{2} = \frac{540 - 400}{2} = \frac{140}{2} = 70
   \]
2. Calculate `TW`:
   \[
   TW = 200 - 70 = 130
   \]

So, there would be 130 two-wheelers and 70 four-wheelers, which satisfies the conditions given.
*/


import java.util.*;
public class practice1 
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Value of V :");
        int v = sc.nextInt();
        System.out.print("Value of W :");
        int w = sc.nextInt();
        if (w>=2 && w%2==0 && v<w)
        {
            int FW = ((w-2*v)/2);
            int TW = v-FW;
            System.out.println("FW = "+FW);
            System.out.println("TW = "+TW);
        }
        else
        {
            System.out.println("Invalid input");
        }
        
    }    
}
