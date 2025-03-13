package api.util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateEx {
    public static void main(String[] args) {

        Date d = new Date();

        System.out.println(d); // => Thu Mar 13 13:03:21 KST 2025

        /*
         * Date와 짝꿍
         * yyyy : 년도 4자리 표현 | yy 년도 2자리 표현
         * MM : 월 2자리 표현 | 1~9 월 01
         * dd : 일 2자리 표현
         * hh : 시
         * mm : 분
         * ss : 초
         * a : 오전/오후
         */
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        System.out.println(sdf.format(d)); // => 2025-03-13

        sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        System.out.println(sdf.format(d)); // => 2025-03-13 01:10:23

        sdf = new SimpleDateFormat("yyyy-MM-dd a hh:mm:ss");
        System.out.println(sdf.format(d)); // => 2025-03-13 오후 01:11:05

        sdf = new SimpleDateFormat("오늘은 E요일");
        System.out.println(sdf.format(d));

    }
}
