package level1.exercise8.classManagement;

import level1.exercise8.classData.Text;
import level1.exercise8.interfaces.ReverseString;

import java.util.ArrayList;
import java.util.List;

public class TextManagement {
    private List<Text> texts;
    public TextManagement() {
        texts = new ArrayList<>();
    }

    public List<Text> getTexts() {
        return texts;
    }

    public void addText(){
        texts.add(new Text("Hello IT Academy"));
    }

    public void reverseLambda(){
        ReverseString example = string->new StringBuilder(string).reverse().toString();

        if (!getTexts().isEmpty()) {
            String phrase = getTexts().get(0).getLineText();

            String examplePhrase = example.reverse(phrase);

            System.out.println(examplePhrase);

        } else {
            System.out.println("The list is empty, there are no phrases to reverse.");
        }
    }

    @Override
    public String toString() {
        return "TextManagement{" +
                "texts=" + texts +
                '}';
    }
}
