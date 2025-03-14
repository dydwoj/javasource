package api.util;

import java.util.HashSet;
import java.util.Set;

import api.object.Person;

public class SetEx3 {
    public static void main(String[] args) {

        Set<Person> set = new HashSet<>();
        set.add(new Person("hong12", "홍길동"));
        set.add(new Person("kang12", "공길동"));
        set.add(new Person("kim12", "김길동"));
        set.add(new Person("hong12", "홍길동"));
        set.add(new Person("hwang12", "황길동"));

        for (Person person : set) {
            System.out.println(person); // => print를 person만 하면 => person.toString()
        }

        System.out.println(new Person("hong12", "홍길동").hashCode());
        System.out.println(new Person("hong12", "홍길동").hashCode());

    }
}
