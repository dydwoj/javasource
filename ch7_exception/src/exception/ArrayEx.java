package exception;

public class ArrayEx {
    public static void main(String[] args) {

        int[] arr = new int[2];

        // System.out.println(arr[3]);
        // => ArrayIndexOutOfBoundsException : Index 3 out of bounds for length 2

        // try {
        // System.out.println(arr[0]); // => ArrayIndexOutOfBoundsException
        // int num = 100 / 0; // => ArithmeticException
        // } catch (ArrayIndexOutOfBoundsException e) {
        // System.out.println("배열 인덱스를 확인해 주세요."); // => 여기가 에러면 멈춤 => 통과면 다음 catch 확인
        // } catch (ArithmeticException e) {
        // System.out.println("0으로 나눌 수 없습니다.");
        // }
        try {
            System.out.println(arr[0]);
            // int num = 100 / 0;
        } catch (Exception e) {
            System.out.println("오류 발생");
        }

        try {
            System.out.println(arr[0]);
            // int num = 100 / 0;
        } catch (ArrayIndexOutOfBoundsException | ArithmeticException e) { // => 멀티 캐치 블럭 (or : |) 사용
            System.out.println("오류 발생");
        }

    }
}
