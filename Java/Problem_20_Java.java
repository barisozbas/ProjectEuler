import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        System.out.println(p20());
    }
	
	    public static int p20(){
        String fact= factorial(100);
        int sum=0;
        for(int i=0; i<fact.length();i++){
            sum+=fact.charAt(i) - '0';
        }
        return sum;

    }

    public static String factorial(int x){
        BigInteger fin = BigInteger.ONE;
        for(int i=1; i<=x; i++){
            fin= fin.multiply(new BigInteger (i+""));
        }
        return fin.toString();

    }
    
}