package midPractise;
import java.util.Scanner;

public class foLoop {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int x = scanner.nextInt();
		
		int sum = 0;
		
		for (int i = 1; i <= x; i++) {
			sum += i;
		}
		System.out.println("The sum of n numbers is" + sum);
		public String toString()
	}
}
