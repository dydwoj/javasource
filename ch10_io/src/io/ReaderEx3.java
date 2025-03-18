package io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.Reader;
import java.nio.charset.Charset;

// 우리 파일 받아오기

public class ReaderEx3 {
    public static void main(String[] args) {

        try (Reader reader = new FileReader("./ch10_io/src/io/FileEx1.java", Charset.forName("utf-8"));
                BufferedReader br = new BufferedReader(reader);) {

            String str = "";
            int i = 1;

            while ((str = br.readLine()) != null) {
                System.out.printf("%d %s \n", i++, str);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
