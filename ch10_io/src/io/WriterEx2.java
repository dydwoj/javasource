package io;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Scanner;

// 키보드에서 입력을 받아들여서 그 내용을 파일에 작성하기
// 사용자가 q 입력하면 입력 중지 그 내용을 파일에 작성
// 방법 2

public class WriterEx2 {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in);
                FileWriter fw = new FileWriter("c:/temp/user.txt");
                BufferedWriter bw = new BufferedWriter(fw)) {

            System.out.println("파일에 작성할 데이터 입력");
            System.out.println("중지하려면 q 입력");

            String data = "";

            do {
                System.out.print(">> ");
                data = sc.nextLine();

                if (!data.equals("q")) {
                    bw.write(data);
                    bw.newLine();
                }

            } while (!data.equals("q"));

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
