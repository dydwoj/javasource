package array;

public class ArrayEx14 {
    public static void main(String[] args) {

        int score[][] = {
                { 100, 78, 68 },
                { 55, 45, 80 },
                { 37, 45, 40 },
                { 89, 78, 65 },
                { 20, 30, 40 }
        };

        // 과목별 총점
        int kor = 0, eng = 0, math = 0;

        System.out.println("번호 국어 영어 수학 총점 평균");
        System.out.println("=================================");

        for (int i = 0; i < score.length; i++) {
            System.out.printf("%3d", i + 1);

            int sum = 0;
            float avg = 0.0f;

            kor += score[i][0];
            eng += score[i][1];
            math += score[i][2];

            // 개인별 점수 출력
            for (int j = 0; j < score[i].length; j++) {
                sum += score[i][j];
                System.out.printf("%5d", score[i][j]);
            }

            // 개인별 평균 계산후 출력
            avg = sum / (float) score[i].length; // => 행의 갯수
            System.out.printf("%5d %5.1f\n", sum, avg);
        }
        System.out.println("=================================");
        System.out.printf("총점 : %3d %3d %3d", kor, eng, math);

    }
}
