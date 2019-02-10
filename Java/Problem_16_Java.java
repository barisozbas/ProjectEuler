import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        System.out.println(p16());
    }
	
	 public static int p16(){
        BigInteger big= BigInteger.valueOf(2).pow(1000);
        String count= big.toString();
        int sum=0;

        for(int i=0;i<count.length();i++){
            int digit = (int) (count.charAt(i)-'0');
            sum+=digit;
        }
        return sum;
    }
    
}