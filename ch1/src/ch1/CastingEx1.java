package ch1;

//형변환(Casting)
//변수 또는 상수의 타입을 다른 타입으로 변환하는 것
// char -> int or int -> char or float -> int or int -> float
// 작은 타입에서 큰 타입으로 형변환은 허용
// 큰 타입에서 작은 타입으로의 형변환은 손실이 발생할 수 있기 때문에 강제 형변환을 함 = Casting
// float와 double은 손실이 확실히 일어나기 때문에 주의
public class CastingEx1 {
    public static void main(String[] args) {
        double d = 85.4;
        System.out.println("d = " + d);
        int score = (int) d;
        System.out.println("score = " + score);

        int intValue = 10;
        double dblValue = 5.5;

        // int + double 하면 타입은 => double (why? : 더 큰 바이트로 감)
        int result = intValue + (int) dblValue;
        System.out.printf("result = %d\n", result);

        float f1 = 9.1234567f;
        double d1 = 9.1234567;

        // 작은 타입은 큰 타입으로 알아서 형변환
        double d2 = f1;

        double result2 = d1 + f1;
        // 이건 큰타입으로 담는 거라 상관없음
        float Myresult1 = (float) d1 + f1;
        System.out.println((float) d1 + f1);
        // 이건 double을 강제로 float로 형변환

        int num = 97;
        char ch1 = (char) num;
        System.out.println(ch1);

        System.out.println(result2 + Myresult1 + d2);
    }
}
