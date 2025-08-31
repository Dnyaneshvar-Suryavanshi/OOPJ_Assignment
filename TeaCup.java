import java.util.Scanner;
class TeaCup{
	
	String teaType;
	
	static int totalCups = 0;
	
	TeaCup(String teaType){
		this.teaType = teaType;
		totalCups++;
	}
	
	String getTeaType(){
		return teaType;
	}
	
	static void show(){
		System.out.println("Total tea cups count : " + totalCups);
	}
	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter cup type name or 'exit' to  to finish");
		String input;
		
		
		while(true){
			input = sc.nextLine();
			
			if(input.equals("exit")){
			break;
		    }
			TeaCup cup = new TeaCup(input);
			
			//System.out.println(cup.getTeaType());
		}
		
		show();
	}
}