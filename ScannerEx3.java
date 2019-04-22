import java.util.Scanner;
class ScannerEx3{
    public static void main(String args[]){
      Scanner keyboard = new Scanner(System.in);
      System.out.print("Masukkan Jumlah Array: ");
      int jumlahArray = keyboard.nextInt();

      int arrayInteger[] = new int[jumlahArray];

      for(int i = 0 ; i < jumlahArray ; i++){
        System.out.print("Masukkan Value Ke "+i +" :");
        arrayInteger[i] = keyboard.nextInt();
      }


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


}
