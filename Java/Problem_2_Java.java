import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        System.out.println(p2());
    }
	
	public static int p2(){
        int sum = 0;
        int a = 1;
        int b = 2;

        while(a<=4000000){
            if(a%2 == 0)
                sum +=a;
            int c= a+b;
            a=b;
            b=c;
        }

        return sum;
    }
    
}