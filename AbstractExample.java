public class AbstractExample {

  public static void main(String[] args) {
    //jangan lupa isi disini
  }
}
abstract class Kendaraan {
  boolean masihLayak;
  int kapasitasPenumpang;
   public Kendaraan(int kapasitasPenumpang){
     this.kapasitasPenumpang = kapasitasPenumpang;
     masihLayak = true;
  }
  //jika sekali jalan maka tidak layak pakai lagi
   public boolean jalan(int kapasitasPenumpangTerbang){
     if( kapasitasPenumpang >= kapasitasPenumpangTerbang){
       masihLayak = false;
       return true;
     }
     else{
       return false;
     }
   }
   public boolean getMasihLayakPakai(){
     return masihLayak;
   }
}
class Mobil extends Kendaraan {
  String namaMobil;
  boolean masihLayak;

  public Mobil(String namaMobil, boolean masihLayak, int kapasitasPenumpang){
    super(kapasitasPenumpang);
    this.namaMobil = namaMobil;
    this.masihLayak = masihLayak;
  }
  public String getNamaMobil(){
    return namaMobil;
  }
}

class Pesawat extends Kendaraan{
   String namaMaskapai;
   int jumlahPenerbangan;
   int tahunProduksi;
   boolean masihLayakPakai;
  public Pesawat(String namaMaskapai,
                        int tahunProduksi,int kapasitasPenumpang
                        ){
      super(kapasitasPenumpang);
      this.namaMaskapai=namaMaskapai;
      this.tahunProduksi = tahunProduksi;
      this.masihLayakPakai= true;
      this.jumlahPenerbangan=0;
  }

  public int getJumlahPenerbangan(){
    return jumlahPenerbangan;
  }
}
