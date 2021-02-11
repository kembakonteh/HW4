
/**
 * The purpose of this assignment is to introduce us to creating our own objects,
 * along with private data, constructors, and also methods such as toString 
 * method. In this project, i created two supplier classes that interact with
 * each other (through a “has a” relationship). A student and a department 
 * class
 * 
 * This is the department class. In this class, there are two constructors,one 
 * with four parameters and the other empty constructor. In 
 * this class,i calculate (number of groups)and keep track of total number of students enrolled in 
 * a class;howeve,information from the student class. Everytime a new student is added, the total student is
 * incremented and kept track of. Also the total balance is calculated and kept track of.
 * 
 * Mutators and Accessors are created that asign values and retrieve and 
 * return information to the calling program respectively.
 * 
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Department
{
   
    public final int maxStudent = 28;

    private int totalStud110;
    private int totalStud142;
    private int totalStud143;
    private double totalBalance;
    private int totalStudent;
    private int totalGr110;
    private int totalGr142;
    private int totalGr143;
    
    /**
     * This is the empty constructor
     *
     * @param  No parameter
     * 
     * @return    Nothing
     */


    public Department() {

    }
    
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  totalStud110: assigns totalStud110 to the private field totalStud110.
     * @param  totalStud142: assigns totalStud142 to the private field totalStud142.
     * @param  totalStud143: assigns totalStud143 to the private field totalStud143.
     * @param  totalBalance: assigns totalBalance to the private field totalBalance.
     * 
     * @return    Nothing
     */


    public Department(int totalStud110, int totalStud142, int totalStud143, double totalBalance) {
        if(totalStud110 < 0 || totalStud142 < 0 || totalStud143 < 0)
            throw new IllegalArgumentException("You must enter information");
        this.totalStud110 = totalStud110;
        this.totalStud142 = totalStud142;
        this.totalStud143 = totalStud143;
        this.totalBalance = totalBalance;
        this.totalStudent = totalStud110 +totalStud142 + totalStud143;
        totalGr110 = getTotalGr110();
        totalGr142 = getTotalGr142();
        totalGr143 = getTotalGr143();
    }
    
    /**
     * This is the accessor that gets the total students enrolled in csc110
     *
     * @param  No parameter
     * 
     * @return    totalStud110
     */

    public int getTotalStud110() {
        return totalStud110;
    }
    
    /**
     * This is the accessor that gets the total students enrolled in csc142
     *
     * @param  No parameter
     * 
     * @return    totalStud142
     */
    
    public int getTotalStud142() {
        return totalStud142;
    }
    
    /**
     * This is the accessor that gets the total students enrolled in csc143
     *
     * @param  No parameter
     * 
     * @return    totalStud143
     */

    public int getTotalStud143() {
        return totalStud143;
    }
    
    /**
     * This is the accessor that gets the total balance
     *
     * @param   No parameter
     * 
     * @return    totalBalance
     */

    public double getTotalBalance() {
        return totalBalance;
    }
    
    /**
     * This is the accessor that gets the total student
     *
     * @param  No parameter
     * 
     * @return    totalStudent
     */

    public int getTotalStudent() {
        return totalStudent;
    }
    
    /**
     * This is the accessor that gets the total group in csc110. I used math.ceil to round it up to the
     * next integer since we cannot have a half student, or so.
     *
     * @param  No parameter
     * 
     * @return    totalGr110
     */

    public int getTotalGr110() {
        totalGr110 = (int)Math.ceil(totalStud110/maxStudent);
        return totalGr110;
    }
    
    /**
     * This is the accessor that gets the total group in csc142. I used math.ceil to round it up to the
     * next integer since we cannot have a half student, or so.
     *
     * @param  No parameter
     * 
     * @return    totalGr142
     */

    public int getTotalGr142() {
        totalGr142 = (int)Math.ceil(totalStud142/maxStudent);
        return totalGr142;

    }
    
    /**
     * This is the accessor that gets the total group in csc143. I used math.ceil to round it up to the
     * next integer since we cannot have a half student, or so.
     *
     *
     * @param  No parameter
     * 
     * @return    totalGr143
     */

    public int getTotalGr143() {
        totalGr143 = (int)Math.ceil(totalStud143/maxStudent);
        return totalGr143;
    }
    
    /**
     * This is the addStudent method. I called the object new student which is passes as a parameter
     * in the addStudent method to check if a student belongs in csc110, csc142,or csc143. And in each
     * case, the total student is incremented and also the total balance calculated.
     *
     * @param  Student newStudent
     * 
     * @return    Nothing
     */
                                                        
    public void addStudent(Student newStudent){         
       if (newStudent.isCsc110()) {                     //tota
           totalStud110++;
           totalBalance += newStudent.ONE_CLASS * newStudent.ONE_CREDIT_COST;
       }
       if(newStudent.isCsc142()){
           totalStud142++;
           totalBalance += newStudent.ONE_CLASS * newStudent.ONE_CREDIT_COST;
       }
       if(newStudent.isCsc143()){
           totalStud143++;
           totalBalance += newStudent.ONE_CLASS * newStudent.ONE_CREDIT_COST;
       }
        totalStudent = totalStud110 + totalStud142 + totalStud143;

    }
    
    /**
     * This is the toString method that pritns and returns information to the calling program.
     *
     * @param No parameter
     * 
     * @return    totalStud110
     * @return    totalGr110
     * @return    totalStud142
     * @return    totalGr142
     * @return    totalStud143
     * @return    totalGr143
     * @return    totalStudent
     * @return    totalBalance
     * 
     */
    
    public String toString() {
        return  "Total students in CSC110: " + totalStud110 + " in " + totalGr110 + " groups\n" +
                "Total students in CSC142: " + totalStud142 + " in " + totalGr142 + " groups\n" +
                "Total students in CSC143: " + totalStud143 + " in " + totalGr143 + " groups\n" +
                "Total students of the department: " + totalStudent + "\n" + 
                "Total Balance: $" + totalBalance;
    }
}


