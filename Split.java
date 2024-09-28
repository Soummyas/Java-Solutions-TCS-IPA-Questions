/*Books are identified by International Standard Book Number(ISBN). ISBNs contain 
13 digits, arranged in five groups such as 978-0-13-110362-8. The first group
(GSI prefix) is currently either 978 or 979. The group identifier specifies the 
language or country of origin (for example 0 and 1 are used for English speaking 
countries). The publisher code identifies the publisher (13 is the code for 
Prentice Hall, New Jersey). The item number is assigned by the publisher to 
identify a specific book (110362 is the code for the book "The C Programming 
Language" by Kernighan and Ritchie) and ISBN ends with a check digit that's used 
to verify the accuracy of preceding digits. Write a program that breaks down the 
ISBN entered by the user.:

Sample Input:
-----------------------
Enter ISBN: 978-0-13-110362-8

Sample Output:
-----------------------
GSI Prefix: 978
Group Identifier: 0
Publisher Code: 13
Item Number: 110362
Check Digit: 8

Note: The number of digits in each group may vary. You can't assume that the 
groups have the length shown in the sample output. You can test your program 
with actual ISBN values (usually found on the back cover of a book and on the 
copyright page */

import java.util.*;
public class Split {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter ISBN: ");
        String n = sc.nextLine();
        String[] data = ExtractElement(n);
        if(data!=null)
        {
            int i=0;
            System.out.println("GSI Prefix: "+data[i++]);
            System.out.println("Group Identifier: "+data[i++]);
            System.out.println("Publisher Code: "+data[i++]);
            System.out.println("Item Number: "+data[i++]);
            System.out.println("Check Digit: "+data[i++]);
        }
    }
    public static String[] ExtractElement(String data)
    {
        String[] num = data.split("-");   
        if(num.length==5)
        {
            return num;
        }
        return null;
    }
}



/*
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Prompt user to enter ISBN
        System.out.print("Enter ISBN: ");
        String isbn = scanner.nextLine();
        
        // Initialize variables to hold each part
        String gsiPrefix = "";
        String groupIdentifier = "";
        String publisherCode = "";
        String itemNumber = "";
        String checkDigit = "";
        
        int group = 0;  // To track which group we are currently processing
        
        for (int i = 0; i < isbn.length(); i++) {
            char ch = isbn.charAt(i);
            
            if (ch == '-') {
                group++;  // Move to the next group
                continue;  // Skip the dash
            }
            
            // Based on the current group, append the character to the appropriate variable
            switch (group) {
                case 0:
                    gsiPrefix += ch;  // Concatenate characters for GSI Prefix
                    break;
                case 1:
                    groupIdentifier += ch;  // Concatenate characters for Group Identifier
                    break;
                case 2:
                    publisherCode += ch;  // Concatenate characters for Publisher Code
                    break;
                case 3:
                    itemNumber += ch;  // Concatenate characters for Item Number
                    break;
                case 4:
                    checkDigit += ch;  // Concatenate characters for Check Digit
                    break;
                default:
                    System.out.println("Invalid ISBN format.");
                    return;  // Exit if more than 5 groups are found
            }
        }
        
        // Display the breakdown of the ISBN
        System.out.println("GSI Prefix: " + gsiPrefix);
        System.out.println("Group Identifier: " + groupIdentifier);
        System.out.println("Publisher Code: " + publisherCode);
        System.out.println("Item Number: " + itemNumber);
        System.out.println("Check Digit: " + checkDigit);
        
        // Close the scanner
        scanner.close();
    }
}
*/
