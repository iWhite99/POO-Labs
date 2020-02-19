public class Complex {
  private int real;
  private int imaginary;
  public Complex (int real, int imaginary) {
    this.real = real;
    this.imaginary = imaginary;
  }
  
  public Complex () {
    this.real = 0;
    this.imaginary = 0;
  }

  public Complex(Complex number) {
    this.real = number.real;
    this.imaginary = number.imaginary;
  }

  public void setReal(int real) {
    this.real = real;
  }

  public void setImaginary(int imaginary) {
    this.imaginary = imaginary;
  }

  public void addWithComplex(Complex number) {
    this.real += number.real;
    this.imaginary += number.imaginary;
  }

  public void showNumber() {
    System.out.println(this.real + " + " + this.imaginary + "i");
  }

  public static void main(String[] args) {
    Complex a = new Complex(3, 4);
    a.showNumber();
  }
}
