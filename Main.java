


/**
 * Write a description of class Main here.
 * 
 * @author Nadezhda Rusina 
 * @version CSC 142, Fall 2017
 */
public class Main
{
    public static void main(String[] args){
        Student newStud=new Student("Name","LastName","123456789",false,true,false);
        //Check the Student class
        System.out.println(newStud.toString());
        //Check the class department
        Department newDep=new Department();
        for(int i=0;i<98;i++){
            newDep.addStudent(new Student("Name"+i,"LastName"+i,"3333"+i,true,false,false));
        }
        for(int i=0;i<51;i++){
            newDep.addStudent(new Student("Name"+i,"LastName"+i,"4444"+i,false,true,false));
        }
        for(int i=0;i<27;i++){
            newDep.addStudent(new Student("Name"+i,"LastName"+i,"5555"+i,false,false,true));
        }
        System.out.println(newDep.toString());
    }
}

