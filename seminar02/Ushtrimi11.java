import java.util.Scanner;

public class Ushtrimi11 
{
    public static void main(String[] args)
    {
        String  oraPare;
        String  oraDyte;

        try(Scanner sc = new Scanner(System.in))
        {
            System.out.print("Ju lutem vendosni oren e pare: ");
            oraPare = sc.nextLine();
            System.out.print("Ju lutem vendosni oren e dyte: ");
            oraDyte = sc.nextLine();
            System.out.printf("%d ore %d minuta.%n", 
            Math.abs(Integer.parseInt(oraDyte.substring(0, 2)) - Integer.parseInt(oraPare.substring(0, 2))), 
            Math.abs(Integer.parseInt(oraDyte.substring(2, 4)) - Integer.parseInt(oraPare.substring(2, 4))));
        }
    }    
}
