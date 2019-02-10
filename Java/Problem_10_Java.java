import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        System.out.println(p10());
    }
	
	public static String p10(){
        long sum=0;
        for(int i=2000000 ; i>1 ; i--){
           if(isPrime(i))
               sum+=i;
       }
       return Long.toString(sum);

    }
	
	public static boolean isPrime(long x) {
        if (x ==0 || x ==1)
            return false;
        else if (x == 2)
            return true;
        else{
            if(x % 2 == 0)
                return false;
            for(double i = 3, end = Math.sqrt((double)x); i <= end; i += 2){
                if (x % i == 0)
                    return false;
            }
            return true;
        }
    }
    
}