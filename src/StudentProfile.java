import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class StudentProfile {
    @Autowired
    @Qualifier("student1")
    private Student student;
    public StudentProfile(){
        System.out.println("Inside Profile constructor");
    }
    public void printAge() {
        System.out.println("Age: "+student.getAge());
    }

    public void printName() {
        System.out.println("Name: "+student.getName());
    }
}
