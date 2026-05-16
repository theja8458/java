import java.util.Scanner;
public class ArmstrongNumber 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int num, original, remainder, result = 0, n = 0;
        System.out.print("Enter a number: ");
        num = sc.nextInt();
        original = num;

        while (original != 0) 
        {
            original =original/ 10;
            n++;
        }
        original = num;

        while (original != 0) 
        {
            remainder = original % 10;
            result += Math.pow(remainder, n);
            original /= 10;
        }
        if (result == num) 
        {
            System.out.println("Armstrong number");
        } 
        else 
        {
            System.out.println("Not an Armstrong number");
        }
    }
}
