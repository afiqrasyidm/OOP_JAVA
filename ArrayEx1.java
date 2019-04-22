class ArrayEx1{
    public static void main(String args[]){
      String pintaar = "Pintaar";
      char[] pintaar_arr = new char[7];
      for(int i = 0 ; i < pintaar.length()-1 ; i++)
      {
        pintaar_arr[i] = pintaar.charAt(i);
      }

      //solusi lain bisa menggunakan method char[] pintaar_arr = pintaar.toCharArray();
    }


}
