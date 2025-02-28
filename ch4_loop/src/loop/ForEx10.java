package loop;

// 반복은 5
// 공백은 b 별은 j
// 공백과 별의 합은 5
// 시작은 1

public class ForEx10 {
    public static void main(String[] args) {

        // 강사님이 하려는 코드
        for (int j = 5; j > 0; j--) {
            if (j > 1) {
                System.out.print(" ");
            } else {
                System.out.print("*");
            }
        }
        System.out.println();
        for (int j = 5; j > 0; j--) {
            if (j > 2) {
                System.out.print(" ");
            } else {
                System.out.print("*");
            }
        }
        System.out.println();
        for (int j = 5; j > 0; j--) {
            if (j > 3) {
                System.out.print(" ");
            } else {
                System.out.print("*");
            }
        }
        System.out.println();
        for (int j = 5; j > 0; j--) {
            if (j > 4) {
                System.out.print(" ");
            } else {
                System.out.print("*");
            }
        }
        System.out.println();
        for (int j = 5; j > 0; j--) {
            if (j > 5) {
                System.out.print(" ");
            } else {
                System.out.print("*");
            }
        }
        System.out.println("\n\n");

        // 강사님 코드
        for (int i = 0; i < 6; i++) {
            for (int j = 5; j > 0; j--) {
                // if (j > i) {
                // System.out.print(" ");
                // } else { => if문을 이용한 별찍기
                // System.out.print("*");
                // }
                System.out.print(j > i ? " " : "*"); // => 삼항연산자를 이용한 별찍기
            }
            System.out.println();
        }
        System.out.println("\n");

        // 내가 짠 코드

        for (int i = 1; i < 6; i++) {
            for (int j = 5; j > i; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
