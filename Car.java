public class Car {
    int speed;
    double regularPrice;
    String color;

    public double getSalePrice() {
        return regularPrice;
    }
}

public class Truck extends Car {
    int weight;

    public double getSalePrice() {
        if (weight > 2000) {
            return regularPrice * 10/100;
        } else {
            return regularPrice * 20/100;
        }
    }
}

public class Ford extends Car {
    int year;
    int manufacturerDiscount;

    public double getSalePrice() {
        return regularPrice - manufacturerDiscount;
    }
}

public class Sedan extends Car {
    int length;

    public double getSalePrice() {
        if (length > 20) {
            return regularPrice * 5/100;
        } else {
            return regularPrice * 10/100;
        }
    }
}


