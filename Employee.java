import java.util.*;
class Employee {
 
    String name;
    double salary;
    int yearsOfService;

    static int totalEmployees = 0;

    Employee(String name, double salary, int yearsOfService) {
        this.name = name;
        this.salary = salary;
        this.yearsOfService = yearsOfService;
        totalEmployees++; 
    }

    String getName() {
        return name;
    }
    double getSalary() {
        return salary;
    }
    int getYearsOfService() {
        return yearsOfService;
    }
	
	
	void setName(String name) {
        this.name = name;
    }
	void setSalary(double salary) {
        this.salary = salary;
    }
    void setYearsOfService(int yearsOfService) {
        this.yearsOfService = yearsOfService;
    }

    double calculateBonus() {
        if (yearsOfService >= 5) {
            return 0.05 * salary; 
        } else {
            return 0.0;
        }
    }

    static void showTotalEmployees() {
        System.out.println("Total employees: " + totalEmployees);
    }
	
    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);
		System.out.println("Enter Employee1 Information: ");
		System.out.print("name: ");              String s1 = sc.next();
		System.out.print("Salary: ");            int s2 = sc.nextInt();
		System.out.print("yearsOfService: ");    int s3 = sc.nextInt();
		Employee emp1 = new Employee(s1,s2,s3);
		
		System.out.println("Enter Employee2 Information: ");
		System.out.print("name: ");              String a1 = sc.next();
		System.out.print("Salary: ");            int a2 = sc.nextInt();
		System.out.print("yearsOfService: ");    int a3 = sc.nextInt();
        Employee emp2 = new Employee(a1,a2,a3);
		
		System.out.println("Enter Employee3 Information: ");
		System.out.print("name: ");              String b1 = sc.next();
		System.out.print("Salary: ");            int b2 = sc.nextInt();
		System.out.print("yearsOfService: ");    int b3 = sc.nextInt();
        Employee emp3 = new Employee(b1,b2,b3);
		
        System.out.println("Employee " + emp1.getName() + " Bonus: " + emp1.calculateBonus());
        System.out.println("Employee " + emp2.getName() + " Bonus: " + emp2.calculateBonus());
        System.out.println("Employee " + emp3.getName() + " Bonus: " + emp3.calculateBonus());

        Employee.showTotalEmployees();
    }
}
