package api.string;

import java.util.Arrays;

public class StringEx3 {
    public static void main(String[] args) {

        // 문자열 연결 : +(연산자)
        String str = "Hello";
        str += " World";
        System.out.println(str);

        // concat() : 문자열을 뒤에 붙인다
        String str2 = "안녕하세요";
        str2 = str2.concat(" 반갑습니다");
        System.out.println(str2);

        // endsWith(), startsWith()
        System.out.println("지정된 문자열로 종료 여부 : " + str.endsWith("요"));
        System.out.println("지정된 문자열로 종료 여부 : " + str.startsWith("요"));
        // 이미지 파일 : png or gif or jpg 인지?
        String file = "test.txt";
        if (file.endsWith("png") || file.endsWith("gif") || file.endsWith("jpg")) {
            System.out.println("이미지 파일입니다.");
        } else {
            System.out.println("이미지 파일이 아닙니다.");
        }

        // replace() : 결과는 새로운 문자열로 반환
        // replace(), replaceAll(), replaceFirst()
        System.out.println("replace(old, new) : " + str.replace("Hello", "안녕하세요"));
        System.out.println(str); // => Hello World => 원본 변경 불가
        // 원본 변경
        str = str.replace("Hello", "안녕하세요");
        System.out.println(str); // => 안녕하세요 World
        // replaceAll() : 정규식 사용가능
        System.out.println(str.replaceAll("[a-z]", "1")); // => 안녕하세요 W1111
        // replaceFirst()
        str2 = "Hellollo";
        System.out.println(str2.replaceFirst("ll", "1"));

        // substring()
        str2 = "java.lang.Object";
        System.out.println("특정 위치의 문자열을 얻기 : " + str2.substring(10)); // Object
        System.out.println("특정 위치의 문자열을 얻기 : " + str2.substring(5, 9)); // lang

        // split()
        str2 = "dog,cat,bear";
        System.out.println("지정한 분리자(원하는 문자열)로 나누어 배열로 반환 : " + Arrays.toString(str2.split(",")));
        String[] arr = str2.split(",", 1);
        for (String string : arr) {
            System.out.println(string);
        }

        // 대문자 / 소문자 변경
        str2 = "HELLo";
        System.out.println("소문자 변경 : " + str2.toLowerCase());
        System.out.println("대문자 변경 : " + str2.toUpperCase());

        // trim() : 양쪽 끝에 있는 공백 제거
        String str3 = "   Hello World    ";
        System.out.println(str3);
        System.out.println(str3.trim());

        // valueOf() : 문자열로 반환
        int i = 5;
        String str4 = String.valueOf(i);
        str4 = i + "";
        System.out.println(str4); // => "5"

    }
}
