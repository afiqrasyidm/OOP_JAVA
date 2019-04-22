// mengimpor Scanner ke program
import java.util.Scanner;
class ScannerExample{
    public static void main(String args[]){
      // membuat scanner baru
      Scanner keyboard = new Scanner(System.in);
      //print output dengan satu line penuh
      System.out.println(keyboard.nextLine());
      //print output dengan satu line penuh
      System.out.println(keyboard.nextLine());
      //print output dengan satu kata saja
      System.out.println(keyboard.next());
      //print output dengan satu kata saja
      System.out.println(keyboard.next());
      //dengan perintah
      System.out.print("Alamat: ");
      // menggunakan scanner lagi
      String alamat = keyboard.next();
      System.out.println("Alamat: kamu adalah "+ alamat);

       //dengan perintah dan ambil valid jika integer saja
       System.out.print("Usia: ");
       int usia = keyboard.nextInt();
       System.out.println("Usia: kamu adalah "+ usia);

    }
}
