package oop;

// ReferenceParam : 주소 복사

public class ReferenceParamEx {
    public static void main(String[] args) {

        int x[] = { 10 };
        System.out.println("main() : x = " + x[0]);
        change(x); // => 주소 복사가 일어남 : 배열x의 주소를 보냄 = 배열명은 주소복사
        change2(x[0]); // => 값 복사 : 배열이 아닌 x배열의 0번(인덱스)의 값을 보내줌
        System.out.println("After change() ");
        System.out.println("main() : x = " + x[0]); // => 1000으로 바뀜

    }

    static void change(int x[]) {
        x[0] = 1000;
        System.out.println("change(0) : x = " + x[0]);
    }

    static void change2(int x) {
        x = 100;
        System.out.println("change2(0) : x = " + x);
    }

}
