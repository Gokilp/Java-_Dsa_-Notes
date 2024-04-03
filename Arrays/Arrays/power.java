import java.util.Scanner;

public class power {

    public static void main(String[] args) {
      double power, number;
        System.out.println("Enter the Number");
        Scanner input = new Scanner(System.in);
        number = input.nextInt();
        System.out.println("Enter the power value");
        power = input.nextInt();
        System.out.println(Math.pow(number, power));
    }
}
