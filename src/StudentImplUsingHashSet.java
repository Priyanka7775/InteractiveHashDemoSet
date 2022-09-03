import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class StudentImplUsingHashSet {
    public static void main(String[] args) {
        StudentImplUsingHashSet studentImplUsingHashSet=new StudentImplUsingHashSet();
        Set<Student> students = studentImplUsingHashSet.createSet();
        studentImplUsingHashSet.display(students);
        boolean result= studentImplUsingHashSet.removeByRollNumber(students,12);
        if (result){
            System.out.println("Student Deleted");
        }else {
            System.out.println("Student Not Found");
        }
    }

    public Set<Student> createSet(){
        Set<Student> students=new HashSet<>();
        students.add(new Student(12,"Priyanka",100));
        students.add(new Student(17,"Ramesh",90));
        students.add(new Student(16,"Suresh",80));

        return students;
    }

    public void display(Set<Student> student){
        Iterator<Student> iterator= student.iterator();
        while (iterator.hasNext()){
            System.out.println("iterator.next() = " + iterator.next());

        }
    }

    public boolean removeByRollNumber(Set<Student>students,int rollNo){
        boolean response=false;
        Iterator<Student> iterator= students.iterator();
        while (iterator.hasNext()){
            if(iterator.next().getRollNo()== rollNo){
                iterator.remove();
                response=true;
                break;
            }
        }
        return response;

    }
}
