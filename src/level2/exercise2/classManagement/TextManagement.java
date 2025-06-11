package level2.exercise2.classManagement;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TextManagement {
    private List<Integer> numberList;

    public TextManagement() {
        this.numberList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
    }

    public void number_preceded_by_letter(){

        List<String> result = this.numberList.stream()
                .map(numberList-> (numberList % 2 == 0 ? "e":"0") + numberList)
                .collect(Collectors.toList());
        System.out.println(result);
    }
}
