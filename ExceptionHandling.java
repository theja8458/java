public class ExceptionHandling 
{
    public static void main(String[] args) 
    {
        try //we are trying risky code in this block
        {
            int a = 10;
            int b = 0;
            int result = a / b;  // error
            System.out.println(result);
        } 
        catch (ArithmeticException e) //Handling error
        {
            System.out.println("Cannot divide by zero");
        }

        System.out.println("Program continues...");
    }
}
