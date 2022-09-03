public class Student {
    private int rollNo;
    private String name;
    private double totalMarks;

    public Student(int rollNo, String name, double totalMarks) {
        this.rollNo = rollNo;
        this.name = name;
        this.totalMarks = totalMarks;
    }
    public Student(){

    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getTotalMarks() {
        return totalMarks;
    }

    public void setTotalMarks(double totalMarks) {
        this.totalMarks = totalMarks;
    }

    @Override
    public String toString() {
        return "Student{" +
                ", name='" + name + '\'' +
                ", totalMarks=" + totalMarks +
                '}';
    }
}
