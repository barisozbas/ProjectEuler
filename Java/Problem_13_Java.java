import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        System.out.println(p13());
    }
	
	public static String p13(){
        BigInteger sum =new BigInteger("0");

        for(int i=high.length-1; i>=0; i--){
            sum = sum.add(new BigInteger(high[i]));
        }
        return sum.toString().substring(0,10);

    }
    
}