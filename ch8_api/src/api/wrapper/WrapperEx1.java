package api.wrapper;

public class WrapperEx1 {
    public static void main(String[] args) {

        Integer i = 10;

        System.out.println("String 숫자 -> int : " + Integer.parseInt("10"));
        System.out.println("int -> String 숫자 : " + i.toString());
        System.out.println("Integer.max(5,8) : " + Integer.max(5, 8));
        System.out.println("Integer.min(5,8) : " + Integer.min(5, 8));

    }
}
