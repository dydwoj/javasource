package op;

import java.util.Scanner;

// 사용자로부터 문자를 입력받은 후 그 문자가
// 숫자 or 영문자인지 판별하는 프로그램
// true && true ==> true (둘다 true여야 true)
// true || false ==> true (둘 중에 하나만 true라면 결과값은 true)
// !true ==> false / !false ==> true (! : not 이므로 결과값이 반대로 나온다)

public class LogicalEx2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("문자를 하나 입력하세요");

        String input = scanner.nextLine();

        char ch = input.charAt(0); // => "bcd" 를 입력했을 때 0번째를 가져와 했으니까 -> b -> 영문자
        // "abc" => "abc" .charAt(0) = a, "abc" .charAt(1) = b
        // charAt(index) : 문자열을 문자로 분해해서 돌려 받을 수 있는 매소드
        // index는 무조건 0부터 시작

        if ('0' <= ch && ch <= '9') {
            System.out.println("입력하신 문자는 숫자입니다");
        }
        // if (){} : 첫 ()가 사시리면 두번째{} 실행해주세요

        if (('a' <= ch && ch <= 'z') || ('A' <= ch && ch <= 'Z')) {
            System.out.println("입력하신 문자는 영문자입니다");
        }

        scanner.close();

    }
}
