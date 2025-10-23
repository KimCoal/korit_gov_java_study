package _16_Class.Student;

public class StudentMain {
    public static void main(String[] args) {

        Student student1 = new Student("asd",12,"21","123");

//        student1.name = "이진규";
//        student1.age = 25;
//        student1.email = "KimCoal.github.com";
//        student1.address = "부산광역시 연제구";

        System.out.println(student1.getName());
        System.out.println(student1.getAddress());
        System.out.println(student1.getAge());
        System.out.println(student1.getEmail());
        student1.showInfo();

        student1.setName("Coal");
        System.out.println(student1.getName());



    }
}
