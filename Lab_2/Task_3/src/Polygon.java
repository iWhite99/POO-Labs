public class Polygon {
  Point[] points;
  public Polygon(int n) {
    this.points = new Point[n];
    for (int i = 0; i < n; i++) {
      this.points[i] = new Point(0, 0);
    }
  }
  public Polygon(float[] array) {
    this(array.length / 2);
    int j = 0;
    for (int i = 0; i < array.length; i += 2) {
      this.points[j++].changeCoords(array[i], array[i + 1]);
    }
  }
}
