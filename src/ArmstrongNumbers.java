public class ArmstrongNumbers {

    public int kacbasamakli(int sayi) {

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

    public int[] sayininbasamaklari(int sayi){
        int uzunluk = kacbasamakli(sayi);
        int[] sayilar = new int[uzunluk];
        for (int i = 0; i < uzunluk; i++) {
            sayilar[i] = sayi % 10;
            sayi = sayi / 10;
        }
        return sayilar;
    }

    public int isArmstrong(int sayi) {
        int uzunluk = kacbasamakli(sayi);
        int[] sayilar = sayininbasamaklari(sayi);
        double toplam = 0;
        for (int i = 0; i < uzunluk; i++) {
            toplam = toplam + Math.pow(sayilar[i],uzunluk);
        }
        if (toplam == sayi) {
            return 1;
        }
        else return 0;

    }

}
