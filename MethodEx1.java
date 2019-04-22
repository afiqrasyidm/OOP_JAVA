import java.util.Scanner;
public class MethodEx1 {
  //isi method ini dengan mengecek apakah String mengandung Pintaar atau tidak,
  //jika iya balikkan true, jika tidak balikkan false
  static boolean cekMengandungPintaar(String str) {
    return true;
  }
  //isi method ini mengambil String setelah huruf Pintaar, contoh "PintaarJava" kembalikan "Java"
  static String ambilStringSetelahPintaar(String str) {
    return "";
  }
  //isi method ini dengan menghitung banyak huruf vokal dari sebuah string
  static int hitungHurufVokal(String str) {
      return 0;
  }

  public static void main(String[] args) {
      Scanner keyboard = new Scanner(System.in);
      System.out.print("Masukkan String: ");
      String str = keyboard.nextLine();

      if(cekMengandungPintaar(str)){
        str = ambilStringSetelahPintaar(str);
        System.out.println("Jumlah Huruf Vokal yang ada: "+ hitungHurufVokal(str));
      }
      else{
        System.out.println("String tidak mengandung Pintaar");
      }
  }
}
