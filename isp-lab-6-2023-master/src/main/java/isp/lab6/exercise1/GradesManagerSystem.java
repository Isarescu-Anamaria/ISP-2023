package isp.lab6.exercise1;
import java.util.ArrayList;
public class GradesManagerSystem {
    private ArrayList<Student> list = new ArrayList<>();
    public void addStudent(Student s){
        list.add(s);

    }
    //remove
    public void removeStudent(Student s){

        if(s.equals(s)) {
            list.remove(s);
        }
        System.out.println("Student removed");
    }
    //update
    public void updateStudent(Student s,String clas,double grade){
        if(s.equals(s)) {
            s.addGrade(clas,grade);
        }
        System.out.println("Grades of " + s.getName() + " is updated");
        s.average();
    }

    public Student searchByName(String name){
        for(Student s:list)
            if(s.getName().equals(name))
                return s;
        return null;
    }

    //display all the students
    public void printAll() {
        for(Student s:list)
            System.out.println(s);
    }

    public ArrayList<Student> getList() {
        return list;
    }
}
