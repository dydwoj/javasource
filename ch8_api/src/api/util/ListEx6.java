package api.util;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

// 한 어린이의 키를 2015~2024년 사이에 1년 단위로 입력받기
// 입력받은 데이터는 ArrayList에 저장
// 가장 키가 많이 자란 연도 출력
// 입력 예시 : 120 122 125 130 139 160 169 173 175 176
// 토크나이저 해서 자르고 하기 or 배열로 split하고 리스트로 변환
public class ListEx6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("10년 동안의 키를 입력 >> ");
        String input = sc.nextLine();

        List<Integer> list = new ArrayList<>();

        // 입력 받은거 잘라서 리스트에 담기
        StringTokenizer tokenizer = new StringTokenizer(input);
        while (tokenizer.hasMoreTokens()) {
            list.add(Integer.parseInt(tokenizer.nextToken()));
        }

        // 가장 많이 키가 큰 년도와 cm 출력
        int diff = 0, pos = 0;
        for (int i = 0; i < list.size() - 1; i++) {
            int sub = list.get(i + 1) - list.get(i);
            if (diff < sub) {
                diff = sub;
                pos = i;
            }
        }

        System.out.println("가장 키가 많이 자란 년도 : " + (pos + 2015) + "년, 자란 키는 : " + diff + "cm");

        sc.close();

    }
}
