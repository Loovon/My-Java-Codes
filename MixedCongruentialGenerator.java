import java.io.*;
public class MixedCongruentialGenerator {
    
    public  double mixedCongruentialGenerator(double a, double C, double m, double seed) {
        double X = seed;
        double period = 0;
        
        // Iterate until we encounter the seed value again
        while (true) {
            // Calculate next value in the sequence
            X = (a * X + C) % m;
            period++;
            
            // Check if we've reached the seed value again
            if (X == seed) {
                break;
            }
        }
        
        return period;
    }
    
    public static void main(String[] args) {
        // Parameters
        double a = 2814749767109;
        double C = 59482661568307;
        double m = (double) Math.pow(2, 48);
        double seed = 509;

        // Calculate period
        double period = mixedCongruentialGenerator(a, C, m, seed);
        
        // Print debug statements
        System.out.println("a: " + a);
        System.out.println("C: " + C);
        System.out.println("m: " + m);
        System.out.println("seed: " + seed);
        System.out.println("The maximum period of the mixed congruential generator is: " + period);
    }
}
