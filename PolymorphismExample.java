public class PolymorphismExample {

  public static void main(String[] args) {
    //jangan lupa isi disini
  }
}

class Hewan {
  public void animalSound() {
    System.out.println("Hewan Bersuara seperti hewan");
  }
}

class Kucing extends Hewan {
  public void animalSound() {
    System.out.println("Kucing bersuara seperti meow");
  }
}

class Anjing extends Hewan {
  public void animalSound() {
    System.out.println("Anjing bersuara seperti guk guk");
  }
}
