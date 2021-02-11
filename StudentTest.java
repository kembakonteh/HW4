

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class StudentTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class StudentTest
{
    /**
     * Default constructor for test class StudentTest
     */
    public StudentTest()
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
    public void StudentTest1()
    {
        Student student1 = new Student("Kemba", "Konteh", "955311043", false, true, false);
        
    }

    @Test
    public void constr1Test()
    {
        Student student1 = new Student("kemba", "konteh", "955311043", false, true, false);
        assertEquals("kemba", student1.getFirstName());
        assertEquals("955311043", student1.getID());
        assertEquals("konteh", student1.getLastName());
        assertEquals(true, student1.isCsc142());
    }

    @Test
    public void constr2Test()
    {
        Student student1 = new Student("Kemba", "Konteh", "955311043");
        assertEquals("Kemba", student1.getFirstName());
        assertEquals("955311043", student1.getID());
        assertEquals("Konteh", student1.getLastName());
    }



    @Test
    public void accessorsTest()
    {
        Student student1 = new Student("kemba", "kemba", "96866746565365");
        assertEquals("kemba", student1.getFirstName());
        assertEquals(false, student1.isCsc110());
        assertEquals(false, student1.isCsc142());
    }

    @Test
    public void mutatorsTest()
    {
        Student student1 = new Student("kemba", "kemba", "981927182");
        student1.setCsc110(true);
        assertEquals(true, student1.isCsc110());
        student1.setCsc142(true);
        assertEquals(true, student1.isCsc142());
        student1.setCsc143(true);
        assertEquals(true, student1.isCsc143());
    }
}







