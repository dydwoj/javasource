package thread;

public class BigLetters {
    public static void main(String[] args) {

        // Thread thread = new Thread(new SmallLetters());

        // 익명구현객체 - 인터페이스, 추상클래스 : 구현객체를 무조건 생성한 후 사용
        Thread t3 = new Thread(new Runnable() {

            @Override
            public void run() {
                // 소문자 출력
                for (char ch = 'a'; ch <= 'z'; ch++) {
                    System.out.print(ch + "\t");
                }
            }

        });
        t3.start();

        // 람다식
        Runnable r = () -> {
            for (char ch = 'a'; ch <= 'z'; ch++) {
                System.out.print(ch + "\t");
            }
        };
        Thread t4 = new Thread(r);
        t4.start();

        //
        // 단순 쓰레드를 이용한 구현문
        //
        Thread t1 = new SmallLetters2();
        System.out.println("쓰레드 t1 name : " + t1.getName());
        t1.start(); // => 대기상태

        Thread t2 = new NumPrint();
        System.out.println("쓰레드 t2 name : " + t2.getName());
        t2.start();

        // 메인 쓰레드명
        Thread mainThread = Thread.currentThread();
        System.out.println("쓰레드 main name : " + mainThread.getName());

        // 대문자 출력
        for (char ch = 'A'; ch <= 'Z'; ch++) {
            System.out.print(ch + "\t");
        }

    }
}
