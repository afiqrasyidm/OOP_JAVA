
public class AbstractInterfaceEx {

  public static void main(String[] args) {
    //jangan lupa isi disini
  }
}
interface Mesin {
   public void turunKanDayaTahan();
   public void perbaikiMesin();
}
abstract class Pesawat implements Mesin {
  public String namaPesawat;
  int kapasitasPenumpang;
  int dayaTahan;
   public Pesawat(String namaPesawat,int kapasitasPenumpang, int dayaTahan){
     this.namaPesawat = namaPesawat;
     this.kapasitasPenumpang = kapasitasPenumpang;
     this.dayaTahan = dayaTahan;

  }
  //jika sekali jalan maka tidak layak pakai lagi
   public boolean terbang(int kapasitasPenumpangTerbang){
     if( kapasitasPenumpang >= kapasitasPenumpangTerbang){
      turunKanDayaTahan();
       return true;
     }
     else{
       return false;
     }
   }

}
class PesawatJet extends Pesawat{

  String instansiPemilik;
  public PesawatJet(String namaPesawat,int kapasitasPenumpang, int dayaTahan, String instansiPemilik){
    super(namaPesawat, kapasitasPenumpang, dayaTahan );
    this.instansiPemilik = instansiPemilik;
  }
  public void turunKanDayaTahan(){
    dayaTahan = dayaTahan -2;
  }
  public void perbaikiMesin(){
    dayaTahan = dayaTahan + 3;
  }


}

class PesawatPenumpang extends Pesawat{

  String namaMaskapai;

  public PesawatPenumpang(String namaPesawat,int kapasitasPenumpang, int dayaTahan, String namaMaskapai){
    super(namaPesawat, kapasitasPenumpang, dayaTahan );
    this.namaMaskapai = namaMaskapai;

  }
  public void turunKanDayaTahan(){
    dayaTahan = dayaTahan -5;
  }
  public void perbaikiMesin(){
    dayaTahan = dayaTahan + 10;
  }

}
