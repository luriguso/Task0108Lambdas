package level2.exercise1.classManagement;

import level2.exercise1.classData.Name;

import java.util.ArrayList;
import java.util.List;

public class NamesManagement {
    private List<Name> names;

    public NamesManagement() {
        names = new ArrayList<>();
    }

    public void addNamesExamples(){
        names.add(new Name("Luis"));
        names.add(new Name("Ana"));
        names.add(new Name("Ari"));
    }

    public void listNames(){
        this.names.stream()
                .filter(name -> name.getName().charAt(0)=='A'  && name.getName().length()==3)
                .map(Name::getName)
                .forEach(System.out::println);
    }
}
