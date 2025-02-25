package op;

// 증감연산자 : +1, -1 => 간단하게 처리하는 방법
// ++, -- 로 표현 : 변수 앞(전위), 변수 뒤(후위)
// 전위, 후위든 단독으로 사용되는 경우는 결과가 동일하다
// 다른 수식에 포함되거나, 매서드의 매개변수에 사용되는 경우 (ex. print 처럼 다른 것과 함께 쓰일 때) 단독 사용과는 달리 결과가 다르다

public class IncDecOperEx1 {
    public static void main(String[] args) {
        int num = 10;

        //num = num + 1; => 간단하게 표현 = num++;
        //num++; => 이 값은 11이 나옴
        ++num;
        System.out.println("num = "+num);

        //num = num - 1; => 간단하게 표현 = num--;
        //num--; => 이 값은 10이 나옴
        --num;
        System.out.println("num = "+num);

        int num2 = 20;
        //System.out.println("num2 = " + (num2++)); => 이 값은 20이 나옴 / 즉 안 바뀜 -> why?
        // ++num2
        // ① num2+1 을 먼저 한 후 사용 (전위니까 +1을 먼저 하고 조건 값)
        // num2++
        // ① num2 를 먼저 쓰고 그 후에 + 1을 함 (후위니까 조건 값 이후에 +1)
        System.out.println("num2 = " + (++num2));
    }
}
