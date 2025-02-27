package loop;

// 반복문 (for, while, do ~ while) : 반복적으로 실행해야 하는 코드를 간단하게 처리

// 안녕하세요 10번 출력

public class ForEx1 {
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
        //       조건검사 5 < 5 => loop 중단
        for (int i = 0; i < 5; i++) {
            System.out.println("안녕하세요");
        }

    }
}
