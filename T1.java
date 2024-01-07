package MockInterview;

public class T1 {

    public static void main(String[] args) {

        String a = "Hi";
        String b = "Mom";

        System.out.println("the value of a is " + a);
        System.out.println("the value of b is " + b);

        //swap strings without a temporary variable.
        // 1 - append a+b
        a=a+b;  //HiMom
        //2- Store initial string a in String b.
        b=a.substring(0,a.length()-b.length());
        //Store initial string b in string a
        a=a.substring(b.length());
        System.out.println("the value of a is " + a);
        System.out.println("the value of b is " + b);
    }
}
