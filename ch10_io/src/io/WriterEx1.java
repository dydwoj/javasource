package io;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Scanner;

// 키보드에서 입력을 받아들여서 그 내용을 파일에 작성하기
// 사용자가 q 입력하면 입력 중지 그 내용을 파일에 작성
// 방법 1

public class WriterEx1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("파일에 작성할 데이터 입력");
        System.out.println("중지하려면 q 입력");

        String data = "";
        String result = "";
        do {
            System.out.print(">> ");
            data = sc.nextLine();
            result += data;
        } while (!data.equals("q"));

        try (FileWriter fw = new FileWriter("c:/temp/user.txt");
                BufferedWriter bw = new BufferedWriter(fw)) {
            bw.write(result);
        } catch (Exception e) {
            e.printStackTrace();
        }

        sc.close();

    }
}
