class StudentGrade{

    int rollNo;
    String name;
    int marks;

    StudentGrade(int rollNo, String name, int marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }

    int getMarks() {
        return marks;
    }

    void setMarks(int marks) {
        this.marks = marks;
    }

    String calculateGrade() {
        if (marks >= 80) {
            return "A";
        } else if (marks >= 60) {
            return "B";
        } else if (marks >= 40) {
            return "C";
        } else {
            return "Fail";
        }
    }

    void printDetails() {
        System.out.println("Roll No=" + rollNo + ", Name=" + name +
                ", Marks=" + marks + ", Grade=" + calculateGrade());
    }

    public static void main(String[] args) {
        
        StudentGrade student1 = new StudentGrade(101, "Rohit", 75);
        StudentGrade student2 = new StudentGrade(102, "Vikram", 55);

        System.out.println("Student Details:");
        student1.printDetails();
        student2.printDetails();
    }
}
