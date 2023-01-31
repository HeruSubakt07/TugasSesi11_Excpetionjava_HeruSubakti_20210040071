//TugasSesi11_HeruSubakti
package Percobaan_3;

public class Exception_3_1 {
    public static void main(String[] args) {
        int bil = 10;
        try {
            System.out.println(bil / 0);
        } catch (ArithmeticException e) {
            System.out.println("Terjadi aritmatika error");
        } catch (Exception e) {
            System.out.println("Ini menghandle error yang terjadi");
        }
    }
}

