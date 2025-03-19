package lambda;

public class Lambda1 {

    // 기본 메서드
    int max(int a, int b) {
        return a > b ? a : b;
    }

    // 람다식 변형
    // (a, b) -> a > b ? a : b;

    // 기본 메서드
    void print(String name, int i) {
        System.out.println(name + i);
    }

    // 람다식 변형
    // (name, i) -> System.out.println(name + i);

    // 기본 메서드
    int sumArr(int[] arr) {
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        return sum;
    }

    // 람다식 변형
    // (int[] arr) -> {
    // int sum = 0;
    // for (int i : arr) {
    // sum += i;
    // }
    // return sum;
    // }

}
