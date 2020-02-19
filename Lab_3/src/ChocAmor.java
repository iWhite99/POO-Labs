public class ChocAmor extends CandyBox {
  float length;

  public ChocAmor() {
    super();
    this.length = 0;
  }

  public ChocAmor(String flavor, String origin, float length) {
    super(flavor, origin);
    this.length = length;
  }

  public void printChocAmorDim() {
    System.out.println(this.length);
  }

  @Override
  public float getVolume() {
    return this.length * this.length * this.length;
  }

  @Override
  public String toString() {
    return "The " + super.toString() + " has volume " + this.getVolume();
  }

  @Override
  public String check() {
    return "chocAmor";
  }
}
