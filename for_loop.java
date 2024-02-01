//In this file we are using for loop.
//Iam going to print tables of a given number.

//Time Complexity: O(1)
//Space Complexity: O(1)

import java.util.Scanner;

public class for_loop {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number other than 0 = ");
        int num = sc.nextInt();
        int result;
        for(int i = 1; i<= 10; i++)
        {
            result = num*i;
            System.out.println(num + "*" + i + "=" + result);
        }
    }
}
