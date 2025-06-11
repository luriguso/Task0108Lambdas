package level1.exercise3.main;

import level1.exercise3.classData.Month;
import level1.exercise3.classManagement.MonthManagement;

public class Main {
    public static void main(String[] args) {
        MonthManagement monthManagement = new MonthManagement();
        monthManagement.addMonths();
        monthManagement.listMonths();
    }
}
