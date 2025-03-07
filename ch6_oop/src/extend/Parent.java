package extend;

// 자바 = 모듈화 방식으로 작성
/*
 관계
    1) is a(상속관계) : 기존의 클래스를 재사용하여 새로운 클래스 작성
        => 부모가 써준 코드를 그대로 내려다 쓴다 (child가 parent를 포함하는 개념)
        <특징>
        1. 적은 양의 코드로 새로운 클래스 작성 가능
        2. 코드를 공통적으로 관리가능 => 코드의 추가 및 변경 용이함
        3. 상속은 여러번 할 수 있음 (ex. Parent -> Child -> GrandChild(GrandChild 클래스가 제일 큼))
        4. but 단일 상속만 허용한다(한 클래스내에 상속받을 수 있는 수 : 1개)
            ex. extends 뒤에 두개가 올 수 없다! and extends Child, extends Child2 이런식도 안됨!

        조상 클래스 : 부모, super, 상위, 기반(base) 클래스 라고 부름
            ㄴ 공통적으로 쓸 코드들은 부모가 가지고 있는게 편하다
        자손 클래스 : 자식, sub, 하위, 파생(derived) 클래스 라고 부름
            ㄴ 부모, 자식 관계만 있지, 형제 관계 X(child와 child2는 관계가 없다)
        Child, caption, tv 까지 설명
    2) has a(포함관계) : 한 클래스 안에 다른 클래스가 멤버 변수로 선언된 상황
        => 대문자로 시작하는 것 => 지금까지 클래스 호출들은 포함관계였던 것
        Circle, point 까지 설명
 관계 결정하기 = Circle에 설명

 Object 클래스 : 모든 클래스의 조상
    => 무조건 클래스 생성시 Object 클래스를 상속 받음
*/
public class Parent {

    int age;

}
