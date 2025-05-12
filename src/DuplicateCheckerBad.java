import java.util.*;

public class DuplicateCheckerBad {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 1_000_000; i++) {
            numbers.add(i);
        }
        numbers.add(123456);

        long start = System.currentTimeMillis();
        boolean hasDuplicate = hasDuplicate(numbers);
        long end = System.currentTimeMillis();

        System.out.println("Has Duplicate: " + hasDuplicate);
        System.out.println("Execution time: " + (end - start) + "ms");
    }


    public static boolean hasDuplicate(List<Integer> list) {
        List<Integer> seen = new ArrayList<>();
        for (Integer num : list) {
            if (seen.contains(num)) {
                return true;
            }
            seen.add(num);
        }
        return false;
    }
}
