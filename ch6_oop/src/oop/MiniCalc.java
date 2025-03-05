package oop;

// 내부 클래스일 경우

// 부를 수 있는 경우 = 생성 시기가 같을 때 => 같은 non-static 메서드들은 동시기에 생성 되기에 서로 부를 수 있음

/* 메서드 종류
 1. 인스턴스(non-static) 메서드 : 인스턴스가 생성되었을 때 (new Card 하는 순간 올라감 ex. new Card())
 2. 클래스(static) 메서드 : 클래스가 메모리에 올라갔을 때 (작성하고 저장하는 순간 올라감)
*/

// 같은 클래스 내에서 다른 메서드 호출 가능
// 같은 클래스에서는 이름만 이용해서 호출 가능

// static - non-static : 생성되는 시기가 다르기 때문에 호출 시점을 따져야 함
// static : 같은 static 자유롭게 호출 가능
// non-static : static 사용가능, non-static 사용가능

public class MiniCalc {

    static int k;
    int a, b;

    // static이 붙으면 클래스메서드
    static void print() {
        // this.a = 7; => 불가능
        k = 45; // => 인스턴스 메서드도 사용 가능
        // plus(), avg(), execute(), println() 호출 X => new 안해서!
        // ㄴ호출하려면 new MiniCalc() 한 후(잘 사용X)
    }

    int plus(int x, int y) {
        this.a = 7; // => 가능
        k = 45; // => 인스턴스 메서드도 사용 가능
        print();
        return x + y;
    }

    double avg(int x, int y) {
        double sum = plus(x, y);
        return sum / 2;
    }

    void execute() {
        double result = avg(7, 10);
        println("실행결과 : " + result);
    }

    void println(String msg) {
        System.out.println(msg);
    }
}
