
public class Cheers {
        public static void main(String[] args) {
                String R = args[0];
                int f = Integer.parseInt(args[1]);
                int i = 0;
                String s = "AEFHILMNORSX";

                while (i < R.length()) {
                                char x = R.charAt(i);
                                char upper = Character.toUpperCase(x);  
                                if (s.indexOf(upper) == -1) {

                                        System.out.println("Give me a  " + upper + ": " + upper + "!");
                                } else {

                                        System.out.println("Give me an " + upper + ": " + upper + "!");
                                }
                                i++;

                }
                System.out.println("What does that spell?");

                int q = 0;

                do {

                        System.out.println(R.toUpperCase() + "!!!");

                        q++;
                } while (q < f);
        }

}
