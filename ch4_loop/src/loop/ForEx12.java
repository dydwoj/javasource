package loop;

// 4x + 5y = 60
// x, y는 10 이하의 자연수
// 만족하는 출력문 예시 (x,)

public class ForEx12 {
    public static void main(String[] args) {

        for (int x = 1; x <= 10; x++) {
            for (int y = 1; y <= 10; y++) {
                if (4 * x + 5 * y == 60) {
                    System.out.printf("(%d, %d)\n", x, y);
                }
            }
        }

    }
}
