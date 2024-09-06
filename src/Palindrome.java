public class Palindrome {

    public int palindrome(int sayi) {

        int uzunluk = SayiHesaplamalari.kacbasamakli(sayi);
        int[] sayilar = SayiHesaplamalari.sayininbasamaklari(sayi);
        for (int i = 0; i < uzunluk; i++) {
            if (sayilar[i] == sayilar[uzunluk - i - 1]) {
            } else return 0;
        }
        return 1;
    }
}
