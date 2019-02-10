import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        System.out.println(p5());
    }
	
	public static String p5(){
        long max=1;
        for(int i=1;i<=20;i++){
            max*=i;
        }

        for(long i=20; i<max; i++){
            for(int x=1; x<=20;x++){
                if(i%x!=0)
                    break;
                if(x==20)
                    return Long.toString(i);
            }
        }
        return Long.toString(max);
    }
    
}