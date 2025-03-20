package stream;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class StreamEx2 {

    static int sum2;

    public static void main(String[] args) {

        Set<String> set = new HashSet<>();
        Stream<String> stream = set.stream();
        stream.forEach(name -> System.out.println(name));

        // 배열 : sort, toString
        String[] strArr = { "홍길동", "신철용", "성춘향" };
        Stream<String> stream2 = Arrays.stream(strArr);
        stream2.forEach(name -> System.out.println(name));

        // 디렉토리
        Path path = Paths.get("c:/temp");

        try (Stream<Path> stream3 = Files.list(path)) {
            stream3.forEach(f -> System.out.println(f.getFileName()));
        } catch (IOException e) {
            e.printStackTrace();
        }

        // 숫자 범위로부터 스트림 얻기
        // 1 ~ 100 합
        int emp = 0;
        for (int i = 1; i < 101; i++) {
            emp += i;
        }
        System.out.println(emp);

        IntStream.range(1, 100).forEach(i -> System.out.print(i + " "));
        IntStream.rangeClosed(1, 100).forEach(i -> sum2 += i);
        System.out.println();
        System.out.println("합계 : " + sum2);

        long result = LongStream.rangeClosed(1, 100).sum();
        System.out.println(result);

    }
}
