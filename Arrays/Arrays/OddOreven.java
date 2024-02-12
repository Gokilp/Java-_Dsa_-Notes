import java.util.Scanner;
public class OddOreven {

    static void findOddOrEven(int num)
    {
       if(num%2==0)
        System.out.println("Even");
       
       else
       System.out.println("odd");

    }
    public static void main(String [] args)
    {
        System.out.println("Enter the Number");
        int num;
       Scanner input = new Scanner(System.in);
       num = input.nextInt();
       findOddOrEven(num);
    }
}