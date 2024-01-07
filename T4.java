package MockInterview;

public class T4 {

    public static void main(String[] args) {

        String str="Halil";
        String reverse="";


        for(int i= str.length()-1; i>=0; i--) {
            reverse=reverse+str.charAt(i);
        }
        if(str.equalsIgnoreCase(reverse)){
            System.out.println("it is a palindrome");
        }
        else {
            System.out.println("it is not palindrome");
        }
    }
}
