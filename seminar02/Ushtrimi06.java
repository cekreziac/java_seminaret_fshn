import java.text.NumberFormat.Style;
import java.util.Scanner;

public class Ushtrimi06 
{
    public static void main(String[] args)
    {
        int nr1;
        int nr2;

        try(Scanner sc = new Scanner (System.in))
        {
            System.out.print("Jep numrin e pare: ");
            nr1 = sc.nextInt();
            System.out.print("Jeo numrin e dyte: ");
            nr2 = sc.nextInt();

            System.out.printf("Sum: %14d%n", nr1 + nr2);
            System.out.printf("Difference: %7d%n", nr1 - nr2);
            System.out.printf("Product: %10d%n", nr1 * nr2);
            System.out.printf("Average: %13.2f%n", (double)(nr1 + nr2) / 2);
            System.out.printf("Distance: %9d%n", Math.abs(nr1 - nr2));
            System.out.printf("Maximum: %10d%n", Math.max(nr1, nr2));
            System.out.printf("Minimu: %11d%n", Math.min(nr1, nr2));
        }
    }
}
