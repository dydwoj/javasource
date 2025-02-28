package condition;

import java.util.Scanner;

// 점수에 따라 등급 출력

public class StringTest5 {
    public static void main(String[] args) {
        // 점수(0~100) 입력받은 후 접수에 따라 등급 출력
        // 90 이상 = A , 80 이상 = B , 70 이상 = C , 나머지 F

        // 98 % 10 = 9

        Scanner scanner = new Scanner(System.in);
        System.out.println("0~100 점수 입력");
        String input = scanner.nextLine();
        int score = Integer.parseInt(input);

        // score = score % 10;

        switch (score / 10) {
            case 10:
            case 9:
                System.out.println("등급은 A 입니다");
                break;
            case 8:
                System.out.println("등급은 B 입니다");
                break;
            case 7:
                System.out.println("등급은 C 입니다");
                break;
            default:
                System.out.println("등급은 F 입니다");
                break;
        }

        scanner.close();

        // switch (score) {
        // case 90:
        // case 91:
        // case 92:
        // case 93:
        // case 94:
        // case 95:
        // case 96:
        // case 97:
        // case 98:
        // case 99:
        // case 100:
        // System.out.println("등급은 A 입니다");
        // break;
        // case 80:
        // case 81:
        // case 82:
        // case 83:
        // case 84:
        // case 85:
        // case 86:
        // case 87:
        // case 88:
        // case 89:
        // System.out.println("등급은 B 입니다");
        // break;
        // case 70:
        // case 71:
        // case 72:
        // case 73:
        // case 74:
        // case 75:
        // case 76:
        // case 77:
        // case 78:
        // case 79:
        // System.out.println("등급은 C 입니다");
        // break;
        // default:
        // System.out.println("등급은 F 입니다");
        // break;
        // }
    }
}
