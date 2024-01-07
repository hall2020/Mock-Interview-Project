package MockInterview;

public class T6 {
    public static void main(String[] args) {

        String str = "documentation";

        int vowelCount = 0;

        for(int i=0; i < str.length(); i++){
            char ch=str.charAt(i);

            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') {
                vowelCount++;
            }
        }

        System.out.println("Number of vowels in " + str + " " + vowelCount );


    }

    //or

}
