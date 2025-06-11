package level1.exercise7.classManagement;

import level1.exercise7.classData.Text;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class TextManagement {
    private List<Text> texts;

    public TextManagement(){
        texts = new ArrayList<>();
    }

    public void addText(){
        texts.add(new Text("Hello"));
        texts.add(new Text(54321));
        texts.add(new Text("Java"));
        texts.add(new Text(654.21));
        texts.add(new Text('A'));
    }

    public void listTextsOrderByLength(){
        this.texts.stream()
                .map(Text ->Text.getValue().toString())
                .sorted(Comparator.comparing(String::length).reversed())
                .forEach(System.out::println);
    }
}
