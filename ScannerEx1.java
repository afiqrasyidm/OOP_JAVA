import java.util.Scanner;
class ScannerEx1{
    public static void main(String args[]){
      Scanner keyboard = new Scanner(System.in);
      System.out.print("Masukkan String: ");
      String str_user = keyboard.nextLine();
      char[] str_user_arr = new char[str_user.length()];
      for(int i = 0 ; i < str_user.length()-1 ; i++)
      {
        str_user_arr[i] = str_user.charAt(i);
        System.out.println(str_user_arr[i]);
      }


    }


}
