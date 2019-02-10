import java.math.BigInteger;
import java.lang.Math;
import java.util.*;

public class main {

    public static void main(String[] args) {
        System.out.println(p1());
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
	
	public static void main(String[] args) {

    int limit = 1000;

    int ansA = 0;
    int ansB = 0;
    int max = 0;

    for (int a = 1-limit; a<limit;a++) {
      for (int b = 1-limit; b<limit;b++) {
        int n = 0;
        while (isPrime(Math.abs(n*n + a*n + b))) {
          n++;
        }
        if (n > max) {
          max = n;
          ansA = a;
          ansB = b;
        }
      }
    }

    System.out.println(ansA * ansB);
  }
	

    
	
    
}