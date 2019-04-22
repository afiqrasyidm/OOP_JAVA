import java.util.Scanner;
public class PesawatJet extends Pesawat {
  String jenisJet;
  String mesinJet;

  public PesawatJet(String namaMaskapai,
                        int kapasitasPenumpang,
                        int tahunProduksi,
                        String jenisJet,
                        String mesinJet
                      ){
    //menghidupkan super class
     super(namaMaskapai,kapasitasPenumpang,
                           tahunProduksi);
     this.jenisJet = jenisJet;
     this.mesinJet = mesinJet;
  }
  public String getJenisJet(){
    return jenisJet;
  }
  public String getMesinJet(){
    return mesinJet;
  }

  public static void main(String[] args) {
    PesawatJet jet = new PesawatJet("Garuda", 100, 2015, "Jet A", "Mesin Jet A");

    if(jet.terbang(200)){
      System.out.println("Pesawat " + jet.getJenisJet()+ " Bisa Terbang");
    }  else{
      System.out.println("Pesawat " + jet.getJenisJet()+ " Tidak Bisa Terbang");
    }
  }
}
class Pesawat{
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

}
