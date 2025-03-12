package api.object;

public class Value {

    int value;

    public Value(int value) {
        this.value = value;
    }

    // 멤버변수의 값비교로 equals 재정의
    @Override
    public boolean equals(Object obj) {
        Value v = (Value) obj;
        return this.value == v.value;
    }

    @Override
    public String toString() {
        return "Value [value=" + value + "]";
    }

    // toString() : 멤버변수의 값을 출력하는 용도
    // @Override
    // public String toString() {
    // return value + ""; // => String으로 형변환 하는 방법 : + ""
    // }

}
