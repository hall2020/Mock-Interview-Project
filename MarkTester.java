package MockInterview;

public class MarkTester {

    public static void main(String[] args) {

        Marks[] arr = {new studentA(78,65,98), new studentB(97,56,23,45)};

        for(Marks m: arr){
            System.out.println(m.getPercentage());
        }
    }
}





