public class Main {
  public static void main (String[] args) {
    float[] array = new float[4];
    array[0] = 3;
    array[1] = 4;
    array[2] = 1;
    array[3] = 2;
    Polygon polygon = new Polygon(array);
    for (int i = 0; i < polygon.points.length; i++) {
      polygon.points[i].printPoint();
    }
  }
}
