public class Palindrome {

    public int palindrome(int sayi) {

        int uzunluk = 0;
        int sayi2 = sayi;

        for (int i = 1; i <= 100; i++) {
            sayi2 = sayi2 / 10;
            uzunluk++;
            if (sayi2 == 0) {
                break;
            } else {
                i++;
            }
        }
        int[] sayilar = new int[uzunluk];
        for (int i = 0; i < uzunluk; i++) {
            sayilar[i] = sayi % 10;
            sayi = sayi / 10;
        }


        for (int i = 0; i < uzunluk; i++) {
            if (sayilar[i] == sayilar[uzunluk - i - 1]) {
            } else return 0;
        }
        return 1;
    }
}
