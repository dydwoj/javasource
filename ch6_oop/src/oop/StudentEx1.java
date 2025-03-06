package oop;

// 인스터스의 생성 = 생성자 사용함

public class StudentEx1 {
    public static void main(String[] args) {

        // Student 인스턴스 생성, 사용
        Student student1 = new Student(); // => Student() 는 student.java의 생성자를 가리킴
        Student student2 = new Student(1, 5);
        Student student3 = new Student("s1234567", "홍길동", 2, 3, "010-1234-5678", "hong@gamil.com");
        Student student4 = new Student("s2143567", "정약용", 3, 3, "010-5678-1234", "jeong@gamil.com");

        // 개발자 확인용
        System.out.println(student1);
        System.out.println(student2);
        // System.out.println(student3);
        // System.out.println(student4);

        studentInfo(student3);
        // System.out.println("=============================");
        // System.out.println("아이디 : " + student3.getStuId());
        // System.out.println("이름 : " + student3.getName());
        // System.out.println("학년 : " + student3.getGrade());
        // System.out.println("반 : " + student3.getClassNum());
        // System.out.println("전화번호 : " + student3.getPhone());
        // System.out.println("이메일 : " + student3.getEmail());
        // System.out.println("=============================");

        System.out.println();

        studentInfo(student4);
        // System.out.println("=============================");
        // System.out.println("아이디 : " + student4.getStuId());
        // System.out.println("이름 : " + student4.getName());
        // System.out.println("학년 : " + student4.getGrade());
        // System.out.println("반 : " + student4.getClassNum());
        // System.out.println("전화번호 : " + student4.getPhone());
        // System.out.println("이메일 : " + student4.getEmail());
        // System.out.println("=============================");

        // 홍길동 전화번호 변경
        student3.changetel("010-5678-9536");
        System.out.println(student3);

    }

    public static void studentInfo(Student student) {
        System.out.println("=============================");
        System.out.println("아이디 : " + student.getStuId());
        System.out.println("이름 : " + student.getName());
        System.out.println("학년 : " + student.getGrade());
        System.out.println("반 : " + student.getClassNum());
        System.out.println("전화번호 : " + student.getPhone());
        System.out.println("이메일 : " + student.getEmail());
        System.out.println("=============================");
    }

}
