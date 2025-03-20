package stream;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class StreamEx1 {
    public static void main(String[] args) {

        List<String> list = Arrays.asList("홍길동", "성춘향", "김가비");

        // 리스트 뽑기
        // 방법 1. foreach
        // 방법 2. Iterator
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            String str = iterator.next();
            System.out.print(str + "\t");
        }
        System.out.println();

        // 방법 3. Stream
        Stream<String> stream = list.stream();

        // Consumer<String> action
        // forEach(Consumer<? super String> action) : void
        stream.forEach(s -> System.out.println(s));
        // stream has already been operated
        stream = list.stream();
        stream.forEach(s -> System.out.println(s));

        // Student 클래스
        List<Student> students = Arrays.asList(
                new Student("홍길동", 90),
                new Student("신철용", 75));

        // 생성후 소비
        Stream<Student> stream2 = students.stream();
        stream2.forEach(student -> {
            String name = student.getName();
            int math = student.getMath();
            System.out.println(name + " : " + math);
        });

        // 생성하면서 소비
        students.stream()
                .forEach(stu -> System.out.println(stu));

    }
}
