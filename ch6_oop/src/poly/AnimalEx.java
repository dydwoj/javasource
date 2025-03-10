package poly;

public class AnimalEx {
    public static void main(String[] args) {

        /*
         * 기본 형태의 인스턴스 생성법
         * Animal animal = new Animal();
         * Canine canine = new Canine();
         * Feline feline = new Feline();
         * Cat cat = new Cat();
         * Dog dog = new Dog();
         */

        // 자식을 인스턴스로 받을 수 있다!
        // 부모 = new 자식
        Animal animal = new Animal();
        Animal animal1 = new Canine(); // 상속받은 super(); 나오고 => Canine
        Animal animal2 = new Feline();
        Animal animal3 = new Cat();
        Animal animal4 = new Dog();
        animal.getClass();
        animal1.getClass();
        animal2.getClass();
        animal3.getClass();
        animal4.getClass();

        // Type mismatch: cannot convert from Cat to Dog => 아무런 관련이 없는 인스턴스(상속도 아님)
        // Dog dog = new Cat;

    }

}
