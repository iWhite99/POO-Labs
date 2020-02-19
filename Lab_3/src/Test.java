import java.util.ArrayList;

public class Test {
  public static void main(String[] args) {
    CandyBag candyBag = new CandyBag();
    candyBag.candyBoxes = new ArrayList<CandyBox>();

    Lindt lindt = new Lindt("vanilla", "romania", 1, 2, 3);
    Baravelli baravelli = new Baravelli("chocolate", "germany", 1, 2);
    ChocAmor chocAmor = new ChocAmor("hazelnut", "denmark", 2);

    candyBag.candyBoxes.add((CandyBox) lindt);
    candyBag.candyBoxes.add((CandyBox) baravelli);
    candyBag.candyBoxes.add((CandyBox) chocAmor);

    Area area = new Area(candyBag, 28, "Bd. Dunarea");
    area.getBirthdayCard();
  }
}
