package oop;

public class SingletonEx {
    public static void main(String[] args) {

        // Singleton singleton = new Singleton();
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
        System.out.println(singleton1 == singleton2 ? "같은 객체" : "다른 객체");

        Student student1 = new Student();
        Student student2 = new Student();
        System.out.println(student1 == student2 ? "같은 객체" : "다른 객체");
        // => 다른 객체 : new 할 때마다 새로 만들어내기 때문에 다르다

    }
}
