package level1.exercise8.classData;

public class Text {
    private String lineText;

    public Text(String text) {
        this.lineText = text;
    }

    public String getLineText() {
        return lineText;
    }

    @Override
    public String toString() {
        return "Text{" +
                "lineText='" + lineText + '\'' +
                '}';
    }
}
