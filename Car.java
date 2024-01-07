package MockInterview;

class Car {
    double carPrice;
    String color;

    Car(double carPrice, String color) {
        this.carPrice = carPrice;
        this.color = color;
    }

    double calculateSalePrice() {
        // Default implementation for Car class
        return carPrice;
    }
}

class Sedan extends Car {
    double length;

    Sedan(double carPrice, String color, double length) {
        super(carPrice, color);
        this.length = length;
    }

    @Override
    double calculateSalePrice() {
        // Sedan-specific implementation
        if (length > 20) {
            return super.calculateSalePrice() * 0.95; // 5% discount
        } else {
            return super.calculateSalePrice() * 0.90; // 10% discount
        }
    }
}

class Truck extends Car {
    double weight;

    Truck(double carPrice, String color, double weight) {
        super(carPrice, color);
        this.weight = weight;
    }

    @Override
    double calculateSalePrice() {
        // Truck-specific implementation
        if (weight > 2000) {
            return super.calculateSalePrice() * 0.90; // 10% discount
        } else {
            return super.calculateSalePrice() * 0.80; // 20% discount
        }
    }
}

