package condition;

// case 구문 : A or a = 우수회원 출력해줘~

public class SwitchTest2 {
    public static void main(String[] args) {

        char grade = 'B';

        switch (grade) {
            case 'A':
            case 'a':
                System.out.println("우수회원");
                break;
            case 'B':
            case 'b':
                System.out.println("일반회원");
                break;
            default:
                break;
        }
    }
}
