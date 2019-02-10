

public class main {
	public static void main(String[] args){
		int count = 0, l = 1, r = 1;
		for(int i = 1; i <= 1001; i++) {
			if(i < 1001) {
				l += 2 * i;
				count += l;
			}
			r += 4 * Math.floor(i / 2);
			count += r;
		}
		System.out.println(count);
	}
}