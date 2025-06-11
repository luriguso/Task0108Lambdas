package level1.exercise1.main;

import level1.exercise1.classManagement.NamesManagement;

public class Main {
    public static void main(String[] args) {
        NamesManagement namesManagement = new NamesManagement();
        namesManagement.addNamesInitial();
        namesManagement.select();
    }
}
