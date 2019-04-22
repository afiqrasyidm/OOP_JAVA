
public class InterfaceExample {

  public static void main(String[] args) {
    //jangan lupa isi disini
  }
}
interface Kendaraan {
   public boolean jalan(int kapasitasPenumpangTerbang);
}
class Mobil implements Kendaraan {
  String namaMobil;
  boolean masihLayak;

  public Mobil(String namaMobil, boolean masihLayak){
    this.namaMobil = namaMobil;
    this.masihLayak = masihLayak;
  }
  public boolean jalan(int kapasitasPenumpangTerbang){
    return true;
  }
}

class Pesawat implements Kendaraan{
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
  public boolean jalan(int kapasitasPenumpangTerbang){

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

  public boolean isMasihLayak(){
    return masihLayakPakai;
  }

}
