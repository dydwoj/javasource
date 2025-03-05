package oop;

// 외부 클래스일 경우

/* 메서드 종류
 1. 인스턴스 메서드 : 인스턴스가 생성되었을 때 (new Card 하는 순간 올라감 ex. new Card())
 2. 클래스 메서드 : 클래스가 메모리에 올라갔을 때 (작성하고 저장하는 순간 올라감)
*/

public class MiniCalcEx {
    public static void main(String[] args) {

        // print() 메서드 호출 : 클래스메서드이기에 객체 생성(new) 없이 생성 가능
        MiniCalc.print();
        System.out.println(MiniCalc.k);

        // execute() 호출
        MiniCalc calc = new MiniCalc();
        calc.execute();
        calc.a = 7;

    }
}
