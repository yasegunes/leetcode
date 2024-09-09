public class KelimeBulma {
    public int kelimebulma(String str, String kelime) {
        String metin = str.replace(".", "");
        String[] kelimeler = metin.split(" ");

        int count = 0;
        for (int i = 0; i < kelimeler.length; i++) {
            if (kelimeler[i].equals(kelime)) {
                count++;
            }
        }
        return count;
    }

}
