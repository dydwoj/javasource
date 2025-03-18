package io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

// 한바이트씩 읽어오면 한글은 깨졌음!
// 파일 복사의 개념

public class FileInputStreamEx1 {
    public static void main(String[] args) {

        FileInputStream fis = null;
        FileOutputStream fos = null;

        int data = 0;
        try {
            fis = new FileInputStream("c:/temp/file1.txt");
            fos = new FileOutputStream("c:/temp/output1.txt");
            while ((data = fis.read()) != -1) {
                char ch = (char) data;
                // System.out.print(ch);
                fos.write(ch);
            }
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
