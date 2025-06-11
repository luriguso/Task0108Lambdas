package level1.exercise5.main;

import level1.exercise5.interfaces.PiValue;

public class Main {
    public static void main(String[] args) {
        PiValue number = ()->3.1416;

        System.out.println("The PI valur is: " + number.getPiValue());
    }
}
