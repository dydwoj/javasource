package loop;

// 1 ~ 100 사이의 소수 구하기
// 소수 : 1과 자기자신을 제외한 어떤 수로도 나눠지지 않는 수

public class ForEx13 {
    public static void main(String[] args) {

        int cnt = 0; // 나누어 떨어지는 개수를 세기 위한 것
        for (int i = 2; i <= 100; i++) {
            for (int j = 1; j < i; j++) {
                if (i % j == 0) {
                    cnt++;
                }
            }
            if (cnt == 2) {
                System.out.printf("%d", i);
            }
            cnt = 0;
        }

    }
}
