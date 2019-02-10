import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        System.out.println(p24());
    }
	
	public static boolean nextPermutation(int[] array) {
        int i = array.length - 1;
        while (i > 0 && array[i - 1] >= array[i])
            i--;
        if (i <= 0)
            return false;
        int j = array.length - 1;
        while (array[j] <= array[i - 1])
            j--;
        int temp = array[i - 1];
        array[i - 1] = array[j];
        array[j] = temp;
        j = array.length - 1;
        while (i < j) {
            temp = array[i];
            array[i] = array[j];
            array[j] = temp;
            i++;
            j--;
        }
        return true;
    }
	
	public static String p24(){
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++)
            array[i] = i;

        for(int i=0; i<999999; i++){
            if(nextPermutation(array))
                ;
        }
        String result= "";

        for(int i=0; i<array.length;i++){
            result+=array[i];
        }
        return result;
    }

    
}