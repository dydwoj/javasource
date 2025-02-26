package condition;

// 조건문을 만들 때 조건의 갯수를 먼저 계산하고 if 먼저 사용 -> 추가조건 else if -> 마지막에 나머지 남는 조건 else
// if - else if => 위에서부터 내려오다가 조건 값만 나오면 이후는 중단

import java.util.Scanner;

public class IfTest4 {
    public static void main(String[] args) {
        
        // score 점수를 입력받아
        // score >= 90 등급은 A 입니다. => if()
        // score >= 80 등급은 B 입니다 => else if()
        // score >= 70 등급은 C 입니다 => else if()
        // score >= 60 등급은 D 입니다 => else if()
        // score < 60 등급은 F 입니다 => else()
        

        Scanner scanner = new Scanner(System.in);
        System.out.println("점수 입력"); 
        String input = scanner.nextLine();
        int score = Integer.parseInt(input);

        if (score >= 90) {
            System.out.println("등급은 A 입니다");
        }
        else if (score >= 80) {
            System.out.println("등급은 B 입니다");
        }
        else if (score >= 70) {
            System.out.println("등급은 C 입니다");
        }
        else if (score >= 60) {
            System.out.println("등급은 D 입니다");
        }
        else {
            System.out.println("등급은 F 입니다");
        }
        
        scanner.close();

    }
}