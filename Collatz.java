// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {
		int First = Integer.parseInt(args[0]);
		int count = 1;
		String vorc = args[1];
		if (vorc.equals("v")) {
			for (int i = 0; i < First; i++) {
				int y = i + 1;
				System.out.print(y);
				count = 1;
				do {

					if (y % 2 == 0) {
						y = y / 2;
						System.out.print(" " + y);
					} else {
						y = (y * 3) + 1;
						System.out.print(" " + y);
					}
					count++;

				} while (y != 1);
				System.out.print(" (" + count + ") ");

				System.out.println(" ");

			}
			System.out.println("Every one of the first " + First + " hailstone sequneces reached 1");
		} else {
			System.out.println("Every one of the first " + First + " hailstone sequneces reached 1");
		}
	}
}
