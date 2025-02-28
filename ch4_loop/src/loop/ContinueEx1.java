package loop;

// continue : 반복문에서만 사용 = 반복이 진행되는 도중에 continue문을 만나면 반복문의 끝으로 이동하여 다음 반복으로 넘어감

public class ContinueEx1 {
    public static void main(String[] args) {

        for (int i = 0; i < 11; i++) {
            if (i % 3 == 0) // 3, 6, 9 출력 안함 => 조건값이 true만 안나옴 => why? continue 다음 구문인 print(i)를 건너뛰고 다시 반복을
                            // 돌렸으니까
                continue;
            System.out.println(i); // if => true => continue 이후 구문 건너 뜀
        }

        // 1 ~ 10 짝수만 출력
        for (int i = 1; i < 11; i++) {
            if (i % 2 != 0)
                continue;
            System.out.println(i);
        }
    }
}
