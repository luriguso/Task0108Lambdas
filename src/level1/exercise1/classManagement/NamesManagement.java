package level1.exercise1.classManagement;

import level1.exercise1.classData.Name;

import java.util.ArrayList;
import java.util.List;

public class NamesManagement {
    private List<Name> names;

    public NamesManagement() {
        this.names = new ArrayList<>();
    }

    public void addNamesInitial(){
        names.add(new Name("John"));
        names.add(new Name("Jane"));
        names.add(new Name("Julie"));
        names.add(new Name("July"));
        names.add(new Name("Mary"));
    }

    public void select(){
        this.names.stream()
                .filter(word->word.getName().toLowerCase().contains("o"))
                .map(Name::getName )
                .forEach(System.out::println);
    }
}
