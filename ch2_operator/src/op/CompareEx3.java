package op;

// 비교연산자 : 결과는 true or false
// 대소비교 : <, >, <=, >=
// 등가비교 : ==(equal)(주소비교), !=(not equal)

// 문자열 : "" => ex) "a", "abc"
// 코딩에서 영어의 대소문자는 같지 않다 = 유니코드가 다르다

// \t = tab
// 두 변수의 타입이 다른 경우 타입을 맞춘 후 비교


public class CompareEx3 {
    public static void main(String[] args) {
        // 변수선언 : 기본타입(ch1-VarByteEx1 참고)
        // 자바에서 문자열은 기본타입으로 선언하지 않는다. => 객체타입으로 선언
        // 객체타입 : 대문자로 시작하면 객체타입
        // 문자열을 만들 때
        
        String str1 = "abc"; // 방식 1) -> 스트링 풀 안에 abc 저장
        String str2 = "abc"; // 같은 문자열 이기에 같은 공간에 있는 abc로 인식
        String str3 = new String("abc"); // 방식 2) 객체타입일 때 정석적인 문자열 작성 방법 -> 스트링 풀 안에 또다른 스트링 풀(heap) 여기에 abc를 저장

        // str1(str2)을 저장하는 공간과 str3을 저장하는 공간이 다름
        // 같은 공간에서 저장된 문자열 비교시 == 사용하면 true => str1 과 str2의 비교 <값 비교>
        // 다른 공간에서 저장된 문자열 비교시 == 사용하면 false  => str1 과 str2의 비교 <주소 비교>
        
        System.out.printf("str1 == str2 = %b\n", (str1 == str2)); //true
        System.out.printf("str1 == str3 = %b\n", (str1 == str3)); // false

        // 문자열 비교시 == 대신에, equals(), equalsIgnoreCase() 사용
        // equalsIgnoreCase() : 대소문자 구분없이 (영어일때만)
        System.out.printf("str1 .equals str3 = %b\n", (str1 .equals(str3))); // true : 다른 주소에 있는 문자열 비교
        System.out.printf("str1 .equals(ABC) = %b\n", (str1 .equals("ABC"))); // false : 대소문자 구별
        System.out.printf("str1 .equalsaIgnoreCase str3 = %b\n", (str1 .equalsIgnoreCase(str3))); // true : 다른 주소에 있는 문자열 비교
        System.out.printf("str1 .equalsaIgnoreCase (ABC) = %b\n", (str1 .equalsIgnoreCase("ABC"))); // true : 대소문자 구분없이


    }
}
