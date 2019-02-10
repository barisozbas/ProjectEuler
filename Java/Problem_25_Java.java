import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        System.out.println(p25());
    }
	
    public static int p25(){
        BigInteger lowerCap= BigInteger.TEN.pow(1000-1);
        BigInteger upperCap= BigInteger.TEN.pow(1000);
        BigInteger current= BigInteger.ZERO;
        BigInteger prev=BigInteger.ONE;
        int counter=0;

        while(true){
            if(current.compareTo(lowerCap)>=0)
                return counter;
            BigInteger tempo = current.add(prev);
            prev= current;
            current= tempo;
            counter++;
        }
    }
}