import java.util.Scanner;

public class Ex2609 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int b = s.nextInt();

		System.out.println(gcd(a, b));
		System.out.println(lcm(a, b));
	}

	public static int gcd(int a, int b) {
		if (b == 0) {
			return a;
		} else {
			return gcd(b, a % b);
		}
	}

	public static int lcm(int a, int b) {
		return a * b / gcd(a, b);
	}
}
