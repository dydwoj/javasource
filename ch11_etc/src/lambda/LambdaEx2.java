package lambda;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.Function;
import java.util.function.IntSupplier;
import java.util.function.ObjDoubleConsumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class LambdaEx2 {
    public static void main(String[] args) {

        // 숫자를 전달인자로 받아 출력하기
        Consumer<Integer> consumer = System.out::println;
        consumer.accept(50);

        // 문자를 전달인자로 받아 출력하기
        Consumer<String> consumer2 = (str) -> System.out.println(str);
        consumer2.accept("안녕하세요");

        BiConsumer<String, String> biConsumer = (t, u) -> System.out.println(t + 6);
        biConsumer.accept("Hello", "World");

        DoubleConsumer doubleConsumer = (d) -> System.out.println(d);
        doubleConsumer.accept(15.5);

        // LongConsumer, IntConsumer

        ObjDoubleConsumer<String> objDoubleConsumer = (t, value) -> System.out.println(t + "" + value);
        objDoubleConsumer.accept("안녕하세요", 8.7);

        // Math.random() : 1 ~ 6 리턴
        Supplier<Integer> supplier = () -> (int) (Math.random() * 6) + 1;
        System.out.println(supplier.get());

        IntSupplier intSupplier = () -> (int) (Math.random() * 6) + 1;
        System.out.println(intSupplier.getAsInt());

        // 전달인자로 받은 문자열의 길이가 0인지 테스트한 후 0인 경우 빈문자열입니다 출력
        Predicate<String> predicate = (str) -> str.length() == 0;
        if (predicate.test(""))
            System.out.println("빈 문자열 입니다");

        // 전달인자로 받은 숫자가 짝수인지 테스트한 후 짝수라면 짝수, 아닌경우 홀수
        Predicate<Integer> predicate2 = (num) -> num / 2 == 0;
        if (predicate2.test(5)) {
            System.out.println("짝수 입니다");
        } else {
            System.out.println("홀수 입니다");
        }

        // 숫자를 문자로 반환
        Function<Integer, String> f = (i) -> String.valueOf(i);
        System.out.println(f.apply(65));

        // 사칙연산
        BiFunction<Integer, Integer, Integer> f2 = (x, y) -> x + y;
        System.out.println(f2.apply(15, 35));
        f2 = (x, y) -> x * y;
        System.out.println(f2.apply(5, 4));
        f2 = (x, y) -> x - y;
        System.out.println(f2.apply(5, 4));

    }
}
