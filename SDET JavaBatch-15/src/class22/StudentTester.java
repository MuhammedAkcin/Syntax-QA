package class22;

public class StudentTester {
    public static void main(String[] args) {
        Student [] students={new SyntaxStudent(),new CollegeStudent(),new SchoolStudent()};
        for (Student student:students)  {
            student.practice();
            student.doHomework();
            student.study();
        }
    }
}
