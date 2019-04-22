class ArrayEx3{
    public static void main(String args[]){

      int arrayInteger[] = {23,10,8,19};
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
