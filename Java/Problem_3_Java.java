import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        System.out.println(p3());
    }
	
	public static int p3(){
        int a;
        double p = 600851475143L;
        while (true){
            double x= primeFactor(p);
            if(x<p)
                p/=x;
            else {
                a = (int) Math.round(p);
                return a;
            }
        }
    }
	
	public static double primeFactor (double p){
        for(double i=2, max= Math.sqrt(p) ; max>=i ; i++){
            if(p%i == 0){
                return i;
            }
        }
        return p;
    }
	
    
}