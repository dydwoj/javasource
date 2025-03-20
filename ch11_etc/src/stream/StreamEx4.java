package stream;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamEx4 {
    public static void main(String[] args) {

        List<String> names = Arrays.asList("홍길동", "신용권", "김자바", "신민철", "홍길동");

        // 중복 제거 후 출력
        // 1) Set 구조
        Set<String> set = new HashSet<>(names);
        System.out.println(set);

        // 2) Stream 사용
        names.stream()
                .distinct()
                .forEach(n -> System.out.println(n));

        // 신씨 성을 가진 사람만 출력
        names.stream()
                .filter(name -> name.startsWith("신"))
                .forEach(n -> System.out.println(n));

        // 중복 제거 후 신씨 성을 가진 사람 출력
        names.stream()
                .distinct()
                .filter(name -> name.startsWith("신"))
                .forEach(n -> System.out.println(n));

        // 대문자로 변견 후 출력
        List<String> fruits = Arrays.asList("apple", "grape", "melon", "watermelon", "banana");

        // 1) for문
        for (String f : fruits) {
            System.out.println(f.toUpperCase());
        }

        // 대문자로 변경 후 새로운 리스트로 생성
        List<String> list1 = new ArrayList<>();
        for (String f : fruits) {
            list1.add(f.toUpperCase());
        }
        System.out.println(list1);

        // Stream 이용
        List<String> list2 = fruits.stream()
                .map((f -> f.toUpperCase()))
                .collect(Collectors.toList());
        System.out.println(list2);

        // Stream 으로 생성
        // IntStream.range(0, 0)
        Stream<File> stream = Stream.of(
                new File("file1.txt"),
                new File("file2.txt"),
                new File("file3"),
                new File("file4.bak"),
                new File("file5.java"));

        // 확장자 출력(중복된 확장자는 제외) - txt, bak, java
        Set<String> extSet = new HashSet<>();
        stream.forEach(f -> {
            // 확장자 추출
            int pos = f.getName().indexOf(".");
            if (pos != -1) {
                String ext = f.getName().substring(pos + 1);
                // 추출된 확장자 담기
                extSet.add(ext);
            }
        });
        System.out.println(extSet);

        // Stream 사용
        stream.map(f -> f.getName()) // => File 객체를 String 으로 이름만 수집 : [file1.txt, file2.txt...]
                .filter(f -> f.indexOf(".") > -1) // => indexOf 로 "." 있는지 필터링 => T만 남음 : file1.txt, file2. txt...
                .map(f -> f.substring(f.lastIndexOf(".") + 1)) // => . 이후 문자들 수집 : txt, txt, bak, jav
                .distinct() // => 중복 제거
                .forEach(f -> System.out.println(f));

    }
}
