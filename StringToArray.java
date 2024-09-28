import java.util.*;
public class StringToArray {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char[] arr = new char[str.length()];
        for(int i=0; i<str.length(); i++)
        {
            arr[i]=str.charAt(i);
        }
        System.out.println(Arrays.toString(arr));
    }
}


/*
// import java.util.*;
// public class Main
// {
// 	public static void main(String[] args) {
// 	    Scanner sc = new Scanner(System.in);
// 		System.out.println("String to array");
// 		String s = sc.nextLine();
// 	char arr [] = new char[s.length()];
// 		for(int i = 0; i<s.length(); i++){
// 		    arr[i] = s.charAt(i);
// 		}
// 			for(int i = 0; i<s.length(); i++){
// 		    System.out.print(arr[i]);
// 		}
// 	}
// }




// import java.util.*;
// public class Main
// {
// 	public static void main(String[] args) {
// 	    Scanner sc = new Scanner(System.in);
// 		System.out.println("String to array");
// 		String s = sc.nextLine();
// 		String arr [] = new String[s.length()];
// 		for(int i = 0; i<s.length(); i++){
// 		    arr[i] = Character.toString(s.charAt(i));
// 		}
// 			for(int i = 0; i<s.length(); i++){
// 		    System.out.print(arr[i]);
// 		}
// 	}
// }


*/
