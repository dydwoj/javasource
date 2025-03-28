package member;

import java.util.List;
import java.util.Scanner;

public class ConsoleUtil {

    public MemberDTO memberInsertInfo(Scanner sc) {
        System.out.println();
        MemberDTO memberDTO = new MemberDTO();
        System.out.println("======== 회원정보입력 ========");
        System.out.print("아이디 >> ");
        memberDTO.setId(sc.nextLine());
        System.out.print("이름 >> ");
        memberDTO.setName(sc.nextLine());
        System.out.print("주소 >> ");
        memberDTO.setAddr(sc.nextLine());
        System.out.print("이메일 >> ");
        memberDTO.setEmail(sc.nextLine());
        System.out.print("나이 >> ");
        memberDTO.setAge(Integer.parseInt(sc.nextLine()));

        return memberDTO;
    }

    // 입력 성공시 출력 메서드
    public void printSuccessMessage(int result) {
        // result 값에 따라 입력 성공 / 실패 출력
        if (result > 0) {
            System.out.println("입력 성공");
        } else {
            System.out.println("입력 실패");
        }
    }

    // 업데이트 성공시 출력 메서드
    public void printUpdateSuccessMessage(int result, String id) {
        // result 값에 따라 입력 성공 / 실패 출력
        System.out.println(result > 0 ? id + "님의 정보를 수정하였습니다." : id + "님의 정보 수정에 실패하였습니다.");
    }

    // 삭제 성공시 출력 메서드
    public void printDeleteSuccessMessage(int result, String id) {
        // result 값에 따라 입력 성공 / 실패 출력
        System.out.println(result > 0 ? id + "님의 회원 정보를 삭제했습니다." : id + "님의 회원 정보 삭제에 실패하였습니다.");
    }

    // 조회 출력 메서드
    public void memberPrint(MemberDTO dto) {
        // DTO 출력
        if (dto != null) {
            System.out.println("======== 조회한 회원 정보 ========");
            System.out.println("번호 : " + dto.getNo());
            System.out.println("아이디 : " + dto.getId());
            System.out.println("이름 : " + dto.getName());
            System.out.println("주소 : " + dto.getAddr());
            System.out.println("이메일 : " + dto.getEmail());
            System.out.println("나이 : " + dto.getAge());
            System.out.println("=================================");
        } else {
            System.out.println("회원 정보가 일치하지 않습니다.");
        }
    }

    public MemberDTO memberUpdateMenu(Scanner sc) {
        System.out.println("======== 회원 정보 수정 ========");
        System.out.println("1. 주소 수정");
        System.out.println("2. 이메일 수정");
        System.out.println("===============================");
        System.out.print("번호 >> ");
        int no = Integer.parseInt(sc.nextLine());
        // no == 1 : memberUpdateAddr 호출
        // no == 2 : memberUpdateEmail 호출
        if (no == 1) {
            return memberUpdateAddr(sc);
        } else if (no == 2) {
            return memberUpdateEmail(sc);
        }
        // 리턴받은 DTO를 리턴
        return null;
    }

    public MemberDTO memberUpdateAddr(Scanner sc) {
        // 수정할 값 입력(id, 변경할 addr) => DTO 에 담은 후 리턴
        MemberDTO mDto = new MemberDTO();
        System.out.println("======= 수정 정보 입력 =======");
        System.out.print("아이디 >>");
        mDto.setId(sc.nextLine());
        System.out.print("변경할 주소 입력 >> ");
        mDto.setAddr(sc.nextLine());
        return mDto;
    }

    public MemberDTO memberUpdateEmail(Scanner sc) {
        // 수정할 값 입력(id, 변경할 email) => DTO 에 담은 후 리턴
        MemberDTO mDto = new MemberDTO();
        System.out.println("======= 수정 정보 입력 =======");
        System.out.print("아이디 >>");
        mDto.setId(sc.nextLine());
        System.out.print("변경할 이메일 입력 >> ");
        mDto.setEmail(sc.nextLine());
        return mDto;
    }

    public String memberDeleteInfo(Scanner sc) {
        // MemberDTO mDto = new MemberDTO();
        System.out.println("======= 회원 삭제 =======");
        // 삭제할 회원 아이디 입력
        System.out.print("아이디 >> ");
        // mDto.setId(sc.nextLine());
        String id = sc.nextLine();
        // 입력받은 아이디 리턴
        return id;
    }

    public String memberGetInfo(Scanner sc) {
        // 조회할 회원 아이디 리턴
        System.out.println("======= 회원 조회 =======");
        System.out.println("1. 아이디 조회");
        System.out.println("2. 이름 조회");
        // 조회할 회원 아이디 입력
        System.out.print("번호 선택 >> ");
        int no = Integer.parseInt(sc.nextLine());
        String input = "";
        if (no == 1) {
            System.out.print("아이디 >> ");
            input = sc.nextLine();
        } else if (no == 2) {
            System.out.print("이름 >> ");
            input = sc.nextLine();
        }
        // 입력받은 아이디 or 이름 리턴
        return input;
    }

    public void memberAllPrint(List<MemberDTO> list) {
        System.out.println("=================================================================");
        System.out.println("번호    아이디    이름        주소              이메일       나이");
        for (MemberDTO memberDTO : list) {
            System.out.printf("%d      %s   %s   %s   %s   %d\n", memberDTO.getNo(), memberDTO.getId(),
                    memberDTO.getName(),
                    memberDTO.getAddr(), memberDTO.getEmail(), memberDTO.getAge());
        }
        System.out.println("=================================================================");
    }

    public void memberSelectPrint(List<MemberDTO> list) {
        if (list != null) {
            System.out.println("=================================================================");
            System.out.println("번호    아이디    이름        주소              이메일       나이");
            for (MemberDTO memberDTO : list) {
                System.out.printf("%d      %s   %s   %s   %s   %d\n", memberDTO.getNo(), memberDTO.getId(),
                        memberDTO.getName(),
                        memberDTO.getAddr(), memberDTO.getEmail(), memberDTO.getAge());
            }
            System.out.println("=================================================================");
        } else {
            System.out.println("조회한 이름이 없습니다");
        }
    }

}
