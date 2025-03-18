package io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileInputStreamEx4 {
    public static void main(String[] args) {

        int data = 0;
        System.out.println(data);
        byte[] b = new byte[1024];

        try (FileInputStream fis = new FileInputStream("c:/temp/img1.jpg");
                BufferedInputStream bis = new BufferedInputStream(fis);
                FileOutputStream fos = new FileOutputStream("c:/temp/output1.jpg");
                BufferedOutputStream bos = new BufferedOutputStream(fos)) {

            while ((data = fis.read(b)) != -1) {
                fos.write(b);
            }
            bos.flush();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
