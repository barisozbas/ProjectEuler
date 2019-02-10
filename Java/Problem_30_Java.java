public class main {
	public static void main(String[] args){
		int ans = 0;
		for(int i = 2; i < 1000000; i++) {
			int sum = 0, num = i;
			while (num > 0) {
				int dig = num % 10;
				sum += Math.pow(dig, 5);
				num /= 10;
			}
			if(i == sum) {
				ans += i;
			}
		}
		System.out.println(ans);
	}
}
