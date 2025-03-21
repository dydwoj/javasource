package stream;

import java.io.File;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamEX5 {
    public static void main(String[] args) {

        // peek() 이용
        List<String> fruits = Arrays.asList("apple", "grape", "melon", "watermelon", "banana");

        Stream<String> stream = fruits.stream();
        stream.map(s -> s.toUpperCase())
                .peek(s -> System.out.println("확인 : " + s))
                .forEach(s -> System.out.println(s));

        // 메서드 참조 방식
        fruits.stream().map(String::toUpperCase).forEach(System.out::println);

        Stream<File> stream2 = Stream.of(
                new File("file1.txt"),
                new File("file2.txt"),
                new File("file3"),
                new File("file4.bak"),
                new File("file5.java"));

        stream2.map(f -> f.getName()) // => File 객체를 String 으로 이름만 수집 : [file1.txt, file2.txt...]
                .peek(f -> System.out.print(f + " "))
                .filter(f -> f.indexOf(".") > -1) // => indexOf 로 "." 있는지 필터링 => T만 남음 : file1.txt, file2. txt...
                .peek(f -> System.out.print(f + " "))
                .map(f -> f.substring(f.lastIndexOf(".") + 1)) // => . 이후 문자들 수집 : txt, txt, bak, jav
                .distinct() // => 중복 제거
                .forEach(f -> System.out.println(f));

        // skip(), limit()
        // "apple", "grape", "melon", "watermelon", "banana"
        fruits.stream()
                .skip(2) // => 2개 건너뛰기
                .limit(2) // => 2개까지만 사용
                .forEach(s -> System.out.println(s));

        System.out.println();
        // forEach 출력 하는 2번째 방법
        fruits.stream().skip(2).limit(2).forEach(System.out::print);

        // 스트림 연결
        String[] arr1 = { "123", "456", "789" };
        String[] arr2 = { "abc", "def", "hij" };

        // 배열 => 스트림
        // Arrays.stream(arr1);
        Stream<String> stream3 = Stream.of(arr1);
        Stream<String> stream4 = Stream.of(arr2);

        Stream<String> newStream = Stream.concat(stream3, stream4);
        newStream.forEach(System.out::println);

    }
}
