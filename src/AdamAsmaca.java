import java.util.Scanner;
import java.util.Arrays;
public class AdamAsmaca {
    public void AdamAsmaca(String str) {
        char[] oyunkelimesi = str.toCharArray();
        char[] oyuntablosu = new char[oyunkelimesi.length];
        for (int i = 0; i < oyunkelimesi.length; i++) {
            if (oyunkelimesi[i] == ' ') {
                oyuntablosu[i] = ' ';
            } else {
                oyuntablosu[i] = '*';
            }
        }

        int denemesayisi = oyunkelimesi.length * 2;
        boolean oyunbitti = false;

        Scanner sc = new Scanner(System.in);
        while (!oyunbitti && denemesayisi > 0) {
            System.out.println("Kelime: " + new String(oyuntablosu));
            System.out.print("Bir karakter girin: ");
            char karakter = sc.next().charAt(0);
            boolean bulundu = false;
            for (int i = 0; i < oyunkelimesi.length; i++) {
                if (oyunkelimesi[i] == karakter) {
                    oyuntablosu[i] = karakter;
                    System.out.println("Tebrikler!");
                    bulundu = true;
                }
            }
            if (!bulundu) {
                denemesayisi--;
                System.out.println("Yanlış tahmin! Kalan deneme sayısı: " + denemesayisi);

            }
            if (Arrays.equals(oyunkelimesi, oyuntablosu)) {
                oyunbitti = true;
                System.out.println("Tebrikler! Kelimeyi buldunuz: " + str);
            }


        }
        if (!oyunbitti) {
            System.out.println("Kaybettiniz! Kelime: " + str);
        }
    }
}
