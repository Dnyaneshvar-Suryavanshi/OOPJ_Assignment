class StudentMarksCheck {
  
    private int rollNo;
    private String name;
    private int marks;

    public StudentMarksCheck(int rollNo, String name, int marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public void printDetails() {
        System.out.println("Roll No=" + rollNo + ", Name=" + name + ", Marks=" + marks);
    }

    public static void main(String[] args) {
        
        StudentMarksCheck student = new StudentMarksCheck(101, "Rohit", 75);

        System.out.println("Initial Details:");
        student.printDetails();

        student.setMarks(90);

        System.out.println("After Updating Marks:");
        student.printDetails();
    }
}
