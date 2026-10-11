import java.util.Scanner;

public class HelloScanner 
{
    public static void main(String[] args)
    {
        String emri;
        int mosha;
        double  gjatesia;

        try(Scanner sc = new Scanner(System.in))
        {
            System.out.print("Shkruaj emrin tend: ");
            emri = sc.nextLine();
            System.out.print("Shkruaj moshen tende: ");
            mosha = sc.nextInt();
            System.out.print("Shkruaj gjatesine tende (p.sh. 1.70): ");
            gjatesia = sc.nextDouble();
            System.out.printf("Pershendetje, %s! je %d vjec dhe je %.2f m i/e gjate.%n",
                emri, mosha, gjatesia);
        }
    }
}
