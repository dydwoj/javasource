package io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

// 한바이트씩 읽어오면 한글은 깨졌음!
// 파일 복사의 개념

public class FileInputStreamEx2 {
    public static void main(String[] args) {

        FileInputStream fis = null;
        FileOutputStream fos = null;

        // 한바이트 이용 복사 : 8047ms
        // 배열 이용 복사 : 15ms

        int data = 0;
        System.out.println(data);
        byte[] b = new byte[1024];
        try {
            fis = new FileInputStream("c:/temp/img1.jpg");
            fos = new FileOutputStream("c:/temp/output1.jpg");
            long start = System.currentTimeMillis();
            while ((data = fis.read(b)) != -1) {
                // char ch = (char) data;
                // System.out.print(ch);
                fos.write(b);
            }
            long end = System.currentTimeMillis();
            System.out.println("복사하는데 걸린 시간 : " + (end - start) + " ms");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fis.close();
                fos.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }
}
