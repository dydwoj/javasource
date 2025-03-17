package io;

import java.io.File;

public class FileEx1 {
    public static void main(String[] args) {

        // File 객체 생성
        File file1 = new File("c:/temp/test1.txt");
        File file2 = new File("c:/temp", "test1.txt");
        System.out.println(file2);

        File dir = new File("c/temp");
        File file3 = new File(dir, "test1.txt");
        System.out.println(file3);

        System.out.println("경로를 제외한 파일명 : " + file1.getName());

        // file.getName() 이용 해서 확장자 제외 => 방법 1) substring
        String fileName = file1.getName();
        System.out.println("확장자를 제외한 파일명 : " + fileName.substring(0, 5)); // => .txt 제외한 test1
        // 방법 2)
        System.out.println("확장자를 제외한 파일명 : " + fileName.substring(0, fileName.lastIndexOf(".")));

        int pos = fileName.lastIndexOf(".");
        System.out.println("확장자 : " + fileName.substring(pos + 1));

        System.out.println("경로를 포함한 파일명 : " + file1.getPath());
        System.out.println("파일의 절대 경로 : " + file1.getAbsolutePath());
        System.out.println("파일의 디렉토리 : " + file1.getParent());
        // :
        System.out.println("File.pathSeparator : " + File.pathSeparator);
        System.out.println("File.pathSeparatorChar : " + File.pathSeparatorChar);
        // \
        String path = "c:\\temp" + File.separator + "test1.txt";
        System.out.println(path);
        System.out.println("File.separator : " + File.separator);
        System.out.println("File.separatorChar : " + File.separatorChar);

    }
}
