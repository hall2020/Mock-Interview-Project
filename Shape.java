package MockInterview;



    public interface Shape {

        void calculateArea();

        void calculatePerimeter();

    }

    class Circle implements Shape {
        public void calculateArea(){
            System.out.println("Calculating area for Circle");
        }

        @Override
        public void calculatePerimeter() {
            System.out.println("Calculating perimeter for circle");
        }
    }

    class Square implements Shape {

        @Override
        public void calculateArea() {
            System.out.println("Calculating area for square");
        }

        @Override
        public void calculatePerimeter() {
            System.out.println("Calculating perimeter for Square");
        }
    }

