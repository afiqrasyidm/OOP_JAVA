class ArrayEx2{
    public static void main(String args[]){
      int ganjilArr[] = new int[50];
      int index_array_terakhir_disi = 0;
      for(int i = 1 ; i <= 100 ; i++)
      {
        if(i % 2 != 0){

          ganjilArr[index_array_terakhir_disi] = i;
          index_array_terakhir_disi++;
          System.out.println(i);
        }

      }
    }
}
