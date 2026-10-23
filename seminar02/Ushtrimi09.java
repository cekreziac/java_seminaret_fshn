import java.util.Scanner;

public class Ushtrimi09 
{
    public static void main(String[] args)
    {
        String  numer;
        int vendiPresjes;
        int gjatesiaNumrit;

        try(Scanner sc = new Scanner(System.in))
        {
            System.out.print("Ju lutem vendosni nje numer midis 1,000 dhe 999,999: ");
            numer = sc.nextLine();
            gjatesiaNumrit = numer.length();
            vendiPresjes = numer.indexOf(",");
            System.out.printf("%s%n", numer.substring(0, vendiPresjes) + numer.substring(vendiPresjes + 1, gjatesiaNumrit));
        }
    }    
}
