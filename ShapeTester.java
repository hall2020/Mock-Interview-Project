package MockInterview;

public class ShapeTester {
    public static void main(String[] args) {

        Shape [] arr = {new Circle(), new Square()};

        for(Shape s: arr){
            s.calculateArea();
            s.calculatePerimeter();
        }
    }
}
