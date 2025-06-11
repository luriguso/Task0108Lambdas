package level3.exercise1.classManagement;

import level3.exercise1.classData.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StudentManagement {
    List<Student> students;
    public StudentManagement() {
        students = new ArrayList<>();
    }

    public void addStudentExample() {
        students.add(new Student("luis", 28, "JAVA", 7));
        students.add(new Student("andrea", 18, "PHP", 5));
        students.add(new Student("ricardo", 17, "JS", 6));
        students.add(new Student("ana", 24, "PHP", 3));
        students.add(new Student("marcelo", 26, "JAVA", 4));
        students.add(new Student("adrian", 18, "JAVA", 9));
        students.add(new Student("carlos", 27, "PHP", 7));
        students.add(new Student("juan", 16, "JAVA", 4));
        students.add(new Student("pedro", 17, "JS", 6));
        students.add(new Student("ariane", 18, "JAVA", 5));
    }

    public void listStudentsNameAge() {
        students.stream().forEach(Student ->System.out.println("Name: " +  Student.getName() + " Age: " +  Student.getAge()));
    }

    public void listStudentsWithA(){
        List<Student> studentsWithA = this.students.stream()
                .filter(Student->Student.getName().toLowerCase().startsWith("a"))
                .collect(Collectors.toList());

        studentsWithA.forEach(student -> System.out.println("Student with name starting with letter A "+ student.getName()));
    }

    public void listStudentsNote5(){
        List<Student> studentsNote5 = this.students.stream()
                .filter(Student->Student.getNotes()>=5)
                .collect(Collectors.toList());

        studentsNote5.forEach(student -> System.out.println("Student with Note >=5: "+ student.getName()));
    }

    public void listStudentNote5Php(){
        List<Student> studentsNota5Php = this.students.stream()
                .filter(Student->Student.getNotes()>=5 && Student.getCourse().equals("PHP"))
                .collect(Collectors.toList());
        studentsNota5Php.forEach(student -> System.out.println("Student with Note >= 5 and Course PHP: "+ student.getName()));
    }

    public void listStudentsJavaAge18(){
        List<Student> studentsJava = this.students.stream()
                .filter(Student->Student.getCourse().equals("JAVA") && Student.getAge()>=18)
                .collect(Collectors.toList());
        studentsJava.forEach(student -> System.out.println("Student to JAVA and Adult: " +  student.getName()));
    }
}
