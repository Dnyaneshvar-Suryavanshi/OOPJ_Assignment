class Employee1{
    int id;
    String name;
    double basicSalary;
    static int counter = 1001;

    Employee1() {
        this.id = counter++;
        this.name = "Unknown";
        this.basicSalary = 20000;
    }

    Employee1(String name, double basicSalary) {
        this.id = counter++;
        this.name = name;
        this.basicSalary = basicSalary;
    }

    int getId() {
        return id;
    }

    String getName() {
        return name;
    }

    double getBasicSalary() {
        return basicSalary;
    }

    double calculateNetSalary() {
        double hra = 0.10 * basicSalary;
        double da = 0.05 * basicSalary;
        double pf = 0.02 * basicSalary;
        return basicSalary + hra + da - pf;
    }

    void displayEmployeeDetails() {
        System.out.println("Employee ID=" + id + ", Name=" + name + 
                           ", Basic Salary=" + basicSalary + 
                           ", Net Salary=" + calculateNetSalary());
    }

    public static void main(String[] args) {
        Employee1 emp1 = new Employee1();
        Employee1 emp2 = new Employee1("Anjali", 35000);

        emp1.displayEmployeeDetails();
        emp2.displayEmployeeDetails();
    }
}
