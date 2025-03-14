package generics;

public class Box2<T> {

    T item;

    public void setItem(T item) {
        this.item = item;
    }

    public T getItem() {
        return item;
    }

}

class BoxEx2 {
    public static void main(String[] args) {

        // 과거에 사용했던 방식
        Box2<String> box = new Box2<>();
        box.setItem("자바");
        String result = (String) box.getItem();
        System.out.println(result);

        Box2<Integer> box2 = new Box2<>();
        box2.setItem(1);
        int i = box2.getItem();
        System.out.println(i);

    }
}
