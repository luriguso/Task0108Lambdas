package level3.exercise1.main;

import level3.exercise1.classManagement.StudentManagement;

public class Main {
    public static void main(String[] args) {
        StudentManagement studentManagement = new StudentManagement();
        studentManagement.addStudentExample();
        studentManagement.listStudentsNameAge();
        studentManagement.listStudentsWithA();
        studentManagement.listStudentsNote5();
        studentManagement.listStudentNote5Php();
        studentManagement.listStudentsJavaAge18();
    }
}
