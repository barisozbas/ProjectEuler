import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        System.out.println(p12());
    }
	
	public static int p12(){
        int start=0 ,total=0;

        while(true){
            start++;
            total +=start;
            if(500<divisors(total)){
                return total;
            }

        }

    }

    public static int divisors(int x){
        int count=0;
        for(int i=1; i<= Math.sqrt(x) ;i++){
            if(x%i==0) {
                if(x/i==i)
                    count++;
                else
                    count+=2;
            }
        }
        return count;
    }
    
}