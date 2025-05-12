import java.util.*;

public class DuplicateCheckerGood {

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
        System.out.println("Execution Time: " + (end - start) + "ms");
    }

    public static boolean hasDuplicate(List<Integer> list) {
        Set<Integer> seen = new HashSet<>();
        for (Integer num : list) {
            if (!seen.add(num)) {
                return true;
            }
        }
        return false;
    }
}
