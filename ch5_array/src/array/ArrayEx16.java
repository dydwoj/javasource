package array;

import java.util.Scanner;

// 퀴즈 프로그램 만들기

// Q1. chair(words[0][0])의 뜻은? => (user) 의자 => 정답입니다(words[0][1].equals(user 입력값)).
// Q2. computer(words[1][0])의 뜻은? => (user) 의자 => 틀렸습니다. 정답은 컴퓨터입니다.

public class ArrayEx16 {
    public static void main(String[] args) {

        String words[][] = {
                { "chair", "의자" },
                { "computer", "컴퓨터" },
                { "integer", "정수" }
        };

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < words.length; i++) {
            System.out.printf("Q%d. %s의 뜻은?\n", i + 1, words[i][0]);

            String input = sc.nextLine();

            if (input.equals(words[i][1])) {
                System.out.println("정답입니다");
            } else {
                System.out.printf("틀렸습니다. 정답은 '%s' 입니다.\n", words[i][1]);
            }
        }
        sc.close();

    }
}
