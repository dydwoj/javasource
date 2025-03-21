package array;

// 가변배열 : 열의 길이가 움직인다 (열의 길이를 유동적으로 처리)

public class ArrayEx15 {
    public static void main(String[] args) {

        int score[][] = new int[3][]; // => 행은 고정, 열만 유동적

        // 행마다 다른 길이 지정
        score[0] = new int[4];
        score[1] = new int[2];
        score[2] = new int[3];

        score[0][0] = 75;

        int score2[][] = {
                { 78, 99, 25, 35 },
                { 12, 15 },
                { 35, 65, 75 }
        };

        // 내용 확인
        for (int i = 0; i < score2.length; i++) {
            for (int j = 0; j < score2[i].length; j++) {
                System.out.print(score2[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
