import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        System.out.println(p4());
    }
	
	public static double primeFactor (double p){
        for(double i=2, max= Math.sqrt(p) ; max>=i ; i++){
            if(p%i == 0){
                return i;
            }
        }
        return p;
    }
    
	public static int p4(){
        int result=0;
        for(int i=999;i>=100;i--){
            for(int x=999;x>=100;x--){
                if(isPalindrome(x*i))
                    if(x*i>result)
                        result=x*i;
            }
        }
        return result;
    }
	
	public static boolean isPalindrome(int num) {

        int reversedInteger = 0, remainder, originalInteger;

        originalInteger = num;

        while( num != 0 )
        {
            remainder = num % 10;
            reversedInteger = reversedInteger * 10 + remainder;
            num  /= 10;
        }

        if (originalInteger == reversedInteger)
            return true;
        else
            return false;
    }
}