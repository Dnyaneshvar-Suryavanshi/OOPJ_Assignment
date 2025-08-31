import java.util.Scanner;
class Bonus{
	
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Salary : ");
		int s = sc.nextInt();
		System.out.print("Enter year : ");
		int a = sc.nextInt();
		
		if (a >= 5){
			int b = (int)(a*0.05);
			System.out.println("Bonus amount : " + b);
		}
		else{
			System.out.println("No bonus.");
		}
	}
}