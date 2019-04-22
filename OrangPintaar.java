public class OrangPintaar {
  String nama = "Habibie";
  String profesi = "Teknisi";
  String pendidikan = "PhD";
  int jumlahBukuYangSudahDibaca = 10;
  int jumlahIlmuYangSudahDieksekusi= 10;
  int jumlahOrangYangSudahDiajari= 10;

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
    OrangPintaar habibie = new OrangPintaar();

    System.out.println("Jumlah Buku yang sudah dibaca : " + habibie.getJumlahBukuYangSudahDibaca());
    habibie.telahBacaBukuLain();
    System.out.println("Jumlah Buku yang sudah dibaca : " + habibie.getJumlahBukuYangSudahDibaca());


    System.out.println("Jumlah orang yang sudah diajari : " + habibie.getJumlahOrangYangSudahDiajari());
    habibie.mengajariOrangLain();
    System.out.printl n("Jumlah orang yang sudah diajari : " + habibie.getJumlahOrangYangSudahDiajari());


  }
}
