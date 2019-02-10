import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        System.out.println(p7());
    }
	
	public static String p7(){
        for(int number=2, count=0; ; number++){
            if(isPrime(number)) {
                count++;
                if (count == 10001)
                    return Long.toString(number);
            }
        }
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