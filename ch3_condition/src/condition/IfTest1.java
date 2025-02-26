package condition;

// 특정 조건을 만족하면 문장 실행
// if(조건문){} : true만 실행한다 (false는 넘어감)

// 특정 조건을 만족한다면 구문1 실행, 만족하지 않는다면 구문2 실행
// if(조건문){구문1}else{구문2}

public class IfTest1 {
    public static void main(String[] args) {
        int x = 0;

        if (x == 0 ) {
            System.out.println("x==o");
        }
        // 1번째 단계 = true

        if (x !=0) {
            System.out.println("x!= o");
        }
        // 2번째 단계 = false -> 넘어가기

        if (!(x == 0)) {
            System.out.println("!(x == o)");
        }
        // 3번째 단계 = false -> 넘어가기

        if (!(x != 0)) {
            System.out.println("!(x != 0)");
        }
        // 4번째 단계 = flase not -> true


    }
}
