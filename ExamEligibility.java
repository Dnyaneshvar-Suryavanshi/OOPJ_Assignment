import java.util.Scanner;

public class ReverseDigit{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ")
        int n = sc.nextInt();

        if (n < 1000 || n > 9999) {
			int rev = 0;
            while (n > 0) {
                rev = rev * 10 + n % 10;
                n /= 10;
				System.out.println("Reversed number: " + rev);
        } else {
				System.out.println("Invalid number.");
            }
        }
    }
}
