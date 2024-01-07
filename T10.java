package MockInterview;

import java.util.ArrayList;

public class T10 {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(2);
        numbers.add(4);
        numbers.add(1);

        System.out.println("Original ArrayList " + numbers);

        for (int i = 0; i < numbers.size(); i++) {
            int currentNumber = numbers.get(i);

            for (int j = i + 1; j < numbers.size(); j++) {
                if (currentNumber == numbers.get(j)) {
                    numbers.remove(j);
                    j--; // Adjust the index after removal
                }
            }
        }

        System.out.println("ArrayList after removing duplicates: " + numbers);
    }
}
