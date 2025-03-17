package io;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

// 입력장치에서 읽어오기

public class InputStreamEx2 {
    public static void main(String[] args) {

        InputStream in = System.in;
        OutputStream out = System.out;

        try {
            System.out.print("이름 : ");

            byte[] b = new byte[1024];
            int input = in.read(b);

            // String 객체 생성
            // enter : 두가지 동작으로 이루어짐 => 캐리지리턴 + 라인피드
            String name = new String(b, 0, input - 2); // => -2 한 이유 : Enter 때문에
            System.out.println(name);

            // out.write(input);

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                in.close();
                out.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
