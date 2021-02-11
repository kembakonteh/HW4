

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class DepartmentTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class DepartmentTest
{
    /**
     * Default constructor for test class DepartmentTest
     */
    public DepartmentTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }

    @Test
    public void DepartmentTest()
    {
        Department departme1 = new Department();
        Student student1 = new Student("kemba", "kemba", "878686574");
        departme1.addStudent(student1);
    }

    @Test
    public void constructor1()
    {
        Department departme1 = new Department(28, 28, 28, 984553);
        assertEquals(984553.0, departme1.getTotalBalance(), 0.1);
    }

    @Test
    public void constructorAndAccessorTest()
    {
        Department departme2 = new Department(28, 28, 28, 984553);
        assertEquals(1, departme2.getTotalGr110());
        assertEquals(1, departme2.getTotalGr142());
        assertEquals(1, departme2.getTotalGr143());
        assertEquals(28, departme2.getTotalStud110());
        assertEquals(28, departme2.getTotalStud142());
        assertEquals(28, departme2.getTotalStud142());
        assertEquals(28, departme2.getTotalStud143());
        assertEquals(84, departme2.getTotalStudent());
        
    }

    

    @Test
    public void mutatorTest()
    {
    }

    @Test
    public void mutators()
    {
        Department departme1 = new Department();
        Student student1 = new Student("kemba", "kemba", "96866746565365");
        java.lang.String string1 = student1.toString();
        assertEquals(string1, string1);
    }
}







