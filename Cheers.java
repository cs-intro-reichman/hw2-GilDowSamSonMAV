
public class Cheers {
        public static void main(String[] args) {
                String R = args[0];
                int f = Integer.parseInt(args[1]);
                int i = 0;
                String s = "AEFHILMNORSX";
                char u = s.charAt(i);

                while (i < R.length()) {

                        if (s.indexOf(u) == -1) {
                                System.out.println("Give me a " + R.charAt(i) + ": " + R.charAt(i) + " !");
                        } else {
                                System.out.println("Give me an " + R.charAt(i) + ": " + R.charAt(i) + " !");
                        }
                        i++;
                        u++;

                }
                System.out.println("What does that spell?");

                int q = 0;

                do {

                        System.out.println(R + " ! ! !");

                        q++;
                } while (q < f);
        }

}
