package oop;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor // => default 생성자
@AllArgsConstructor // => 멤버변수 전부의 생성자
@Getter // => setter 와 같은 의미
@Setter // => 모든 멤버변수의 setter 메서드 작성 => 특정 멤버변수의 setter 메서드만 작성은 클래스가 아닌 멤버변수 위에
@ToString // => toString 메서드 생성

public class Person {

    private String pno;
    private String name;
    private String tel;

}
