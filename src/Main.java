import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        //Değişkenleri belirleyelim.
        double pi=3.14, r, aci, alan;

        //Kullanıcıdan veri alalım.
        Scanner input = new Scanner(System.in);
        System.out.print("Dairenin yarıçapını giriniz: ");
        r = input.nextDouble();
        System.out.print("Merkez açısı ölçüsünü giriniz: ");
        aci= input.nextDouble();

        //Hesaplama formülünü girelim.
        alan = (pi * (r*r) * aci)/360;

        //Kullanıcıya sonucu iletelim.
        System.out.print("Daire diliminin alanı: " +alan);


    }
}