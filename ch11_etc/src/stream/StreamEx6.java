package stream;

import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class StreamEx6 {
    public static void main(String[] args) {

        IntStream stream = IntStream.rangeClosed(1, 10);

        // 2의 배수 갯수 세기
        long cnt = stream.filter(i -> i % 2 == 0).count();
        System.out.println("2의 배수의 개수 : " + cnt);

        // 2의 배수의 합
        stream = IntStream.rangeClosed(1, 10);
        int sum = stream.filter(i -> i % 2 == 0).sum();
        System.out.println("2의 배수의 합 : " + sum);

        // 2의 배수의 평균
        stream = IntStream.rangeClosed(1, 10);
        OptionalDouble d = stream.filter(i -> i % 2 == 0).average();
        System.out.println("2의 배수의 평균 : " + d);

        // 2의 배수의 최대값
        stream = IntStream.rangeClosed(1, 10);
        OptionalInt max = stream.filter(i -> i % 2 == 0).max();
        System.out.println("2의 배수의 최대값 : " + max);

        // 2의 배수의 최소값
        stream = IntStream.rangeClosed(1, 10);
        OptionalInt min = stream.filter(i -> i % 2 == 0).min();
        System.out.println("2의 배수의 최소값 : " + min);

    }
}
