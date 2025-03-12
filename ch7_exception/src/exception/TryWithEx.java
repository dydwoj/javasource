package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TryWithEx {
    public static void main(String[] args) {

        FileInputStream fis = null;

        // 리소스 열기 닫기 방법 1)
        // file.txt와 자바 프로그램의 통로를 여는 개념
        try {
            fis = new FileInputStream("file.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally { // => file.txt와 자바 프로그램의 통로를 닫는 개념
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        // 리소스 열기 닫기 방법 2)
        // try-with-resources : 자동 리소스 닫기 => try (){} catch{} : 보통은 try (){} catch{}
        try (FileInputStream fis2 = new FileInputStream("file.txt")) {

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
