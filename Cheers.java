
public class Cheers {
        public static void main(String[] args) {
                String R = args[0];
                                
                        for (int i = 0; i < R.length() - 1 ;) {
                                System.out.println("Give me an " + R.charAt(0) + ": " + R.charAt(0) + " !");
                                System.out.println("Give me an " + R.charAt(1) + ": " + R.charAt(1) + " !");
                                System.out.println("Give me an " + R.charAt(2) + ": " + R.charAt(2) + " !");
                                System.out.println("Give me an " + R.charAt(3) + ": " + R.charAt(3) + " !");
                                System.out.println("What does that spell?");
                                System.out.println(R + " ! ! !");
                                break;
                        }
                }

        }

