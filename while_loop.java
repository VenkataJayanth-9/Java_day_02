import java.util.Scanner;
//We can create same program without using while loop and by using (n(n+1))2
//Print sum of numbers upto given using while loop.
public class while_loop {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n value = ");
        int num = sc.nextInt();
        int i = 0;
        int sum = 0;
        while (i != num)
        {
            sum = sum + i;
            i++;
        }
        System.out.println("Sum = " + sum);
    }

}
