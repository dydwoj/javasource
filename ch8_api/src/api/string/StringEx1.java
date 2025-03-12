package api.string;

public class StringEx1 {
    public static void main(String[] args) {

        String str1 = new String("안녕하세요");
        String str4 = new String("안녕하세요");
        // => new를 하면 새로운 heap에 새로운 인스턴스 생성시키므로 주소가 다름

        String str2 = "안녕하세요";
        String str3 = "안녕하세요";
        // => str3은 str2의 주소에 가서 확인 => 동일한 거 있음 => 그대로 다시 str2꺼 사용

        char[] charr = { 'H', 'E', 'L', 'L', 'O', };
        String str5 = new String(charr);
        System.out.println("str5 : " + str5);

        System.out.println(str1 == str4); // => false
        System.out.println(str2 == str3); // => true

        // 문자열 비교 : equals()
        System.out.println(str1.equals(str4));
        System.out.println(str2.equals(str3));

        // 빈 문자열
        str1 = "";
        System.out.println(str1.length());
        str2 = null;
        // System.out.println(str2.length()); => NullPointerException

    }
}
