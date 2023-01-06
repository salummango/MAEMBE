class MyOwnAutoShop {
    public static void main(String[] args) {
        Sedan sedans = new Sedan();
        sedans.regularPrice = 10000;
        sedans.color = "red";
        sedans.length = 25;
        System.out.println("Sedans sale price: " + sedans.getSalePrice());

        Ford firstford = new Ford();
        firstford.regularPrice = 20000;
        firstford.color = "blue";
        firstford.year = 2021;
        firstford.manufacturerDiscount = 1000;
        System.out.println("First Ford sale price: " + firstford.getSalePrice());

        Ford secondford = new Ford();
        secondford.regularPrice = 30000;
        secondford.color = "green";
        secondford.year = 2020;
        secondford.manufacturerDiscount = 2000;
        System.out.println("Second Ford sale price: " + secondford.getSalePrice());

        Car car = new Car();
        car.regularPrice = 15000;
        car.color = "black";
        System.out.println("Car sale price: " + car.getSalePrice());
    }
}
