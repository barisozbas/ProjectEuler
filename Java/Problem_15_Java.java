import java.math.BigInteger;

public class main {
	public static void main(String[] args){
		int move = 40;
		int r = 20;
		
		
		System.out.println(factorial(move).divide(factorial(r).multiply(factorial(move-r))));
	}
	public static BigInteger factorial(int n) {
		BigInteger big = BigInteger.ONE;
		for(int i = 1; i <= n; i++) {
			big = big.multiply(BigInteger.valueOf(i));
		}
		return big;
	}
}