import java.util.Scanner;
class LockerNo{
	
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Locker number : ");
		int l = sc.nextInt();
		
		if (l%2==0){
			System.out.println("Locker number is even : " + l);
		}
		else{
			System.out.println("Locker number is odd : " + l);
		}
	}
}