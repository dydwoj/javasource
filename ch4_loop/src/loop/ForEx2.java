package loop;

// 반복문 (for, while, do ~ while) : 반복적으로 실행해야 하는 코드를 간단하게 처리

// 안녕하세요 10번 출력

public class ForEx2 {
    public static void main(String[] args) {

        // System.out.println("안녕하세요");
        // System.out.println("안녕하세요");
        // System.out.println("안녕하세요");
        // System.out.println("안녕하세요");
        // System.out.println("안녕하세요");
        // System.out.println("안녕하세요");
        // System.out.println("안녕하세요");

        // 반복문 중단 : 강제 중단(break) or 조건 불만족(불만족)
        // 1번) i = 0; -> 초기화(한번만 실행)
        // 2번) i < 5; 조건 검사
        // 3번) loop 안으로 진입 -> 안녕하세요(System.out.println("안녕하세요");) 출력
        // 4번) i++(증감연산자) {i=1} 실행
        // 5번) 조건 검사
        // 6번) loop 안으로 진입 -> 안녕하세요(System.out.println("안녕하세요");) 출력
        // 7번) i++(증감연산자) 실행 {i=2}
        // 8번 ) 5번 ~ 7번 반복
        // ..... i++(증감연산자) 실행 {i=5}
        // 조건검사 5 < 5 => loop 중단
        for (int i = 1; i < 11; i++) {
            System.out.print(i + "   ");
        }
        System.out.println();

        // 10 ~ 1
        for (int i = 10; i > 0; i--) {
            System.out.print(i + "   "); // println : 아래로 / print : 옆으로
        }

        System.out.println();

        // 짝수만 출력 1 ~ 10
        for (int i = 1; i < 11; i++) {
            // i가 짝수이면 출력

            if (i % 2 == 0) {
                System.out.print(i + "   ");
            }

        }

        System.out.println();

        // i += 2 : i = i + 2
        for (int i = 2; i < 11; i += 2) {
            System.out.print(i + "   ");
        }

        int i = 0; // for문 바깥쪽에 초기화 선언 가능 그대신 for 문 안에서는 ; 써주고 조건 입력
        for (int j = 0, k = 0; i < args.length; i++) { // 초기화 선언은 여러개 선언 가능! / 조건(&&, ||, !=)도 여러개 선언 가능
            System.out.println(j + " " + k);
        }

        // for (; ;) { <= 날려도 가능! but 무한루프
        // 여기에서 멈추는 동작을 입력 하면 무한루프 정지 가능
        // }

    }
}
