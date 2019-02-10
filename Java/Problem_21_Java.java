import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        System.out.println(p21());
    }
	
	public static int p21(){
        int sum=0;
        for(int i=1; i<10000;i++){
            if(amicable(i))
                sum+=i;
        }
        return sum;



    }
    public static int divisors2(int x){
        int count=0;
        for(int i=1; i<x ;i++){
            if(x%i==0)
                count+=i;
        }
        return count;
    }

    public static boolean amicable(int n){
        int x= divisors2(n);
        return (divisors2(x)==n && x!=n);
    }
	
    
}