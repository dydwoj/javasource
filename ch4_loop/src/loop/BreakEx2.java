package loop;

// break : switch, 반복문 중지(break 포함된 가장 가까운 반복문 탈출)
// break + if 형태를 주로 사용

// 주사위 눈이 6이 나올때까지 굴리기

public class BreakEx2 {
    public static void main(String[] args) {

        int num = 1;

        while (true) {
            num = (int) (Math.random() * 6) + 1;
            System.out.printf("주사위 : %d\n", num);

            if (num == 6)
                break;
        }
    }
}
