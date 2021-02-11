
/**
 * The purpose of this assignment is to introduce us to creating our own objects,
 * along with private data, constructors, and also methods such as toString 
 * method. In this project, i created two supplier classes that interact with
 * each other (through a “has a” relationship). A student and a department 
 * class
 * 
 * This is the student class. In this class, there are two constructors,one 
 * with three parameters and the other overloaded with six parameters. In 
 * this class, we calculate the number of credit hours a student can take,
 * given one credit class costs $110, and one class equals 5 credit hours.
 * A student can only be in one class at a time, either CSC 110, CSC142 or
 * CSC 143. 
 * 
 * Mutators and Accessors are created that asign values and retrieve and 
 * return information to the calling program respectively.
 * 
 *  @author (Kemba Konteh)
 * @version (Homework #4 02/08/2018)
 */
public class Student
{
    public final int ONE_CLASS = 5;
    public final int ONE_CREDIT_COST = 110;

    private String firstName;
    private String lastName;
    private String ID;
    private boolean csc110;
    private boolean csc142;
    private boolean csc143;

    /**
     * Constructor with three parameters. Assigns values to private fields.
     *
     * @param  firstName: gets user first name
     * @param  lastName: gets user last name
     * @param  ID: gets user ID
     * @return    Nothing
     */
    public Student(String firstName, String lastName, String ID) {
        if(checkIfEmpty(firstName, lastName, ID))
            throw new IllegalArgumentException("You must type in your full\n"+
                "name and ID");
        this.firstName = firstName;
        this.lastName = lastName;
        this.ID = ID;
    }
    
    /**
     * Overloaded constructor with six parameters also referencing private fields.
     *
     * @param  firstName: gets user first name.
     * @param  lastName: gets user last name.
     * @param  ID: gets user ID.
     * @param  csc110: gets student class named csc110.
     * @param  csc142: gets student class named csc142.
     * @param  csc143: gets student class named csc143
     * @return    Nothing
     */


    public Student(String firstName, String lastName, String ID, boolean csc110, boolean csc142, boolean csc143) {
        this(firstName, lastName, ID); // I call this here to avoid redundancy.
        this.csc110 = csc110;
        this.csc142 = csc142;
        this.csc143 =  csc143;
    }
    
    /**
     * This checkIfEmpty method just checks to make sure that user input is not 
     * empty. If user fails to enter full name and ID, this method will throw
     * an illegal exception message instructing user to type full name and ID.
     * Notice this method is called in the first constructor with three parameters.
     *
     * @param  firstName: gets user first name.
     * @param  lastName: gets user last name.
     * @param  ID: gets user ID
     * @return    first name and last name and ID.
     */
    public boolean checkIfEmpty(String firstName, String lastName, String ID){
        return (firstName == "" || lastName == ""|| ID == "");
    }
    
    /**
     * This is the accessor that gets the user first name.
     *
     * @param  No parameter
     * @return    first name.
     */
    
    public String getFirstName() {
        return firstName;
    }
    
    /**
     * This is the accessor that gets the user last name.
     *
     * @param  No parameter. 
     * @return    last name.
     */

    public String getLastName() {
        return lastName;
    }
    
    /**
     * This is the accessor that gets the user ID.
     *
     * @param  No parameter.
     * @return    ID.
     */

    public String getID() {
        return ID;
    }
    
    /**
     * This is the toString method that prints and returns information. In this method, i check with if statements 
     * if a student chooses csc110,csc142, or csc143. A student can only be in one class at a time. 
     *
     * @param  No parameter
     * 
     * @return  firstName
     * @return   lastName
     * @return   ID
     * @return   choosen
     * @return   ONE_CLASS * ONE_CREDIT_COST  
     */
    
    public String toString() {
        //int credit = 0;
        String choosen = "None";
        if(csc110)
            choosen = "CSC110";
        else if(csc142)
            choosen = "CSC142";
        else if(csc143)
            choosen = "CSC142";
        return "The name: " + firstName + " " + lastName + "\nID:" + ID + "\nThe chosen class:" + choosen +
        "\nCredits:" + ONE_CLASS + "\nCredit Price:110.0" + "\nThe balance:" + 
        ONE_CLASS * ONE_CREDIT_COST + "\n";
    }
    
    /**
     * This is the method  that returns true or false as to whether a student belongs to a 
     * particular class or not. In this case, csc110. Method will return false if a student 
     * does not belong in this class, csc110.
     *
     * @param  No parameter
     * @return    csc110
     */

    public boolean isCsc110() {
        return csc110;
    }
    
    /**
     * This mutator sets or assigns csc110 to the private field csc110.
     *
     * @param  csc110: This is the class name this parameter is set at.
     * @return    Nothing
     */

    public void setCsc110(boolean csc110) {
        this.csc110 = csc110;
    }
    
    /**
     * This is the method that returns true or false as to whether a student belongs to a 
     * particular class or not. In this case, csc142. Method will return false if a student 
     * does not belong in this class, csc142.
     *
     * @param  No parameter.
     * @return    csc142.
     */

    public boolean isCsc142() {
        return csc142;
    }
    
    /**
     * This mutator sets or assigns csc142 to the private field csc142.
     *
     * @param  y  csc142
     * @return    Nothing
     */

    public void setCsc142(boolean csc142) {
        this.csc142 = csc142;
    }
    
    /**
     * This is the method that returns true or false as to whether a student belongs to a 
     * particular class or not. In this case, csc143. Method will return false if a student 
     * does not belong in this class, csc143.
     * @param  No parameter
     * @return    csc143
     */

    public boolean isCsc143() {
        return csc143;
    }
    
    /**
     * This mutator sets or assigns csc143 to the private field csc143.
     *
     * @param   csc143
     * @return  Nothing.
     */

    public void setCsc143(boolean csc143) {
        this.csc143 = csc143;
    }
}

