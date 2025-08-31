import java.util.Scanner;

public class BasicCalulator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		System.out.print("Enter number 1 : ");
        double a = sc.nextDouble();
		System.out.print("Enter number 2 : ");
		double b = sc.nextDouble();
        char op = sc.next().charAt(0);

        if (op == '+'){
			System.out.println("Result: " + (a + b));
		}
        else if (op == '-'){
		    System.out.println("Result: " + (a - b));
		}
        else if (op == '*'){
			System.out.println("Result: " + (a * b));
		}
        else if (op == '/') {
            if (b == 0){
			 System.out.println("Invalid");
			}
            else {
				System.out.println("Result: " + (a / b));
			}
        }
		else System.out.println("Invalid operator");
    }
}




