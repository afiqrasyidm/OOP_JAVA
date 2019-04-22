public class OrangPintaar2 {
  String nama;
  String profesi;
  String pendidikan;
  int jumlahBukuYangSudahDibaca;
  int jumlahIlmuYangSudahDieksekusi;
  int jumlahOrangYangSudahDiajari;
  public OrangPintaar2(String nama, String profesi,
                        int jumlahBukuYangSudahDibaca,
                        int jumlahOrangYangSudahDiajari,
                        int jumlahIlmuYangSudahDieksekusi){
      this.nama=nama;
      this.profesi= profesi ;
      this.jumlahBukuYangSudahDibaca = jumlahBukuYangSudahDibaca;
      this.jumlahOrangYangSudahDiajari= jumlahOrangYangSudahDiajari;
      this.jumlahIlmuYangSudahDieksekusi = jumlahIlmuYangSudahDieksekusi;
  }
  public void telahBacaBukuLain(){
    jumlahBukuYangSudahDibaca++;
  }
  public void eksekusiIlmuBaru(){
    jumlahIlmuYangSudahDieksekusi++;
  }
  public void mengajariOrangLain(){
    jumlahOrangYangSudahDiajari++;
  }
  public int getJumlahBukuYangSudahDibaca(){
    return jumlahBukuYangSudahDibaca;
  }
  public int getJumlahIlmuYangSudahDieksekusi(){
    return jumlahIlmuYangSudahDieksekusi;
  }
  public int getJumlahOrangYangSudahDiajari(){
    return jumlahOrangYangSudahDiajari;
  }


  public static void main(String[] args) {
    OrangPintaar2 andi = new OrangPintaar2("andi", "mahasiswa", 100, 50 , 40);

    System.out.println("Jumlah Buku yang sudah dibaca : " + andi.getJumlahBukuYangSudahDibaca());
    andi.telahBacaBukuLain();
    System.out.println("Jumlah Buku yang sudah dibaca : " + andi.getJumlahBukuYangSudahDibaca());


    System.out.println("Jumlah orang yang sudah diajari : " + andi.getJumlahOrangYangSudahDiajari());
    andi.mengajariOrangLain();
    System.out.println("Jumlah orang yang sudah diajari : " + andi.getJumlahOrangYangSudahDiajari());


  }
}
