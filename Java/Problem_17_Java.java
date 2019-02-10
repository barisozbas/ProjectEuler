import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        System.out.println(p17());
    }
	
	public static String[] special={
            "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine",
            "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen",
            "eighteen", "nineteen"};
    public static String[] tens={
            "", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};


    public static int p17(){
        int sum= 0;
        for(int i=1; i<=1000;i++){
            sum+= numberToString(i).length();
        }
        return sum;

    }

    public static String numberToString(int a){
        if(0<=a && a<20)
            return special[a];
        if(20<=a && a<100)
            return tens[a/10] + (a%10!=0 ? special[a%10]:"");
        if(100<=a && a<1000)
            return special[a/100] +"hundred"+ (a%100!=0 ? "and" + numberToString(a%100):"");
        if(a==1000)
            return "onethousand";
        return "";
    }
    
}