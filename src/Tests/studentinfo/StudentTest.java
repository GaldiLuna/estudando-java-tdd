package Tests.studentinfo;
import Tests.studentinfo.Student;
import junit.framework.TestCase;
import java.util.ArrayList;

public class StudentTest extends TestCase {
    public void testCreate() {
        final String firstStudentName = "Jane Doe";
        Student firstStudent = new Student(firstStudentName);
        //firstStudent.name = "June Crow";
        assertEquals(firstStudentName, firstStudent.getName());

        final String secondStudentName = "Joe Blow";
        Student secondStudent = new Student(secondStudentName);
        assertEquals(secondStudentName, secondStudent.getName());

        //assertEquals(firstStudentName, firstStudent.name);
    }
}