package level1.exercise6.main;

import level1.exercise6.classManagement.TextManagement;

public class Main {
    public static void main(String[] args) {
        TextManagement textManagement = new TextManagement();
        textManagement.addText();
        textManagement.listTextsOrderByLength();
    }
}
