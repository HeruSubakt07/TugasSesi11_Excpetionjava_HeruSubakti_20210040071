//TugasSesi11_HeruSubakti
package Percobaan_3;

public class ExceptionBenar_3 {
   public static void main(String[] args) {
        int bil=10;
        try {
            System.out.println(bil/0);
        } catch (Exception e) {
            System.out.println("Ini menghandle error yang terjadi");
        }
    }
}  

