import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomList {
    static List<Integer> generateList() {
        List<Integer> intList = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            int number = random.nextInt(100);
            intList.add(number);
        }
        return intList;
    }
}
