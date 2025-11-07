
public class Cheers {
        public static void main(String[] args) {
                String R = args[0];
                if (R.length() != 4) {
                        System.out.println("Input must be 4 letters long.");

                }

                else if (R.length() == 4) {
                        for (int i = 0; i < 1; i++) {
                                System.out.println("Give me an R:" + R.charAt(0) + " !");
                                System.out.println("Give me an U:" + R.charAt(1) + " !");
                                System.out.println("Give me an N:" + R.charAt(2) + " !");
                                System.out.println("Give me an I:" + R.charAt(3) + " !");
                                System.out.println("What does that spell?");
                                System.out.println(R + " ! ! !");
                        }
                }

        }
}
