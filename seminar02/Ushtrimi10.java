import java.util.Scanner;

import javax.swing.text.StyledEditorKit;

public class Ushtrimi10 
{
    public static void main(String[] args)
    {
        String numerString;
        // String rezultati;
        int gjatesiaNumer;
        int i;

        try(Scanner sc = new Scanner(System.in))
        {
            System.out.print("Shkruani numrin: ");
            numerString = sc.nextLine();
            
            // Metoda 1;
            gjatesiaNumer = numerString.length();
            for(i = 0; i < gjatesiaNumer; i++)
            {
                System.out.printf("%c ", numerString.charAt(i));
            }
            System.out.printf("%n");

            /**
             * Metoda 2
             * rezultati = String.join(" ", numerString.split(""));
             * System.out.println(rezultati);
             */
        }
    }    
}
