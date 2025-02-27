package condition;

import java.util.Scanner;

// 가위(1)바위(2)보(3) 게임

public class SwitchTest4 {
    public static void main(String[] args) {
        

        // 컴퓨터가 낸 가위, 바위, 보 결정(무작위)
        int computer = (int)(Math.random() * 3) + 1;

        // 사용자가 낸 가위, 바위, 보 결정(입력받기)
        Scanner scanner = new Scanner(System.in);
        System.out.println("가위(1), 바위(2), 보(3) 중에서 하나 입력");
        String input = scanner.nextLine();
        int user = Integer.parseInt(input);
        
        // 2(바위) - 1(가위) = 1 => 컴퓨터가 이겼음
        // 컴퓨터가 이김 or 유저가 이김 or 비겼습니다

        switch (user - computer) {
            case 2:
            case -1:
                System.out.println("컴퓨터가 이겼습니다");
                break;
            case 1:
            case -2:
                System.out.println("유저가 이겼습니다");
                break;
            case 0:
                System.out.println("비겼습니다");
                break;
            
        }

    }
}
