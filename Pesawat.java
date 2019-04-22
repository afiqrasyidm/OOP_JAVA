import java.util.Scanner;
public class Pesawat {
  String namaMaskapai;
  int kapasitasPenumpang;
  int jumlahPenerbangan;
  int tahunProduksi;
  boolean masihLayakPakai;
  public Pesawat(String namaMaskapai,
                        int kapasitasPenumpang,
                        int tahunProduksi
                        ){
      this.namaMaskapai=namaMaskapai;
      this.kapasitasPenumpang = kapasitasPenumpang;
      this.tahunProduksi = tahunProduksi;
      this.masihLayakPakai= true;
      this.jumlahPenerbangan=0;
  }
  public boolean terbang(int kapasitasPenumpangTerbang){

    if(masihLayakPakai &&
      kapasitasPenumpang >= kapasitasPenumpangTerbang &&
       tahunProduksi > 2014
      ){
        this.jumlahPenerbangan++;
        if(jumlahPenerbangan > 5 ) {
          masihLayakPakai = false;
        }
        return true;
      }
    else{
      return false;
    }


  }
  public int getJumlahKapasitasPenumpang(){
    return kapasitasPenumpang;
  }
  public boolean getMasihLayakPakai(){
    return masihLayakPakai;
  }
  public int  getJumlahPenerbangan(){
    return jumlahPenerbangan;
  }
  public int getTahunProduksi(){
    return tahunProduksi;
  }


  public static void main(String[] args) {
      Scanner keyboard = new Scanner(System.in);
      System.out.print("Masukkan nama maskapai: ");
      String namaMaskapai = keyboard.nextLine();
      System.out.print("Masukkan kapasitas penumpang: ");
      int kapasitasPenumpang = keyboard.nextInt();
      System.out.print("Masukkan tahun produksi: ");
      int tahunProduksi = keyboard.nextInt();
      Pesawat pesawat = new Pesawat(namaMaskapai,kapasitasPenumpang,tahunProduksi);
      while(keyboard.hasNextLine()){
        System.out.println("Apakah pesawat akan terbang?(y/n)");
        if(keyboard.nextLine().equals("y")){
          System.out.print("Berapa penumpang akan terbang?");
          int kapasitasPenumpangTerbang = keyboard.nextInt();
          if(pesawat.terbang(kapasitasPenumpangTerbang)){
              System.out.println("Pesawat Terbang");
          }
          else{
            System.out.println("Pesawat Tidak Bole Terbang Lagi");
          }
        }

      }
  }
}
