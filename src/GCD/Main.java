package GCD;

public class Main {
	public static void main(String[] args) {

		int a = 18;

		int b = 10;

		if (b > a) {

			int temp = a;

			a = b;

			b = temp;
		}

		while (b != 0) {

			int temp = b;

			b = b % a;

			a = temp;
		}

		System.out.println(a);
	}
}
