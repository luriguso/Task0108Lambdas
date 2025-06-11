package level1.exercise3.classManagement;

import level1.exercise3.classData.Month;

import java.util.ArrayList;
import java.util.List;

public class MonthManagement {
    private List<String> months;

    public MonthManagement() {
        months = new ArrayList<>();
    }

    public void addMonths(){
        months.add("January");
        months.add("February");
        months.add("March");
        months.add("April");
        months.add("May");
        months.add("June");
        months.add("July");
        months.add("August");
        months.add("September");
        months.add("October");
        months.add("November");
        months.add("December");
    }

    public void listMonths(){
        this.months.forEach(System.out::println);
    }
}
