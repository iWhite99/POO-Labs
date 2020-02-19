package ex1.four;

interface Engine {
  public int getFuelCapacity();
}

class Car {
  public Engine getEngine(int fuelCapacity) {
    if (fuelCapacity == 11) {
      class OttoEngine implements Engine {
        private int fuelCapacity = 11;

        public int getFuelCapacity() {
          return fuelCapacity;
        }
      }

      return new OttoEngine();
    }

    return null;
  }
}

public class Test {
  public static void main(String[] args) {
    Car car = new Car();

    Engine firstEngine = car.getEngine(11);
    Engine secondEngine = car.getEngine(11);
//    Car.OttoEngine firstEngine = car.getEngine();
//    Car.OttoEngine secondEngine = car.new OttoEngine(10);

    System.out.println(firstEngine.getFuelCapacity());
    System.out.println(secondEngine.getFuelCapacity());
  }
}
