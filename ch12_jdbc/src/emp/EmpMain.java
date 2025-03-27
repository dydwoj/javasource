package emp;

import java.util.List;
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
            System.out.println("4. 전체조회");
            System.out.println("5. 특정사원조회");
            System.out.println("6. 종료");
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
                    List<EmpDTO> list = eDao.selectAll();
                    empPrint(list);
                    break;
                case 5:
                    empNo = getRow(scanner);
                    eDto = eDao.select(empNo);
                    System.out.println(eDto);
                    break;
                case 6:
                    System.out.println("시스템을 종료합니다");
                    run = false;
                    break;
                default:
                    break;
            }

        }

        scanner.close();
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

    public static int deleteInfo(Scanner scanner) {
        // 삭제할 empNo 입력 받은 후 리턴
        System.out.println("삭제 대상 empNo >> ");
        int empNo = Integer.parseInt(scanner.nextLine());
        return empNo;
    }

    public static void empPrint(List<EmpDTO> list) {
        System.out.println("===========================================================================");
        System.out.println("사번    이름    직무    매니저번호    입사일    급여    수당    부서번호");

        for (EmpDTO empDTO : list) {
            System.out.print(empDTO.getEmpNo() + "\t");
            System.out.print(empDTO.getEName() + "\t");
            System.out.print(empDTO.getJob() + "\t");
            System.out.print(empDTO.getMgr() + "\t");
            System.out.print(empDTO.getHireDate() + "\t");
            System.out.print(empDTO.getSal() + "\t");
            System.out.print(empDTO.getComm() + "\t");
            System.out.print(empDTO.getDeptNo());
            System.out.println();
        }
    }

    public static int getRow(Scanner scanner) {
        // 조회할 empno 입력 받은 후 리턴
        System.out.println("조회 대상 empNo >> ");
        int empNo = Integer.parseInt(scanner.nextLine());
        return empNo;
    }

}
