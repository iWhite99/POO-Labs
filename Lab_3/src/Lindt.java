public class Lindt extends CandyBox {
  private float length;
  private float width;
  private float height;

  public Lindt() {
    super();
    this.length = 0;
    this.width = 0;
    this.height = 0;
  }

  public Lindt(String flavor, String origin, float length, float width, float height) {
    super(flavor, origin);
    this.length = length;
    this.width = width;
    this.height = height;
  }

  public void printLindtDim() {
    System.out.println(this.length + " " + this.width + " " + this.height);
  }

  @Override
  public float getVolume() {
    return this.length * this.width * this.height;
  }

  @Override
  public String toString() {
    return "The " + super.toString() + " has volume " + this.getVolume();
  }

  @Override
  public String check() {
    return "lindt";
  }
}
