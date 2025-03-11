package shop;

import java.util.Scanner;

public class MyShop implements IShop {

    private String title;
    // 고객 5명 담기
    private User[] users = new User[5];
    // 제품 10개 담기
    Product[] products = new Product[10];
    // cart (제품 저장 가능한 배열)
    Product[] cart = new Product[10];

    Scanner sc = new Scanner(System.in);

    // 선택된 user 값 보관
    private String selUser;

    @Override
    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public void genUser() {
        // 2명 생성하기
        users[0] = new User("홍길동", PayType.CARD);
        users[1] = new User("성춘향", PayType.CASH);
    }

    @Override
    public void genProduct() {
        products[0] = new Tv("삼성 QLED", 5000000, "4K");
        products[1] = new Tv("LG 올레드", 6500000, "4K");
        products[2] = new CellPhone("갤럭시 S24+", 1100000, "SKT");
        products[3] = new CellPhone("아이폰 14pro max", 1550000, "KT");
        products[4] = new CellPhone("아이폰 12pro", 1400000, "U+");
    }

    @Override
    public void start() {
        System.out.println(title + " : 메인화면 - 계정선택");
        System.out.println("===================================");
        int i = 0;
        for (User user : users) {
            if (user != null) {
                System.out.printf("[%d] %s %s\n", i++, user.getName(), user.getPayType());
            }
        }
        System.out.println("[x] 종료");
        System.out.println("===================================");
        System.out.print("선택 : ");

        String input = sc.nextLine();
        switch (input) {
            case "x":
            case "X":
                System.exit(0);
                break;
            case "0":
                selUser = input;
                productList();
                break;
            case "1":
                selUser = input;
                productList();
                break;
            default:
                System.out.println("입력을 확인해 주세요");
                start();
                break;
        }

    }

    public void productList() {
        System.out.println(title + " : 상품목록 - 상품선택");
        System.out.println("===================================");
        int i = 0;
        for (Product product : products) {
            if (product != null) {
                System.out.printf("[%d]", i++);
                product.printDetail();
            }
        }
        System.out.println("[h] 메인화면");
        System.out.println("[c] 체크아웃");
        System.out.println("===================================");
        System.out.print("선택 : ");

        String input = sc.nextLine();
        switch (input) {
            case "h":
            case "H":
                start();
                break;
            case "c":
            case "C":
                checkout();
                break;
            case "0":
            case "1":
            case "2":
            case "3":
            case "4":
                for (int k = 0; k < cart.length; k++) {
                    if (cart[k] == null) {
                        cart[k] = products[Integer.parseInt(input)];
                        break;
                    }
                }
                System.out.println("상품이 담겼습니다.");
                productList();
                break;
            default:
                System.out.println("입력을 확인해 주세요");
                productList();
                break;
        }
    }

    public void checkout() {
        System.out.printf("%s : %s - 체크아웃\n", title, users[Integer.parseInt(selUser)].getName());
        System.out.println("===================================");
        int i = 0, sum = 0;
        for (Product product : cart) {
            if (product != null) {
                System.out.printf("[%d] %s (%d)\n", i++ + 1, product.getPname(), product.getPrice());
                sum += product.getPrice();
            }
        }
        System.out.println("결제방법 : " + users[Integer.parseInt(selUser)].getPayType());
        System.out.println("합계 : " + sum);
        System.out.println("===================================");
        System.out.println("[p] 이전");
        System.out.println("[q] 종료");
        System.out.print("선택 : ");
        String input = sc.nextLine();
        switch (input) {
            case "p":
            case "P":
                productList();
                break;
            case "q":
            case "Q":
                System.out.println("감사합니다.");
                System.exit(0);
                break;
            default:
                break;
        }
    }

}
