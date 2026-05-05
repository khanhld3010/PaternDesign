import java.util.ArrayList;
import java.util.List;

public class ListFilter {
    static List<Integer> filterOdd(List<Integer> intList) {
        List<Integer> oddListNumber = new ArrayList<>();
        for (Integer i : intList) {
            if (i % 2 == 0){
                oddListNumber.add(i);
            }
        }
        return oddListNumber;
    }
}
