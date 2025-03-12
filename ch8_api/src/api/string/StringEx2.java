package api.string;

import java.util.Arrays;

public class StringEx2 {
    public static void main(String[] args) {

        String str = "안녕하세요";

        // 문자열 길이
        System.out.println("문자열 길이 : " + str.length());
        System.out.println("지정된 위치에 있는 문자 반환 : " + str.charAt(0));
        System.out.println("지정된 위치에 있는 문자 반환 : " + str.charAt(4));
        System.out.println();

        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i));
        }

        System.out.println();

        // 강사님 chArr 배열
        char[] chArr = new char[str.length()];
        // chArr[0] = str.charAt(0);
        // chArr[1] = str.charAt(1);
        // chArr[2] = str.charAt(2);
        // chArr[3] = str.charAt(3);
        // chArr[4] = str.charAt(4);

        for (int i = 0; i < chArr.length; i++) {
            chArr[i] = str.charAt(i);
        }

        System.out.println("chArr : " + Arrays.toString(chArr));

        // 내꺼 char 배열
        char[] charr = { '안', '녕', '하', '세', '요' };
        for (int i = 0; i < charr.length; i++) {
            System.out.print(charr[i]);
        }
        System.out.println();
        System.out.println();

        // String => char 배열로 변환
        char[] result = str.toCharArray();
        System.out.println(result);

        // 존재하면 인덱스 리턴
        System.out.println("주어진 문자가 문자열에 존재하는지 여부 : " + str.indexOf("녕하")); // => 존재 O : 0
        System.out.println("주어진 문자가 문자열에 존재하는지 여부 : " + str.indexOf("반")); // => 존재 X : -1

        // indexof 를 이용한 T / F
        // 자바 문자가 있으면 자바와 관련있는 책입니다. / X 면 자바와 관련없는 책입니다.
        String subject = "자바의 정석";
        if (subject.indexOf("자바") >= 0) {
            System.out.println("자바와 관련있는 책입니다.");
        } else {
            System.out.println("자바와 관련없는 책입니다.");
        }

        // contains 를 이용한 T / F => 이게 더 편함 why? = 리턴타입 : boolean이라
        System.out.println("주어진 문자가 문자열에 존재하는지 여부 : " + str.contains("안"));
        if (str.contains("자바")) {
            System.out.println("자바와 관련있는 책입니다.");
        } else {
            System.out.println("자바와 관련없는 책입니다.");
        }

        // 찾기 시작하는 위치 지정 가능
        System.out.println("찾는 단어 + 찾는 시작위치 지정 : " + str.indexOf("하", 3));
        System.out.println("문자열의 끝에서부터 찾기 : " + str.lastIndexOf("하"));
        String str2 = "java.lang.String";
        System.out.println(str2.indexOf(".")); // => 4
        System.out.println(str2.indexOf(".", 5)); // => 9
        System.out.println(str2.lastIndexOf(".")); // => 9

    }
}
