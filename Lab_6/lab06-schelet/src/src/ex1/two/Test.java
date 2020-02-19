package ex1.two;

interface Engine {
  public int getFuelCapacity();
}

class Car {
  static class OttoEngine implements Engine {
    private int fuelCapacity;

    public OttoEngine(int fuel) {
      this.fuelCapacity = fuel;
    }

    public int getFuelCapacity() {
      return fuelCapacity;
    }
  }

  public OttoEngine getEngine() {
    OttoEngine engine = new OttoEngine(11);
    return engine;
  }
}

public class Test {
  public static void main(String[] args) {
    Car car = new Car();

    Car.OttoEngine firstEngine = new Car.OttoEngine(11);
    Car.OttoEngine secondEngine = new Car.OttoEngine(10);

    System.out.println(firstEngine.getFuelCapacity());
    System.out.println(secondEngine.getFuelCapacity());
  }
}
