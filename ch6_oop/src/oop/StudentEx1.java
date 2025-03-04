package oop;

// 인스터스의 생성 = 생성자 사용함

public class StudentEx1 {
    public static void main(String[] args) {

        // Student 인스턴스 생성, 사용
        Student student1 = new Student(); // => Student() 는 student.java의 생성자를 가리킴
        Student student2 = new Student(1, 5);
        Student student3 = new Student("s1234567", "홍길동", 2, 3, "010-1234-5678", "hong@gamil.com");

        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student3);
    }
}
