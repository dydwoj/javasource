package condition;

// switch : 조건문(if, if~else) 대체
// switch : 크다 작다의 대소비교 구문은 불가 / == 만 가능
// break(stop) 가 없다면 (ex) int num = 3;)이후에는 전부 실행을 돌린다

public class SwitchTest1 {
    public static void main(String[] args) {

        int num = (int) (Math.random() * 6) + 1;
        //int num = 3;

        switch (num) {
            case 1: // => case 1 == case num(1) 이라면의 의미
                System.out.println("주사위 1번이 나왔습니다");
                break;
            case 2:
                System.out.println("주사위 2번이 나왔습니다");
                break;
            case 3:
                System.out.println("주사위 3번이 나왔습니다");
                break;
            case 4:
                System.out.println("주사위 4번이 나왔습니다");
                break;
            case 5:
                System.out.println("주사위 5번이 나왔습니다");
                break;
            default:
                System.out.println("주사위 6번이 나왔습니다");
                break;
        }
    }
}
