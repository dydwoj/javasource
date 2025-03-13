package api.string;

// 문자열에서 특정 문자의 횟수 구하기

public class StringEx5 {
    public static void main(String[] args) {

        System.out.println("AB 문자열 횟수 : " + count("12345AB12AB345AB", "AB"));
        System.out.println("AB 문자열 횟수 : " + count("12345", "AB"));

    }

    public static int count(String src, String target) {
        // indexOf
        int count = 0, pos = 0;
        while ((pos = src.indexOf(target, pos)) != -1) {
            count++;
            pos += target.length();
        }
        return count;
    }
}
