import java.util.Scanner;
class ScannerEx2{
    public static void main(String args[]){
      Scanner keyboard = new Scanner(System.in);
      System.out.print("Masukkan Range Pertama: ");
      int range_pertama = keyboard.nextInt();

      System.out.print("Masukkan Range Kedua: ");
      int range_kedua = keyboard.nextInt();

      int ganjilArr[] = new int[(range_kedua/2) + 1];
      int index_array_terakhir_disi = 0;
      for(int i = range_pertama ; i <= range_kedua ; i++)
      {
        if(i % 2 != 0){

          ganjilArr[index_array_terakhir_disi] = i;
          index_array_terakhir_disi++;
          System.out.println(i);
        }

      }


    }


}
