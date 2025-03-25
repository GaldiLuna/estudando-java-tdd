package Tests.studentinfo;
import junit.framework.TestCase;
import java.util.*;

/**
 * Representa uma sessão semestral de um curso universitário específico.
 * @author GaldiLuna
 */
public class CourseSession {
    private String department;
    private String number;
    //private int numberOfStudents = 0;
    private ArrayList<Student> students = new ArrayList<Student>();
    private Date startDate;

    CourseSession(String department, String number) {
        this.department = department;
        this.number = number;
    }

    /**
     * Constrói uma CourseSession que começa em uma data específica.
     *
     * @param startDate a data em que a sessão do curso se inicia.
     */
    public CourseSession(String department, String number, Date startDate) {
        this.department = department;
        this.number = number;
        this.startDate = startDate;
    }

    String getDepartment() {
        return department;
    }

    String getNumber() {
        return number;
    }

    int getNumberOfStudents() {
        //return numberOfStudents;
        return students.size();
    }

    void enroll(Student student) {
        //numberOfStudents = numberOfStudents +1;
        students.add(student);
    }

    Student get(int index) {
        return students.get(index);
    }

    Date getStartDate(){
        return startDate;
    }

    /**
     * @return Date a última data da sessão do curso.
     */
    public Date getEndDate() {
        GregorianCalendar calendar = new GregorianCalendar();
        calendar.setTime(startDate);
        //int numberOfDays = 16 * 7 - 3; DEIXANDO ESSA LINHA MAIS CLARA NAS 4 LINHAS LOGO ABAIXO
        final int sessionLength = 16;
        final int daysInWeek = 7;
        final int daysFromFridayToMonday = 3;
        int numberOfDays = sessionLength * daysInWeek - daysFromFridayToMonday;
        calendar.add(Calendar.DAY_OF_YEAR, numberOfDays);
        return calendar.getTime();
    }

    Date createDate(int year, int month, int date) {
        GregorianCalendar calendar = new GregorianCalendar();
        calendar.clear();
        calendar.set(Calendar.YEAR, year);
        calendar.set(Calendar.MONTH, month - 1);
        calendar.set(Calendar.DAY_OF_MONTH, date);
        return calendar.getTime();
    }

    ArrayList<Student> getAllStudents() {
        return students;
    }

}


