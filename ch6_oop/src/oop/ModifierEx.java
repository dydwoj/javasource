package oop;

/*
 modifier (제어자)
    접근제어자(캡슐화=멤버변수를 감추는 것) : public, (>) protected, (>) default, (>) private
        public : 공개
        private : 같은 클래스 내에서만 접근 가능
        default : 접근제어자 사용 안 하는 경우 (public class ModifierEx에서 public 같은 거 안쓰는 경우)
            ㄴ 같은 패키지 내에서만 접근 가능
        protected : 같은 패키지 내에서, 다른 패키지라면 자손 클래스에서 접근 가능

    기타 : static, final, abstract, synchronized, native...
        static : 공통적인(공유) => card 클래스
        final : 마지막의, 불변의 = 클래스, 메서드, 멤버변수, 지역변수에 붙일 수 있음
            ㄴ 클래스(=상속금지), 멤버(지역)변수(=상수{불변}), 메서드(=오버라이딩 금지)
*/
public class ModifierEx {
    public static void main(String[] args) {

    }
}
