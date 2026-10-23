public class Ushtrimi01 
{
    public static void main(String[] args)
    {
        double G, c, alpha;
        int pi, a, b, p, m1, m2;

        pi = 5;
        a = 4;
        b = 3;
        p = 2;
        m1 = 9;
        m2 = 8;
        alpha = 30;

        G = (4 * Math.pow(pi, 2) * Math.pow(a, 3)) / (Math.pow(p, 2) * (m1 + m2));
        c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2) - 2 * a * b * Math.cos(alpha));

        // Jo pjese e ushtrimit.
        System.out.printf("G = %.2f%n", G);
        System.out.printf("c = %.2f%n", c);
    }
}
