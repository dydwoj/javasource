package op;

public class ArthmeticEx2 {
    public static void main(String[] args) {
        // 변수 선언 - int a, b
        byte a = 10, b = 4;
        // byte, short 연산 수행시 연산의 결과가 int 형으로 변경이 됨
        // byte c = a + b; => 오류
        // 해결책 1)
        // int c = a + b;

        // 해결책 2) 결과값이 : -128 ~ 127 사이인 경우에만
        byte c = (byte) (a + b);
        System.out.println(c);

    }
}
