package level1.exercise2.main;

import level1.exercise2.classManagement.NamesManagement;

public class Main {
    public static void main(String[] args) {
        NamesManagement namesManagement = new NamesManagement();
        namesManagement.addNamesInitial();
        namesManagement.select();
    }
}
