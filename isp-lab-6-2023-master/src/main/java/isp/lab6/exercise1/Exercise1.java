package isp.lab6.exercise1;

public class Exercise1 {
    public static void main(String[] args) {
        Student student = new Student(1,"Popescu Andrei","Automatica");
        String s = student.toString();
        System.out.println(s);
        GradesManagerSystem gms = new GradesManagerSystem();
        gms.addStudent(student);

        student.addGrade("analiza",7.00);
        student.addGrade("fizica",8.00);
        student.addGrade("engleza",10.00);
        student.addGrade("pc",7.00);
        student.average();
        Student student2 = new Student(2,"Grigore Bogdan","Calculatoare");

        String s2 = student2.toString();
        System.out.println(s2);

        gms.addStudent(student2);
        student2.addGrade("analiza",5.00);
        student2.addGrade("fizica",8.00);
        student2.addGrade("engleza",10.00);
        student2.addGrade("pc",8.00);
        student2.average();
        gms.printAll();
        gms.removeStudent(student);
        gms.printAll();
        gms.updateStudent(student2,"analiza",7.00);
    }
}
