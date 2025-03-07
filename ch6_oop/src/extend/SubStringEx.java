package extend;

// new 로 호출시 1. 부모 인스턴스 생성 => 2. 자식 인스턴스 생성

public class SubStringEx {
    public static void main(String[] args) {

        SubString obj = new SubString();

        System.out.println("이름 : " + obj.name); // => 성춘향 뜸 = 부모의 값 보단 내려받은 쪽(본인)의 값이 우선
        obj.list(); // => 홍길동상위 클래스 이름
        // => "성춘향 하위 클래스 이름" 출력을 원한다면? : 오버라이딩 후 super.list(); 막기
        // 부모 것과 내것 같이 나오기 원한다면? : 오버라이딩 후 super.list(); 열기

    }
}
