import java.util.Scanner;

public class Ushtrimi07 
{
    public static void main(String[] args)
    {
        double  rreze;

        try(Scanner sc = new Scanner(System.in))
        {
            System.out.print("Jepni rrezen: ");
            rreze = sc.nextDouble();
            System.out.printf("Siperfaqja e rrethit: %.2f%n", Math.PI * Math.pow(rreze, 2));
            System.out.printf("Siperfaqja e sferes: %.2f%n", 4 * Math.PI * Math.pow(rreze, 2));
        }
    }    
}
