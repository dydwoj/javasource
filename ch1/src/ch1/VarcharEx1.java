package ch1;

public class VarcharEx1 {
    public static void main(String[] args) {
        // 문자 : 글자 한개 => 'a' or '미' or ' '(공백도 문자)
        // 문자열 : 글자 한개 ~ 여러개 => "a" or "abc" or "대한민국"  or "미" or " "(공백도 문자열)

        // 여기서의 '기'는 그대로의 '기'가 아니라 "코드"로 인식 = 유니코드(utf8)
        // 기 -> 유니코드(숫자) : 인코딩 / 유니코드(숫자) -> 기 : 디코딩

        //기라는 문자를 ch1에 대입
        char ch1 = '기';

        // ch1의 값을 unicode 변수에 대입
        // int = char
        int unicode = ch1;
        System.out.println("ch1 = "+ch1);
        System.out.println("unicode = "+unicode); //'기' 문자의 unicode 값 : 44592
        
        
        char ch2 = 'a';
        unicode = ch2;
        System.out.println("ch2 = "+ch2);
        System.out.println("unicode = "+unicode); // 'a' = 97

        char ch3 = 'A';
        unicode = ch3;
        System.out.println("ch3 = "+ch3);
        System.out.printf("ch3 = %c\n",ch3);
        System.out.println("unicode = "+unicode); // 'A' = 65


    }
}
