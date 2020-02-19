public class Area {
  CandyBag candyBag;
  int number;
  String street;

  public Area() {
    this.candyBag = new CandyBag();
    this.number = 0;
    this.street = "";
  }

  public Area(CandyBag candyBag, int number, String street) {
    this.candyBag = candyBag;
    this.number = number;
    this.street = street;
  }

  public void getBirthdayCard() {
    System.out.println(this.number + " " + this.street);
    System.out.println("la multi ani");
    for (CandyBox candyBox : candyBag.candyBoxes) {
      System.out.println(candyBox.toString());
      if (candyBox.check().equals("baravelli")) {
        Baravelli baravelli = (Baravelli) candyBox;
        baravelli.printBaravelliDim();
      }
      if (candyBox.check().equals("lindt")) {
        Lindt lindt = (Lindt) candyBox;
        lindt.printLindtDim();
      }
      if (candyBox.check().equals("chocAmor")) {
        ChocAmor chocAmor = (ChocAmor) candyBox;
        chocAmor.printChocAmorDim();
      }
    }
  }
}
