public class ArmstrongNumbers {





    public int isArmstrong(int sayi) {
        int uzunluk = SayiHesaplamalari.kacbasamakli(sayi);
        int[] sayilar = SayiHesaplamalari.sayininbasamaklari(sayi);
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
