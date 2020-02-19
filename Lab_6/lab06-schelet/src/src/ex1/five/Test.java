package ex1.five;

interface Engine {
    int getFuelCapacity();
}


class Car {
    class Engine {
        public void getFuelCapacity() {
            System.out.println("I am a generic Engine");
        }
    }
}

class OttoEngine extends Car.Engine {
//    OttoEngine() {
//
//    } // EROARE, avem nevoie de o legatura la obiectul clasei exterioare

    OttoEngine(Car car) { // OK
        car.super();
    }
}

public class Test {
    public static void main(String[] args) {
        Car car = new Car();
        OttoEngine ottoEngine = new OttoEngine(car);
        ottoEngine.getFuelCapacity();
    }
}