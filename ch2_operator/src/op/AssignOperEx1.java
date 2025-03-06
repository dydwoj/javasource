package op;

// 복합대입연산자
// 기존값을 불러서 연산을 하고 다시 담기 = 

public class AssignOperEx1 {
    public static void main(String[] args) {

        int result = 0;

        result += 10;// => result = result + 10;

        result -= 5; // result = result - 5;

        result *= 5; // result = result * 5;

        result /= 5; // result = result / 5;

        result %= 5; // result = result % 5;

        System.out.println(result);

    }
}
