package ex2;

public class Showroom {
    public static void main(String[] args) {

        /* Innocent example to make sure the code runs */
        Dealership dealership = new Dealership(300, 100000);
        Car car1 = dealership.getCar(CarType.GENERIC);
        Car car2 = dealership.getCar(CarType.GENERAL_PURPOSE);
        Car car3 = dealership.getCar(CarType.SPORTS);
//        Car car4 = dealership.getCar(CarType.RACING);
        Dealership.Ferrari car4 = new Dealership.Ferrari();
        Car car5 = dealership.getCar(CarType.MUSCLE);
        Car car6 = dealership.getCar(CarType.ELECTRIC_ANON);
        Car car7 = dealership.getCar(CarType.ELECTRIC_LAMBDA);

//        System.out.println(car1.showPresentation());
        System.out.println(car2.showPresentation());
        System.out.println(car3.showPresentation());
        System.out.println(car4.showPresentation());
        System.out.println(car5.showPresentation());
        System.out.println(car6.showPresentation());
        System.out.println(car7.showPresentation());

        /* TODO 2,3,4: Test all changes to the code */
    }
}
