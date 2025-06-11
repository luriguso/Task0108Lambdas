package level1.exercise6.classData;

public class Text {
    private Object value;

    public Text(Object value) {
        this.value = value;
    }

    public Object getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "Text{" +
                "value=" + value +
                '}';
    }
}
