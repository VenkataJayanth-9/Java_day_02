import java.util.Scanner;

public class do_while_loop {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number = ");
        int a = sc.nextInt();
        int i = 0;
        do {
            System.out.println(i);
            i++;
        }while (i <= a);
    }
}
