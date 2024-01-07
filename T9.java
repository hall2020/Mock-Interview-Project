package MockInterview;

public class T9 {
    public static void main(String[] args) {

        String str = "abracadabra";
        char firstNonRepeatingChar = ' '; // Default value if no non-repeating character is found

        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);

            boolean isRepeating = false;

            for (int j = 0; j < str.length(); j++) {
                if (i != j && currentChar == str.charAt(j)) {
                    // Found a matching character at a different position, so it's repeating
                    isRepeating = true;
                    break;
                }
            }

            if (!isRepeating) {
                firstNonRepeatingChar = currentChar;
                break;
            }
        }

        if (firstNonRepeatingChar != ' ') {
            System.out.println("First non-repeating character in " + str + " : " + firstNonRepeatingChar);
        } else {
            System.out.println("No non-repeating character found in " + str + " ");
        }

            }
        }


