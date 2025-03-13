package api.string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// 배열속에서 특정 위치 찾기

public class StringEx4 {
    public static void main(String[] args) {

        StringEx4 obj = new StringEx4();
        String[] names = { "Queen", "Tod", "Kim", "Lee", "Choi" };

        String result = obj.findKim(names);
        System.out.println(result);

        String result2 = obj.findKim2(names);
        System.out.println(result2);

    }

    public String findKim(String[] seoul) {
        // 반환 : Kim은 3번째에 있다
        int i = 0;
        for (; i < seoul.length; i++) {
            if (seoul[i].equals("Kim")) {
                break;
            }
        }
        return "Kim은 " + (i + 1) + "번째에 있다";
    }

    // 리스트로 찾기
    public String findKim2(String[] seoul) {
        // 반환 : Kim은 3번째에 있다

        // 강사님꺼
        // int i = Arrays.asList(seoul).indexOf("Kim");
        // retur "Kim은 " + (i + 1) + "번째에 있다";

        // 내꺼
        List<String> list = new ArrayList<>(Arrays.asList(seoul));
        return "Kim은 " + (list.indexOf("Kim") + 1) + "번째에 있다";
    }
}
