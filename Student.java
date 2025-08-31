import java.util.*; 
class Student {

    static int tuitionFee;

    String name;
    String className;

    static {
        tuitionFee = 30000;
        System.out.println("School Tuition Fee Initialized: " + tuitionFee);
    }

    void setName(String name) {
        this.name = name;
    }

    String getName() {
        return name;
    }

    void setClassName(String className) {
        this.className = className;
    }

    String getClassName() {
        return className;
    }

    void printStudentDetails() {
        System.out.println("Name=" + name + ", Class=" + className + ", Tuition Fee=" + tuitionFee);
    }
    public static void main(String[] args) {
      
        Student student1 = new Student();
        student1.setName("Anjali");
        student1.setClassName("10th");

        Student student2 = new Student();
        student2.setName("Vikram");
        student2.setClassName("12th");

        System.out.print("Student1: ");
        student1.printStudentDetails();
        
        System.out.print("Student2: ");
        student2.printStudentDetails();
    }
}
