public class Baravelli extends CandyBox {
  float radius;
  float height;

  public Baravelli() {
    super();
    this.radius = 0;
    this.height = 0;
  }

  public Baravelli(String flavor, String origin, float radius, float height) {
    super(flavor, origin);
    this.radius = radius;
    this.height = height;
  }

  public void printBaravelliDim() {
    System.out.println(this.radius + " " + this.height);
  }

  @Override
  public float getVolume() {
    return (float) 3.14 * this.radius * this.height * 2;
  }

  @Override
  public String toString() {
    return "The " + super.toString() + " has volume " + this.getVolume();
  }

  @Override
  public String check() {
    return "baravelli";
  }
}
