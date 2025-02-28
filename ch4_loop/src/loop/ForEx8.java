package loop;

// *
// **
// ***
// ****
// *****    

// for문은 반복되는 거 찾고 무슨 조건값이 달라지는지 고민해보기

public class ForEx8 {
    public static void main(String[] args) {

        // for (int i = 1; i <= 1; i++) {
        // System.out.print("*");
        // }
        // System.out.println();
        // for (int i = 1; i <= 2; i++) {
        // System.out.print("*");
        // }
        // System.out.println();
        // for (int i = 1; i <= 3; i++) {
        // System.out.print("*");
        // }
        // System.out.println();
        // for (int i = 1; i <= 4; i++) {
        // System.out.print("*");
        // }
        // System.out.println();
        // for (int i = 1; i <= 5; i++) {
        // System.out.print("*");
        // }
        // System.out.println();

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) { // i가 값이 1 ~5 까지 바뀌니까
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
