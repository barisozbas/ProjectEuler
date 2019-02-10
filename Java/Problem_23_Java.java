import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        System.out.println(p23());
    }
	
	public static boolean abundant[] = new boolean[28124];

    public static String p23(){

        int sum=0;
        for(int i=1; i<abundant.length;i++){
            abundant[i] = isAbundant(i);
        }

        for(int i=1; i<= 28123; i++){
            if(!sumOfAbundants(i))
                sum+=i;
        }
        return Integer.toString(sum);

    }

    public static boolean sumOfAbundants(int n){
        for(int i=0; i<=n; i++){
            if(abundant[i] && abundant[n-i] )
                return true;
        }
        return false;
    }

    public static boolean isAbundant(int n){
        int sum=1;

        for(int i=2; i<= Math.round(Math.sqrt(n)); i++){
            if(n%i==0)
                sum+= i+n/i;
        }
        if( Math.round(Math.sqrt(n))* Math.round(Math.sqrt(n))==n)
            sum-= Math.round(Math.sqrt(n));

        return sum>n;
    }
    
}