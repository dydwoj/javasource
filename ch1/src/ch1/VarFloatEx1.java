package ch1;

public class VarFloatEx1 {
    public static void main(String[] args) {
        // 실수형 : float, double
        // 소수점 형태의 숫자를 사용하면 무조건 double로 인식함
        // float(4byte) = double(8byte) => 이거 자체는  X
        // float 타입은 f, F를 붙임
        float score1 = 90.14f;
        // double 타입도 d, D를 붙임
        double score2 = 98.5d;
        System.out.println("score1 = "+score1);
        System.out.println("score2 = "+score2);
        // %와 f 사이에 소수점 자리수 지정 가능
        System.out.printf("score2 = %.2f\n",score2);
    }
}
