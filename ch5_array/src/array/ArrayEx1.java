package array;

/*  Array(배열) : 같은 타입의 여러 변수를 하나의 묶음으로 다루는 개념 (다른 공간(heap)을 사용 && 기본적인 공간(stack))
    만들어 놓은 공간속의 하나의 값마다 방 번호(index)가 있음 (0번 ~) => 그리고 각 방은 기본적으로 '0'이 들어있음
    배열의 크기는 변경이 불가능! => 변경을 위해서는 새로 만들어서 기존의 배열을 옮기고 추가/제거 해야 함!

    배열값 알 경우 : int[] 배열명 = { 배열 길이에 맞는 수들 입력 };
    배열길이만 알고 각 방에 넣을 경우 : for 사용 (스캐너 해서 각 방마다 넣어주기)
*/

// 학생 100명의 점수를 입력 => 100명의 점수 -> Array로 묶음

public class ArrayEx1 {
    public static void main(String[] args) {

        // int[] grade = new int[100]; => 배열 선언, 생성 : grade의 공간을 잡는 개념

        int[] scores = new int[5];

        for (int i = 0; i < scores.length; i++) {
            System.out.println(scores[i]);
        }

        int[] scores2 = { 85, 65, 95, 74, 100 }; // 점수를 알고 있을 경우 바로 = {}
        // 세번째 학생 점수 출력
        System.out.println("세번째 학생 : " + scores2[2]);
        // 배열길이 확인
        System.out.println("배열길이 : " + scores2.length);

        // 다섯번째 학생 점수 수정
        scores2[4] = 98;
        System.out.println("다섯번째 학생 : " + scores2[4]);

        System.out.println(scores2[5]); // => ArrayIndexOutOfBoundsException(index 번호가 없다는 오류)

    }
}
