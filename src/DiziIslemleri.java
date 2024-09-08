public class DiziIslemleri {
    public static void diziyiyazdir(int[] dizi){
        for (int num : dizi) {
            System.out.print(num + " ");
        }
    }
    public static int[] diziyisirala(int[] dizi){
        int degisken;
        for (int i = 0; i < dizi.length; i++) {
            for (int j = 0; j < dizi.length; j++) {
                if (dizi[i] > dizi[j]) {
                    degisken = dizi[i];
                    dizi[i] = dizi[j];
                    dizi[i] = degisken;
                }
                else {
                    degisken = dizi[j];
                    dizi[j] = dizi[i];
                    dizi[i] = degisken;

                }
            }
        }
        return dizi;
    }
    public static int[] diziyisadelestir(int[] dizi) {
        int boyut = dizi.length;
        int[] gecici = new int[boyut];
        int degisken = 0;
        boolean bulundu;

        for (int i = 0; i < dizi.length; i++) {
            bulundu = false;

            for (int j = 0; j < degisken; j++) {
                if (dizi[i] == gecici[j]) {
                    bulundu = true;
                    break;
                }
            }

            if (!bulundu) {
                gecici[degisken] = dizi[i];
                degisken++;
            }
        }


        int[] sonuc = new int[degisken];
        for (int i = 0; i < degisken; i++) {
            sonuc[i] = gecici[i];
        }

        return sonuc;
    }

}
