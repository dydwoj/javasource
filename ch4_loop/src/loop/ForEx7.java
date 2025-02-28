package loop;

// 중첩 for (행과 열의 구조)

// **********
// **********
// **********
// **********
// **********

public class ForEx7 {
    public static void main(String[] args) {

        // 한줄로 별 10개 찍기
        // for (int i = 1; i <= 10; i++) {
        // System.out.print("*");
        // }
        // System.out.println();
        // for (int i = 1; i <= 10; i++) {
        // System.out.print("*");
        // }
        // System.out.println();
        // for (int i = 1; i <= 10; i++) {
        // System.out.print("*");
        // }
        // System.out.println();
        // for (int i = 1; i <= 10; i++) {
        // System.out.print("*");
        // }
        // System.out.println();
        // for (int i = 1; i <= 10; i++) {
        // System.out.print("*");
        // }
        // System.out.println();
        // => 반복 되는 거 묶기

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(j + "\t");
            }
            System.out.println();
        }
    }
}
