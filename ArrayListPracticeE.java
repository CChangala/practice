import java.util.ArrayList;
import java.util.Comparator;

class Student{
    private String name;
    private double gpa;

    public Student(String name,double gpa){
        this.name  = name;
        this.gpa = gpa;
    }

    public String getName(){
        return name;
    }

    public double getGpa(){
        return gpa;
    }    
}

public class ArrayListPracticeE {

    public static void main(String[] args){

        ArrayList<Student> students = new ArrayList<>();

        students.add(new Student("Tanya",8.56));
        students.add(new Student("Chai",9.00));
        students.add(new Student("Suks",8.00));
        students.add(new Student("Tany",7.00));

        students.sort((a,b) -> {
            if(b.getGpa() - a.getGpa() > 0){
                return 1;
            }
            else if(b.getGpa() - a.getGpa() < 0){
                return -1;
            }
            else{
                return 0;
            }
        }); //this doesn't work as the fraction is made zero. So we have to write the logic in code

        //or we can also try this:
        Comparator<Student> comparator = Comparator.comparing(Student :: getGpa).reversed().thenComparing(Student::getName);

        for(Student student:students){
            System.out.println("NAME:"+ student.getName() + " Gpa:"+ student.getGpa());
        }
    }
    
}
