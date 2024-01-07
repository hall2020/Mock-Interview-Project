package MockInterview;

import java.util.Arrays;

public class T5 {
    public static void main(String[] args) {

        String string1 = "listen";
        String string2 = "silent";

        // Remove spaces and convert to lowercase for case-insensitive comparison
        string1 = string1.replaceAll("\\s", "").toLowerCase();
        string2 = string2.replaceAll("\\s", "").toLowerCase();

        // Check if lengths are different, if yes, they can't be anagrams
        if (string1.length() != string2.length()) {
            System.out.println(string1 + " and " + string2 + " are not anagrams.");
            return;
        }

        // Sort the characters in the strings
        char[] charArray1 = string1.toCharArray();
        char[] charArray2 = string2.toCharArray();
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        // Compare the sorted char arrays
        for (int i = 0; i < string1.length(); i++) {
            if (charArray1[i] != charArray2[i]) {
                System.out.println(string1 + " and " + string2 + " are not anagrams.");
                return;
            }
        }

        // If the loop completes without returning, strings are anagrams
        System.out.println(string1 + " and " + string2 + " are anagrams.");
                }
            }







