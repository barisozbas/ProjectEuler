import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

public class main {

    
    public static void main(String[] args) {  
           int result = 0;  
           int longest = 0;  
           for (int i=2; i<LIMIT; i++){  
                int rNum = rNum(i);   
                if (rNum > longest){  
                     longest = rNum;  
                     result = i;  
                }  
           }  
           System.out.println(result);  
      }  
	  
    public static int rNum(int num) {  
           int[] arr = new int[num+1];  
           int index = 1;  
           int m = 1;  
           while(m != 0 && arr[m] == 0){  
                arr[m]=index++;  
                m = m * 10 % num;  
           }  
           if (m == 0){  
                return 0;  
           }  
           return index-arr[m];  
	  }   
	  
    private static final int LIMIT = 1000;  

    
}