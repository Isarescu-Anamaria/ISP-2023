package isp.lab6.exercise1;
import java.util.Objects;
import java.util.HashMap;
import java.util.Map;
public class Student {
    private int id;
    private String name;
    private String department;
    private HashMap <String, Double> grades = new HashMap<>();
    //constructor

    public Student(int id,String name, String department) {
        this.name = name;
        this.department = department;
        this.id = id;
    }
    //methods

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void addGrade(String clas,double grade){
        grades.put(clas,grade);
    }
   //average grade of a student
    public double average(){

        double sum = 0.00;
        int count = 0;
        for(double val:grades.values()){
            sum +=val;
            count++;
        }
        double av = sum / count;
        System.out.println("average = "+ av);
        return av;
        }

    @Override
    public boolean equals(Object s) {
        if(s == null)return false;
        if(!(s instanceof Student))return false;
        Student other = (Student) s;
        return this.id == other.id
                && name.equals(other.name)
                && department.equals(other.department);
    }
    public int hashCode() {
        return id;
    }
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", department='" + department + '\'' +
                '}';
    }

}
