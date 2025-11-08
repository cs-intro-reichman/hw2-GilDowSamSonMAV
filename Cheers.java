
public class Cheers {
        public static void main(String[] args) {
                String R = args[0];
                int f = Integer.parseInt(args[1]);
                int i = 0;
                String s = "AEFHILMNORSX";
                

                while (i < R.length()) {
                        
                        if (s.indexOf(R.charAt(i)) == -1) {
                                char x = R.charAt(i);
                                char upper = Character.toUpperCase(x);
                                System.out.println("Give me a " + upper + ": " + upper + "!");
                        } else {
                                  char x = R.charAt(i);
                                char upper = Character.toUpperCase(x);
                                System.out.println("Give me an " + upper + ": " + upper + "!");
                        }
                        i++;
                        

                }
                System.out.println("What does that spell?");

                int q = 0;

                do {

                        System.out.println(R.toUpperCase() + " ! ! !");

                        q++;
                } while (q < f);
        }

}
