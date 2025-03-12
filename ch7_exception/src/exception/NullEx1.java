package exception;

// NullPointerException = 내 잘못

public class NullEx1 {
    public static void main(String[] args) {

        // String str = null;

        // System.out.println(str.length());

        Account[] accounts = new Account[5];

        // null 확인 후 처리하기 : NullPointerException 피하기
        for (Account account : accounts) {
            if (account != null) {
                System.out.println(account.getAno());
            }
        }

        // if를 사용하지 않는다면 NullPointerException 발생시에 처리 필요 => try ~ catch
        try {
            for (Account account : accounts) {
                System.out.println(account.getAno()); // => .찍고 접근했는데 null => 그 앞이 null(account가 null)
            }
        } catch (NullPointerException e) {
            // e.printStackTrace();
            // System.out.println(e.getMessage());
            System.out.println("입력을 확인해 주세요.");
        }

    }
}
