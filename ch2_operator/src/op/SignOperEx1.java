package op;

// 연산자
// 단항연산자 : 음수, 양수, 증감
// 이항연산자 : 산술연산자, 비교연산자, 논리연산자, 대입연산자

public class SignOperEx1 {
    public static void main(String[] args) {
        // 음수, 양수
        int x = -100;
        int result1 = +x;
        int result2 = -x;

        System.out.println("reslut1 = "+result1);
        System.out.println("reslut2 = "+result2);
    }
}
