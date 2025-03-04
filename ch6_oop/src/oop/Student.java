package oop;

// 멤버 변수, 멤버 메소드, 생성자
// 속성 = 필수 X / 생성자 = 자동으로 default값을 만들어줌 => 필수 X

public class Student {

    // 속성 : 학번(s1024125), 이름(홍길동), 학년(1), 반(1), 전화번호(010-1234-1234)
    // 이메일(hong@gamil.com)
    String stuId;
    String name;
    int grade;
    int classNum;
    String phone;
    String email;

    // 생성자 : 클래스명(){} : 개발자가 명시하지 않으면 컴파일러가 자동으로 default 생성자 만들어 줌 but 생성자를 지정하면
    // 기본값은 작동 X
    public Student() { // => default 생성자 : () 안에 아무것도 없을 경우
    }

    // 생성자의 목적 = 멤버 변수 초기화
    public Student(String stuId, String name, int grade, int classNum, String phone, String email) {
        this.stuId = stuId;
        this.name = name;
        this.grade = grade;
        this.classNum = classNum;
        this.phone = phone;
        this.email = email;
    } // => 이것도 생성자

    // public Student(int grade, int classNum) => 지역변수(전달인자)
    public Student(int grade, int classNum) {
        this.grade = grade; // => this. : 속성의 멤버 변수를 가리킴
        this.classNum = classNum;
    } // => 이것도 생성자

    // 주의!! : 생성자에서 () 안의 갯수는 달라야 한다

    // 기능 : 전화번호 변경한다, 이메일을 변경한다, 학년을 변경한다, 반을 변경한다
    // 메소드 : 리턴타입(void) 메소드명(){}

    void changetel() {
    }

    void changeemail() {
    }

    void changegrade() {
    }

    void changeclassNum() {
    }

    @Override
    public String toString() {
        return "Student [stuId=" + stuId + ", name=" + name + ", grade=" + grade + ", classNum=" + classNum + ", phone="
                + phone + ", email=" + email + "]";
    }

}
