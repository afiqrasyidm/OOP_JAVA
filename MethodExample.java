public class MethodExample {
  //tanpa paramater
  static void contohMethod1() {
    System.out.println("contoh Method Satu Jalan");
  }
  //dengan paramater
  static void contohMethod2(String string_paramter_satu, String string_paramter_dua) {
    System.out.println("contoh Method Dua Jalan dengan paramater, satu:  " + string_paramter_satu +" dua: " +  string_paramter_dua);
  }
  //memanggil method lain
  static void contohMethod3() {
    System.out.println("contoh Method Tiga Jalan");
    contohMethod1();
    contohMethod2("satu", "dua");
  }

  //method dengan proses panjang

  static void contohMethod4() {
    System.out.println("contoh Method Empat Jalan");

    int arrayInteger[] = {23,10,8,19};
    int maximumInteger = arrayInteger[0];
    int minimumInteger = arrayInteger[0];
    for(int i = 0 ;  i < arrayInteger.length-1; i++){

      if(arrayInteger[i] > maximumInteger){
        maximumInteger = arrayInteger[i];
      }

      if(arrayInteger[i] < minimumInteger){
          minimumInteger = arrayInteger[i];
      }
    }
    System.out.println("Nilai terbesar adalah: " + maximumInteger);
    System.out.println("Nilai terkecil adalah: " + minimumInteger);

  }

  //method dengan return type

  public static boolean contohMethod5(int angka){
    if(angka % 2  == 0){
      return true;
    }
    else{
      return false;
    }

  }
  public static void main(String[] args) {
    contohMethod1();
    contohMethod2("satu", "dua");
    contohMethod3();
    contohMethod4();
    int angka_proses = 10;
    boolean isGenap = contohMethod5(angka_proses);

    if(isGenap){
      System.out.println("Angka "+angka_proses+" adalah angka genap");
    }

  }
}
