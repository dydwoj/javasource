package emp;

import java.util.Scanner;

public class EmpMain {
    public static void main(String[] args) {

        boolean run = true;
        Scanner scanner = new Scanner(System.in);

        int empNo = 0, result = 0;
        EmpDAO eDao = new EmpDAO();
        EmpDTO eDto = null;

        while (run) {
            System.out.println("=====================================");
            System.out.println("1. 입력");
            System.out.println("2. 수정");
            System.out.println("3. 삭제");
            System.out.println("4. 조회");
            System.out.println("5. 종료");
            System.out.println("=====================================");

            System.out.print("메뉴 >> ");
            int menu = Integer.parseInt(scanner.nextLine());
            switch (menu) {
                case 1:
                    eDto = insertInfo(scanner);
                    result = eDao.insert(eDto);
                    System.out.println(result > 0 ? "입력 성공" : "입력 실패");
                    break;
                case 2:

                    eDto = updateInfo(scanner);
                    result = eDao.update(eDto);
                    System.out.println(result > 0 ? "변경 성공" : "변경 실패");
                    break;
                case 3:
                    empNo = deleteInfo(scanner);
                    result = eDao.delete(empNo);
                    System.out.println(result > 0 ? "삭제 성공" : "삭제 실패");
                    break;
                case 4:

                    break;
                case 5:
                    System.out.println("시스템을 종료합니다");
                    run = false;
                    break;
                default:
                    break;
            }

        }

        scanner.close();
    }

    public static int deleteInfo(Scanner scanner) {
        // 삭제할 empNo 입력 받은 후 리턴
        System.out.println("삭제 대상 empNo >> ");
        int empNo = Integer.parseInt(scanner.nextLine());
        return empNo;
    }

    public static EmpDTO updateInfo(Scanner scanner) {
        // 수정할 empNo 입력 받기
        System.out.print("수정 대상 empNo >> ");
        int empNo = Integer.parseInt(scanner.nextLine());
        // 수정할 급여 입력 받기
        System.out.print("변경 급여 >> ");
        int sal = Integer.parseInt(scanner.nextLine());
        //
        EmpDTO eDto = EmpDTO.builder().empNo(empNo).sal(sal).build();
        return eDto;
    }

    public static EmpDTO insertInfo(Scanner scanner) {
        // 새로운 사원 정보 입력
        System.out.print("사번 >> ");
        int empNo = Integer.parseInt(scanner.nextLine());
        System.out.print("이름 >> ");
        String eName = scanner.nextLine();
        System.out.print("직무 >> ");
        String job = scanner.nextLine();
        System.out.print("매니저 번호 >> ");
        int mgr = Integer.parseInt(scanner.nextLine());
        System.out.print("입사일 >> ");
        String hireDate = scanner.nextLine();
        System.out.print("급여 >> ");
        int sal = Integer.parseInt(scanner.nextLine());
        System.out.print("수당 >> ");
        int comm = Integer.parseInt(scanner.nextLine());
        System.out.print("부서번호 >> ");
        int deptNo = Integer.parseInt(scanner.nextLine());

        // Date date = null;
        // try {
        // date = new SimpleDateFormat("YYYY-MM-DD").parse(hireDate);
        // } catch (ParseException e) {
        // e.printStackTrace();
        // }

        // 빌더 사용 방법
        // EmpDTO eDto = EmpDTO.builder()
        // .empNo(empNo)
        // .eName(eName)
        // .job(job)
        // .mgr(mgr)
        // .hireDate(date)
        // .sal(sal)
        // .comm(comm)
        // .deptNo(deptNo)
        // .build();

        // return eDto;
        // 빌더 사용 안한 방법
        return new EmpDTO(empNo, eName, job, mgr, hireDate, sal, comm, deptNo);
    }
}
