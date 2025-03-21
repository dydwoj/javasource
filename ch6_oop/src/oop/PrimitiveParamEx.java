package oop;

// static 메서드 : 클래스 메서드
// PrimitiveParam : 값 복사

public class PrimitiveParamEx {

    // 아래는 main 메서드
    public static void main(String[] args) {
        Data d = new Data();
        d.x = 100;
        System.out.println("main() : x = " + d.x);
        change(d.x);
        System.out.println("After change() ");
        System.out.println(d.x); // => 10000이 안되는 이유 : d.x의 값을 복제해서 change에 넘김
        // => change 안에서는 변환이 되서 나옴 but. 다시 d.x의 값은 주소가 서로 다름 (다른 공간에 존재)

        change2(d);
        System.out.println("After change() ");
        System.out.println(d.x);

        // PrimitiveParamEx obj = new PrimitiveParamEx();
        // obj.change();

    }

    // 여기서의 X의 값이 10000으로 안 빠져 나오는 이유! : 지역변수라서
    // 즉, 들어온 d.x값이 10000으로 바껴도 안에서만 10000이지 밖에서는 10000이 아님!
    // 즉, 값만 돌았던 거임!
    // 바꾸려면 d.x가 들고 있는 값이 아닌 d.x의 주소 이걸 바꿔줘야 함!

    // 호출(콜) 스택에 불려서 기능이 끝나면 콜스택에서 제거가 됨
    // 아래는 그저 "d.x(값)" 의 복제만 일어남
    static void change(int x) { // 지역변수의 값만 바꿈
        x = 10000; // => 지역 변수(여기 영역 안의 변수)
        System.out.println("change() : x = " + x);
    }

    // d(주소 들어있음)의 복제가 일어남(주소의 복사이므로 복제된 것과 main에서의 d가 가리키는 값이 같은 원본을 가리킴)
    // => 주소에 있는 값을 변경하면 복제된 곳이 가리키던 원본의 값도 변경이 됨
    static void change2(Data d) {
        d.x = 10000;
        System.out.println("change() : d.x = " + d.x);
    }
}
