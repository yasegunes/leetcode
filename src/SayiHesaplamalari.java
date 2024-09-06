public class SayiHesaplamalari {

    public static int kacbasamakli(int sayi) {

        int uzunluk = 0;
        int sayii = sayi;

        for (int i = 1; i <= 100; i++) {
            sayii = sayii / 10;
            uzunluk++;
            if (sayii == 0) {
                break;
            } else {
                i++;
            }
        }
        return uzunluk;
    }

    public static int[] sayininbasamaklari(int sayi){
        int uzunluk = kacbasamakli(sayi);
        int[] sayilar = new int[uzunluk];
        for (int i = 0; i < uzunluk; i++) {
            sayilar[i] = sayi % 10;
            sayi = sayi / 10;
        }
        return sayilar;
    }
}
