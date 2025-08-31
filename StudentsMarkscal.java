import java.util.*; 
class StudentsMarkscal{
	String name;
	int marks;
	
	static int totalStudents = 0;
	
	StudentsMarkscal(String name, int marks){
		this.name = name;
		this.marks = marks;
		totalStudents++;
	}
	
	String getName(){
		return name;
	}
	int getMarks(){
		return marks;
	}
	
	void setName(String name){
		this.name = name;
	}
	void setMarks(int marks){
		this.marks = marks;
	}
	
	boolean Passed(){
		if(marks >= 35){
			return true;
		}
		else{
			return false;
		}
	}
	
	static void TotalStudents(){
		System.out.print("Total students : "+totalStudents);
	}
	
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Student1 Name: "); String s1 = sc.next();
		System.out.print("Marks: "); int s2 = sc.nextInt();
		StudentsMarkscal std1 = new StudentsMarkscal(s1,s2);
		
		System.out.print("Student2 Name: "); String s3 = sc.next();
		System.out.print("Marks: "); int s4 = sc.nextInt();
		StudentsMarkscal std2 = new StudentsMarkscal(s3,s4);
		
		System.out.print("Student3 Name: "); String s5 = sc.next();
		System.out.print("Marks: "); int s6 = sc.nextInt();
		StudentsMarkscal std3 = new StudentsMarkscal(s5,s6);
		
		System.out.println("Student "+std1.getName()+" passed? "+std1.Passed());
		System.out.println("Student "+std2.getName()+" passed? "+std2.Passed());
		System.out.println("Student "+std3.getName()+" passed? "+std3.Passed());
		
		TotalStudents();
		
	}
}