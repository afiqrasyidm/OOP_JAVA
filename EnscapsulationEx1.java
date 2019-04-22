import java.util.Scanner;
public class EnscapsulationEx1 {

  public static void main(String[] args) {
    Pesawat garuda =  new Pesawat("Garuda",100 , 2018);
    System.out.println(garuda.kapasitasPenumpang);
    System.out.println(garuda.getJumlahPenerbangan());
    System.out.println(garuda.getTahunProduksiPublik());
  }
}

class Pesawat {
  String namaMaskapai;
  public int kapasitasPenumpang;
  private int jumlahPenerbangan;
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
  private int getTahunProduksi(){
    return tahunProduksi;
  }
  public int getTahunProduksiPublik(){
    getTahunProduksi();
  }
}
