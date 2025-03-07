package extend;

/*
 오버라이딩
    조건
    1. 이름이 같아야 한다
    2. 매개변수가 같아야 한다
    3. 반환 타입이 같아야 한다

    특성
    재정의 : 부모가 정의한 내용을 자식에 맞춰서 변경하는 개념
    List, SubList 까지
    
 오버로딩(OverLoading) vs. 오버라이딩(OverRiding)
    오버로딩 : 클래스 하나에서만 사용 = 동일한 이름의 메서드를 여러개 정의하는 것 (매개 변수값이 다름)
    오버라이딩 : 상속에서만 사용 = 상속받은 메서드의 내용을 재정의하는 것 (출력만 다름)
*/
public class SubString extends ListString {

    String name = "성춘향";

    @Override
    public void list() {
        super.list(); // => 이건 부모의 것도 같이 출력이 됨
        System.out.println(name + " 하위 클래스 이름");
    }

    public void print() {
        list(); // => 이건 내것 부르는 것
        super.list(); // => 부모 것 부르기
        exec(); // => super. 없이도 부를 순 있음 (오버라이딩이 아니니까 but super. 붙여도 되긴 함)
    }

}
