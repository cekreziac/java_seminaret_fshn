public class Ushtrimi02
{
	public static void main(String[] args)
	{
		double	viti1;
		double	viti2;
		double	viti3;

		viti1 = 1000 + (1000 * 0.05);
		viti2 = viti1 + (viti1 * 0.05);
		viti3 = viti2 + (viti2 * 0.05);
		System.out.printf("Viti i pare: %.2f.%n", viti1);
		System.out.printf("Viti i dyte: %.2f.%n", viti2);
		System.out.printf("Viti i trete: %.2f.%n", viti3);
	}
}
