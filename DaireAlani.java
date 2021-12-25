import java.util.Scanner;
public class HelloWorld {

    public static void main(String[] args) {
       Scanner inp = new Scanner(System.in);
       double pi=3.14, r, a, sonuc;
       System.out.print("Yari capini giriniz: ");
       r = inp.nextDouble();
       System.out.print("Merkez acisini giriniz: ");
       a = inp.nextDouble();
       sonuc = (pi*(r*r)*a)/360;
       System.out.print("Alani: "+sonuc);

    }
}
