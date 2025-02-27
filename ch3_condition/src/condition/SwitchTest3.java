package condition;

// case 구문 : A or a = 우수회원 출력해줘~

public class SwitchTest3 {
    public static void main(String[] args) {

        String position = "과장";

        switch (position) {
            case "부장":
                System.out.println("700만원");
                break;
            case "과장":
                System.out.println("500만원");
                break;
            default:
                System.out.println("300만원");
                break;
        }
    }
}
