package level2.exercise4.classManagement;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ListManagement {
    private List<Object> list;

    public ListManagement() {
        list = new ArrayList<>();
    }

    public void addObjectsExample(){
        list.add("hello");
        list.add(90291);
        list.add("shoes");
        list.add(1221);
        list.add('B');
        list.add("Smartphone");
    }

    public void listObjects(){
        List<Object> sortedByFirstChar = this.list.stream()
                .sorted(Comparator.comparing(list -> list.toString().charAt(0)))
                .collect(Collectors.toList());

        System.out.println(sortedByFirstChar);


        List<Object> sortedByEPresence = this.list.stream()
                .sorted((a, b) -> {
                    boolean aHasE = a.toString().toLowerCase().contains("e");
                    boolean bHasE = b.toString().toLowerCase().contains("e");
                    return Boolean.compare(!aHasE, !bHasE);
                })
                .collect(Collectors.toList());
        System.out.println(sortedByEPresence);


        List<Object> modifiedList = this.list.stream()
                .map(elementList->elementList.toString().replace("a","4"))
                .collect(Collectors.toList());
        System.out.println(modifiedList);


        List<Object> numericElements = this.list.stream()
                .filter(elementList->elementList.toString().toLowerCase().matches("\\d+"))
                .collect(Collectors.toList());
        System.out.println(numericElements);
    }
}
