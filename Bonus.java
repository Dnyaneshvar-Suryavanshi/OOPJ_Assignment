import java.util.Scanner;
class AttendanceElig{
	
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter total classes held : ");
		int h = sc.nextInt();
		System.out.print("Enter classes attended : ");
		int a = sc.nextInt();
		int b = (int)(h*0.75);
		
		if (a <= h && a >= b){
			System.out.println("Student is allowed to sit in exam.");
		}
		else{
			System.out.println("Student is not allowed to sit in exam.");
		}
	}
}