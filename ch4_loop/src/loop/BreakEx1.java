package loop;

// break : switch, 반복문 중지(break 포함된 가장 가까운 반복문 탈출)

// if : 실행할 구문이 하나인 경우 {} 생략가능
// sum > 100 경우 break

public class BreakEx1 {
    public static void main(String[] args) {

        int sum = 0, i = 0;

        while (true) {
            if (sum > 100)
                break;
            ++i; // 여기서 부터는 100 이하는 계속 돌아가다가 100 이 넘고 if부터 다시 시작하면 멈춤!
            sum += i;
        }

        System.out.printf("i = %d, sum = %d", i, sum);

    }
}
