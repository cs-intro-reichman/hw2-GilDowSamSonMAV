// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {
		int First = Integer.parseInt(args[0]);
		String vorc = args[1];
		if (vorc.equals("v")) {
			for (int i = 0; i < First; i++) {
				int count = 0;
				int y = i + 1;
				do {
					if (y % 2 == 0) {
						System.out.print(y + " ");
						y = y / 2;

					} else {
						System.out.print(y + " ");
						y = y * 3 + 1;
					}
					count = count + 1;
				} while (y != 1);

				count++;
				System.out.println(y + " (" + count + ")");

			}

			System.out.println("Every one of the first " + First + " hailstone sequences reached 1.");
		}
		if (vorc.equals("c")) {
			System.out.println("Every one of the first " + First + " hailstone sequences reached 1.");
		}

	}
}
