import java.util.Scanner;
class ExamPassFail{
	
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter total purchase amount : ");
		int a = sc.nextInt();
		
		if (a >= 1000){
			int b = (a*0.10);
			System.out.println("Final cost after discount : " +(a-b));
		}
		else{
			System.out.println("Final cost" + );
		}
	}
}