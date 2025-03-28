package member;

import java.util.List;
import java.util.Scanner;

public class MemberMain {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        MemberDAO mDao = new MemberDAO();
        MemberDTO mDto = null;
        ConsoleUtil util = new ConsoleUtil();

        boolean run = true;
        while (run) {

            System.out.println("==================== Member ==================");
            System.out.println("1. member 추가");
            System.out.println("2. member 수정");
            System.out.println("3. member 삭제");
            System.out.println("4. member 조회");
            System.out.println("5. member 전체조회");
            System.out.println("6. 프로그램 종료");
            System.out.println("==============================================");
            System.out.print("메뉴 선택 >> ");

            int menu = Integer.parseInt(sc.nextLine());

            switch (menu) {
                case 1:
                    MemberDTO dto = util.memberInsertInfo(sc);
                    int result = mDao.insert(dto);
                    util.printSuccessMessage(result);
                    break;
                case 2:
                    mDto = util.memberUpdateMenu(sc);
                    if (mDto != null) {
                        result = mDao.update(mDto);
                        util.printUpdateSuccessMessage(result, mDto.getId());
                    }
                    break;
                case 3:
                    String id = util.memberDeleteInfo(sc);
                    result = mDao.delete(id);
                    // 삭제 성공 메세지 출력 메서도 호출
                    util.printDeleteSuccessMessage(result, id);
                    break;
                case 4:
                    String input = util.memberGetInfo(sc);
                    // input.matches(regex)
                    if (input.matches("^[Aa-z].*")) {
                        MemberDTO row = mDao.getRow(input);
                        if (row != null) {
                            util.memberPrint(row);
                        }
                    } else {
                        List<MemberDTO> list = mDao.getNameList(input);
                        if (!list.isEmpty()) {
                            util.memberSelectPrint(list);
                        }
                    }
                    // 아이디는 영어로 시작 => getRow()

                    // 이름은 한글로 시작 => getNameList
                    // 출력 메서드
                    break;
                case 5:
                    List<MemberDTO> list = mDao.getlist();
                    util.memberAllPrint(list);
                    break;
                case 6:
                    System.out.println("프로그램을 종료합니다");
                    run = false;
                    break;
                default:
                    break;
            }
        }

        sc.close();
    }
}
