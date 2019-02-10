import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        System.out.println(p1());
    }
	
    public static int p1(){
        int sum=0;

        for(int i=999; i>2; i--){
            if(i%3==0 | i%5==0){
                sum+=i;
            }
        }
        return sum;

    }
}
