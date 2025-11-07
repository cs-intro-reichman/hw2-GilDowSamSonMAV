// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 
	    double denominator = 1.0;
		double piApproximation = 0.0;
		 int N = Integer.parseInt(args[0]);
		 // N is the number of terms to use in the approximation
		for (int i = 0; i < N ; i ++ ) {
			if ( i % 2 == 0) {
				piApproximation += 1.0 / denominator ; // adds to approximation (even i)
			} else { 
				piApproximation -= 1.0 / denominator; // subtracts from approximation (odd i)
			} 
			denominator += 2.0; // adds 2 to denominator each time
			

			
          
		} 
        
		
		System.out.println("pi according to Java: " + Math.PI);
       
	    System.out.println("pi, approximated:     " + (piApproximation * 4) );
	
	
	} 
  
}
