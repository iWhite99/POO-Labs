import java.util.Objects;

public class CandyBox {
  private String flavor;
  private String origin;

  public CandyBox() {
    this.flavor = "";
    this.origin = "";
  }

  public CandyBox(String flavor, String origin) {
    this.flavor = flavor;
    this.origin = origin;
  }

  public float getVolume() {
    return 0;
  }

  public String check() {
    return "candybox";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof CandyBox)) return false;
    CandyBox candyBox = (CandyBox) o;
    return flavor.equals(candyBox.flavor) &&
            origin.equals(candyBox.origin);
  }

  @Override
  public String toString() {
    return this.origin + " " + this.flavor;
  }
}
