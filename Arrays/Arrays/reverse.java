import java.util.Scanner;
public class reverse {
    
    public static void main(String [] args)
    {
        int num;
        int reverse=0;
        System.out.println("Enter the number");
        Scanner input = new Scanner(System.in);
        num = input.nextInt();

        while(num>0)
        {
            int digit= num%10;
            reverse =reverse*10+digit;
            num=num/10;
        }
        System.out.println(reverse);
    }
}
