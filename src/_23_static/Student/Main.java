package _23_static.Student;

public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        System.out.println(Student.curriculum);
        System.out.println(student.getStatic());
        // curriculum은 모든 클래스가 공유하고 있는 static변수이기 떄문에 메모리 주소가 항상 똑같다
        

    }
}
