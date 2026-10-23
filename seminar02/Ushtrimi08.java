import java.util.Scanner;

import javax.swing.text.StyledEditorKit;

public class Ushtrimi08 
{
    public static void main(String[] args)
    {
        String  emriPath;
        String  emriSkedarit;
        String  tipiSkedarit;
        String  emriPlote;

        try(Scanner sc = new Scanner(System.in))
        {
            System.out.print("Jepni emrin e path: ");
            emriPath = sc.nextLine();
            System.out.print("Jepni emrin e skedarit: ");
            emriSkedarit = sc.nextLine();
            System.out.print("Jepni tipin e skedarit: ");
            tipiSkedarit = sc.nextLine();
            emriPlote = emriPath + "\\" + emriSkedarit + "." + tipiSkedarit;
            System.out.printf("%s%n", emriPlote);
        }
    }    
}
