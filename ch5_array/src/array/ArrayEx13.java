package array;

/* 2차원 배열
 * 타입[][] 배열명 = new 타입[행][열]
 */

public class ArrayEx13 {
    public static void main(String[] args) {

        // 배열 선언 및 생성
        int arr1[][] = new int[2][2];

        // 기본값(0)을 원하는 값으로 초기화
        arr1[0][0] = 73;
        arr1[0][1] = 83;
        arr1[1][0] = 63;
        arr1[1][1] = 53;

        // 배열 출력
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                System.out.print(arr1[i][j] + "\t");
            }
            System.out.println();
        }
        // for문 하나당 차원 하나 = for문 2개 => 2차원

        // 향상된 for문
        for (int[] tmp : arr1) { // int[] tmp : arr1 = 행 하나 전체를 가져옴
            for (int is2 : tmp) { // int is2 : tmp = 가져온 행에서 하나씩 가져옴
                System.out.print(is2 + "\t");
            }
            System.out.println();
        }

        // 값을 알고 있는 경우
        int arr2[][] = {
                { 100, 100, 100 },
                { 20, 30, 40 }
        };

        // 합계 구하는 법
        int sum = 0;
        for (int[] temp : arr2) {
            for (int is : temp) {
                sum += is;
            }
        }
        System.out.println("합계 : " + sum);

    }
}
