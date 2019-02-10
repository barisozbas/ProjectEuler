import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        System.out.println(p6());
    }
	
	public static String p6(){
        long first=0, second=0, result;

        for (int i=100;i>0;i--){
            second+=i;
            first+=i*i;
        }

        result= second*second - first;
        return Long.toString(result);
    }
    
}