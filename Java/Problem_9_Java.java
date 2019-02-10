import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        System.out.println(p9());
    }
	
	public static int p9() {
        for (int a = 1; a < 1000; a++) {
            for (int b = a + 1; b < 1000; b++) {
                int c = 1000 - a - b;
                if (a*a + b*b == c*c)
                    return a*b*c;
            }

        }
        return -1;
    }
    
}