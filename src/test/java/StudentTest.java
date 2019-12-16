
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class StudentTest {


    @Before
    public void setup(){
        Student.name = "joshua";
    }

    @Test
    public void testIfNameWorks(){
        assertEquals("joshua", Student.name);
        assertNotEquals("", Student.name);
        assertNotNull(Student.name);
    }
    @Test
    public void testStudentFields(){
        Student joshua = new Student(1L, "joshua");
        assertSame(1L, joshua.getId());
        assertSame("joshua", joshua.getName());
        assertSame(0, joshua.getGrades().size());
    }


    @Test
    public void testAddGrade(){
        Student fer = new Student(1L, "fer");
        fer.addGrade(100);
        assertSame(100, fer.getGrades().get(0));
        fer.addGrade(80);
        assertSame(80, fer.getGrades().get(1));
    }

    @Test
    public void testAverageGrade(){
        Student fer = new Student(1L, "fer");
        fer.addGrade(100);
        fer.addGrade(80);
        assertEquals(90, fer.getGradeAverage(), 0);
    }

}
