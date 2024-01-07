package MockInterview;

public abstract class Marks {


   abstract double getPercentage();

}
 class studentA extends Marks {
    private int subject1;
    private int subject2;
    private int subject3;

    public studentA(int subject1, int subject2, int subject3){
        this.subject1=subject1;
        this.subject2=subject2;
        this.subject3=subject3;
    }

    @Override
    double getPercentage() {
        return (subject1+subject2+subject3)/3.0;
    }
}


class studentB extends Marks {

    private int subject1;
    private int subject2;
    private int subject3;
    private int subject4;

    public studentB(int subject1, int subject2, int subject3, int subject4){
        this.subject1=subject1;
        this.subject2=subject2;
        this.subject3=subject3;
        this.subject4=subject4;
    }

    @Override
    double getPercentage() {
        return (subject1+subject2+subject3+subject4)/3.0;
    }
}
