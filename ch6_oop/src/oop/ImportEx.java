package oop;

/*
 import문 : 다른 패키지의 클래스 사용할 때

 import문을 사용하지 않는 패키지 : 자동으로 import 처리 해줌
    ㄴ java.lang.* (* : 패키지에 속한 모든 클래스)
        ex. java.lang.String => 이것도 lang이라서 사용 X
*/
import java.util.Scanner;
import extend.Parent;
import java.util.Date;
import java.text.SimpleDateFormat;

// Math 안 요소들이 static 이기 때문에 import static 으로 호출
import static java.lang.Math.*; // => 아래의 Math 를 없애고 쓸 수 있음

public class ImportEx {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println(sc);

        Parent parent = new Parent();
        System.out.println(parent);

        Date date = new Date();
        System.out.println(date); // => Fri Mar 07 16:41:09 KST 2025

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        System.out.println("오늘 날짜는 : " + sdf.format(date));

        // Math : static 메서드로 선언됨
        // System.out.println(Math.min(15, 25)); // => import 구문이 안들어 옴
        System.out.println(min(15, 25)); // => import static 으로 호출 했기에 Math. 생략가능
        // System.out.println(Math.random());
        System.out.println(random()); // => import static 으로 호출 했기에 Math. 생략가능

    }
}
