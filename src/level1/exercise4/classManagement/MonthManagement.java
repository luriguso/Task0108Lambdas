package level1.exercise4.classManagement;

import level1.exercise3.classData.Month;

import java.util.ArrayList;
import java.util.List;

public class MonthManagement {
    private List<Month> months;

    public MonthManagement() {
        months = new ArrayList<>();
    }

    public void addMonths(){
        months.add(new Month("January"));
        months.add(new Month("February"));
        months.add(new Month("March"));
        months.add(new Month("April"));
        months.add(new Month("May"));
        months.add(new Month("June"));
        months.add(new Month("July"));
        months.add(new Month("August"));
        months.add(new Month("September"));
        months.add(new Month("October"));
        months.add(new Month("November"));
        months.add(new Month("December"));
    }

    public void listMonths(){
        this.months.stream().map(Month::getName).forEach(System.out::println);
    }
}
