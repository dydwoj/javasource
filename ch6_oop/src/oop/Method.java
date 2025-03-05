package oop;

/* 메소드(소문자로 시작) : 리턴타입 메소드명(){}
 리턴(반환) 타입 : 기본타입(정수, 실수, 문자, 불린형), 객체(대문자로 시작), 배열, void(리턴타입 없음의 의미)
 void를 제외한 나머지 타입 : 타입 이름 (){return(=> 필수) 타입에 맞는 값;}
*/

public class Method {

    int method1() {
        int sum = 15;

        // return 0;
        return sum;
    }

    String method2() {
        String str = "Hello";

        // return "";
        // return null; // => 객체일 경우 null 도 가능
        return str;
    }

    double method3() {
        return 35.5;
    }

    char method4() {
        return ' ';
    }

    void method5() {
        return; // => 없어도 되지만 넣어도 되긴 함 -> 대신 return; 으로 끝냄
    }

    // 매개변수가 있는 메서드 : 매개변수 : 기본타입(정수, 실수, 문자, 불린형), 객체(대문자로 시작), 배열 / 개수 상관X (1 ~)
    int add(int x, int y) {
        return x + y;
    }

    // 출력을 float로 하고 싶으면 float로 형변환 아니면 int로 형변환
    float add2(int x, float y) {
        // float + int => float
        return x + y;
    }

    void print(String name, String id) {
        System.out.println(name + ": " + id);
    }

    int[] arr(int[] arr1) {
        return arr1;
    }

}
