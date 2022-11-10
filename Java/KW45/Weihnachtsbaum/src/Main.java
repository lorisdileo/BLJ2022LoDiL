import java.util.Scanner;
public class Main {
    public static void main(String []args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the height of tree: ");
        int input = scan.nextInt();

        for(int i = 1; i <= input; i++)
        {
            for(int j = input - i; j > 0; j--)
            {
                System.out.print(" ");
            }
            for(int k = 1;k <= i;k++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }

        for(int i = 1; i <= input - 2; i++)
        {
            System.out.print(" ");
            for(int j = input - 3; j > 0; j--)
            {
                System.out.print(" ");
            }
            for(int k = 2; k > 0; k--)
            {
                System.out.print("| ");
            }
            System.out.println();
        }
    }
}  