import java.util.Scanner;
public class fristandlast{
   
    static void findandlast(int num)
    {
        int org = num;
       while(num>10)
       {
         num=num/10;
       }

       org=org%10;
       System.out.println("fristdigit "+ num+ " "+ "Last digit "+org);
    }

    public static void main(String[] args) {
        int num;
        System.out.println("Enter the Number");
        Scanner input = new Scanner(System.in);
        num = input.nextInt();

        findandlast(num);

    }
}