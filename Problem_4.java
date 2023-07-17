
import java.util.*;
public class Problem_4{
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       
        System.out.print("Enter numbers (space-separated): ");
        String input = scanner.nextLine();

        List<Integer> numbers = new ArrayList<>();
        for (String num : input.split(" ")) {
            numbers.add(Integer.parseInt(num));
        }
        
        Map<Integer, Integer> countMap = new HashMap<>();
        int[] multiples = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        for (int multiple : multiples) {
            countMap.put(multiple, 0);
        }

        for (int number : numbers) {
            for (int multiple : multiples) {
                if (number % multiple == 0) {
                    countMap.put(multiple, countMap.get(multiple) + 1);
                }
            }
        }

        for (int multiple : multiples) {
            System.out.println(multiple + ": " + countMap.get(multiple));
        }
    }
}
