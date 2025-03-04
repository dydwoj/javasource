package ch1;

// 변수의 유효범위
// { } 안에서 선언된 변수는 { ]를 벗어난 곳에서 사용 불가

public class ScopeEx1 {
    public static void main(String[] args) {

        int a = 100; // 여기서의 a 는 main 의 범위 내에서 사용가능

        {
            int x = 10;
            System.out.println("x = " + x); // 여기서 선언된 x는 지금의 중괄호 범위내에서만 사용 가능
            System.out.println("a = " + a);
        }

        System.out.println("a = " + a);

        // x cannot be resolved to a variable => 유효범위 오류
        // System.out.println("x = " + x);

        if (a < 200) {
            int sum = 0; // sum은 if문에서만 사용 가능
            System.out.println(sum);
        }

        // System.out.println(sum); => if 범위 밖이라 sum 사용불가

        for (int i = 0; i < args.length; i++) {

        }
        // System.out.println(i); => 여기의 i도 for문 범위 밖이라 사용 불가

    }
}
