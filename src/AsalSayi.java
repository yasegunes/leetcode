import java.util.Arrays;
public class AsalSayi {
    public boolean asalSayimi(int sayi){
        if(sayi<=1){
            return false;
        }
        for (int i = 2; i <= Math.sqrt(sayi); i++) {
            if(sayi%i==0){
                return false;
            }
        }
        return true;
    }

    public int kacinciasal(int num){
        int asal [] = new int[num];
        int degisken = 0;
        for(int i = 2 ; i < 1000 ; i++){
            if(asalSayimi(i)){
                asal[degisken] = i;
                degisken++;
            }
            if(degisken == num){
                break;
            }
        }
        return asal[num-1];
    }

    public void eratostheneselegi(int num){
        boolean[] asalmi = new boolean[num+1];
        Arrays.fill(asalmi, true); // Başlangıçta tüm sayıları asal kabul ediyoruz
        asalmi[0] = false; // 0 asal değil
        asalmi[1] = false;
        for(int i = 2; i * i <= num; i++){
            if(asalSayimi(i)){
                for (int j = i * i; j <= num; j += i) {
                    asalmi[j] = false;
                }
            }
        }
        System.out.println(num + "'e kadar olan asal sayılar:");
        for (int i = 2; i <= num; i++) {
            if (asalmi[i]) {
                System.out.print(i + " ");
            }
        }
    }

}
