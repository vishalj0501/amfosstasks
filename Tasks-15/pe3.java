import java.util.Scanner;

public class pe3 {
    public static void main(String[] args) {

        long LargestPrime=2;
        Scanner s = new Scanner(System.in);

            long n = s.nextLong();
            
            for (int j=2; j<= Math.sqrt(n);j++){
                
                while (n%j==0 && n!=j){
                    
                    n=n/j;
                }
                LargestPrime=n;
            }
            System.out.println(LargestPrime);
        }
    }

