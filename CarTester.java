package MockInterview;

public class CarTester {
    public static void main(String[] args) {

       Sedan sedan = new Sedan(19200,"Blue",20);
       Truck truck = new Truck(25200,"Red",2500);

        System.out.println(sedan.calculateSalePrice());
        System.out.println(truck.calculateSalePrice());
    }
}
