package Tests;
import Tests.PawnTest;
import Tests.BoardTest;
import Tests.studentinfo.StudentTest;
import Tests.studentinfo.CourseSessionTest;
import junit.framework.TestSuite;
import java.util.ArrayList;

public class AllTests {
    public static TestSuite suite() {
        TestSuite suite = new TestSuite();
        suite.addTestSuite(StudentTest.class);
        suite.addTestSuite(PawnTest.class);
        suite.addTestSuite(CourseSessionTest.class);
        suite.addTestSuite(BoardTest.class);
        return suite;
    }
}
