import java.util.Scanner;
class ExamGrade{
	
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter age of friend 1 : ");
		int friend1 = sc.nextInt();
		System.out.print("Enter age of friend 2 : ");
		int friend2 = sc.nextInt();
		System.out.print("Enter age of friend 3 : ");
		int friend3 = sc.nextInt();
		
		if (friend1 = 22 || friend2 = 22 || friend3 = 22){
			System.out.print();
		}
		else if (friend1 < 22 || friend2 < 22 || friend3 < 22){
			System.out.println("Youngest: Friend 2");
		}
        else{
            System.out.println("Oldest: Friend 3");
        }
	}
}
