import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static void task1() {
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        Set<Integer> numSet = new HashSet<>();
        for (Integer num : nums) {
            if (num % 2 != 0) {
                numSet.add(num);
            }
        }
        System.out.println(numSet);
    }

    public static void task2() {
        List<Integer> nums = new ArrayList<>(List.of(1, 80, 2, 3, 4, 4, 5, 5, 6, 7));
        Set<Integer> numSet = new HashSet<>();
        for (Integer num : nums) {
            if (num % 2 == 0) {
                numSet.add(num);
            }
        }
        List<Integer> sas = new ArrayList<>(numSet);
        sas.sort(Integer::compareTo);
        System.out.println(sas);
    }

    public static void task3() {
        String da = "da da da da da da da da net da net ya on ono da da net";
        List<String> text = new ArrayList<>(List.of(da.split(" ")));
        Set<String> textSet = new HashSet<>(text);
        System.out.println(textSet);
    }

    public static void task4() {
        String da = "da da da da da da da da net da net ya on ono da da net";
        List<String> text = new ArrayList<>(List.of(da.split(" ")));
        Set<String> textSet = new HashSet<>(text);
        List<String> textNum = new ArrayList<>(textSet);
        for (String value : textNum) {
            int k = 0;
            for (String s : text) {
                if (value.contains(s)) {
                    k++;
                }
            }
            if (k > 1) {
                System.out.printf("%s = %d\n", value, k);
            }
        }
    }
}
