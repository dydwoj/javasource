package io;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

// 입력장치에서 읽어오기

public class InputStreamEx1 {
    public static void main(String[] args) {

        InputStream in = System.in;
        OutputStream out = System.out;

        try {
            // int input = in.read(); // => abc 작성
            // out.write(input); // => a 만 출력
            // int input = 0;
            // while ((input = in.read()) != -1) {
            // out.write(input);
            // }

            byte[] b = new byte[1024];
            while ((in.read(b)) != -1) {
                out.write(b);
            }

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
