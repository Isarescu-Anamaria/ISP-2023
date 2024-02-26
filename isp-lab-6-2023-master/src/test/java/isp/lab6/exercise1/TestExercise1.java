package isp.lab6.exercise1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
public class TestExercise1 {
    @Test
    public void testAddStudent(){

        GradesManagerSystem gms = new GradesManagerSystem();
        Student student = new Student(1,"Popescu Andrei","Automatica");
        assertEquals(0,gms.getList().size());
        gms.addStudent(student);
        assertEquals(1,gms.getList().size());
        Student student2 = new Student(2,"Grigore Bogdan","Calculatoare");
        gms.addStudent(student2);
        assertEquals(2,gms.getList().size());
    }
    @Test
    public void testRemoveStudent(){
        GradesManagerSystem gms = new GradesManagerSystem();
        Student student = new Student(1,"Popescu Andrei","Automatica");
        assertEquals(0,gms.getList().size());
        gms.addStudent(student);
        assertEquals(1,gms.getList().size());
        Student student2 = new Student(2,"Grigore Bogdan","Calculatoare");
        gms.addStudent(student2);
        assertEquals(2,gms.getList().size());
        gms.removeStudent(student);
        assertEquals(1,gms.getList().size());
        gms.removeStudent(student2);
        assertEquals(0,gms.getList().size());
    }
    @Test
    public void testUpdateStudent(){
        GradesManagerSystem gms = new GradesManagerSystem();
        Student student = new Student(1,"Popescu Andrei","Automatica");

        gms.addStudent(student);
        student.addGrade("analiza",7.00);
        student.addGrade("fizica",8.00);
        student.addGrade("engleza",10.00);
        student.addGrade("pc",7.00);
        gms.updateStudent(student,"analiza",9.00);
        double average = student.average();
        assertEquals(8.50,average,0.00);

    }
    @Test
    public void testAverage(){
    Student student = new Student(1,"Popescu Andrei","Automatica");
    student.addGrade("analiza",7.00);
    student.addGrade("fizica",8.00);
    student.addGrade("engleza",10.00);
    student.addGrade("pc",7.00);
    double average = student.average();
    assertEquals(8.00,average,0.00);
}
}
