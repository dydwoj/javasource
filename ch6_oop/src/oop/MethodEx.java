package oop;

import java.util.Arrays;

public class MethodEx {
    public static void main(String[] args) {

        // Method 인스턴스 생성
        Method method = new Method();

        // 메서드 호출
        int result = method.add(15, 25);
        System.out.println("result = " + result); // => 한번 거쳐하기

        System.out.println("result.1 = " + method.add(45, 55)); // => 바로 호출

        float result2 = method.add2(35, 45.2f);
        System.out.println("result2 = " + result2);

        method.print("홍길동", "s123"); // 호출만 하고 끝(변수에 담을 수 없음) => 즉, 'String name =' 같이 못 씀

        // int형 배열 하나 만들어서 메소드 만들기
        int arr[] = { 1, 2, 3 };
        int arr2[] = method.arr(arr);
        System.out.println(Arrays.toString(arr2));

    }
}
