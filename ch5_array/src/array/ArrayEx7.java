package array;

import java.util.Arrays;

public class ArrayEx7 {
    public static void main(String[] args) {

        char abc[] = { 'A', 'B', 'C', 'D' };
        char num[] = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };

        // abc + num 합친 후 하나의 배열 생성
        // 방법 1) char result[] = new char[14];
        char result[] = new char[abc.length + num.length]; // 방법 2)

        // abc 카피
        System.arraycopy(abc, 0, result, 0, abc.length);
        // num 카피
        System.arraycopy(num, 0, result, abc.length, num.length); // 붙여넣기의 시작점을 4로 해도 되지만 abc.length 부터 해도 된다!

        System.out.println(Arrays.toString(result));

    }
}
