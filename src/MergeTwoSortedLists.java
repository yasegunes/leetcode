public class MergeTwoSortedLists {
    public int[] mergeTwoSortedLists(int[] A, int[] B) {
        int[] sonuc = new int[A.length + B.length];
        for (int i = 0; i < A.length; i++) {
            sonuc[i] = A[i];
        }
        for (int i = 0; i < B.length; i++) {
            sonuc[A.length + i] = B[i];

        }
        int degisken;
        for (int i = 0; i < sonuc.length; i++) {
            for (int j = 0; j < sonuc.length; j++) {
                if (sonuc[i] > sonuc[j]) {
                    degisken = sonuc[i];
                    sonuc[i] = sonuc[j];
                    sonuc[i] = degisken;
                }
                else {
                    degisken = sonuc[j];
                    sonuc[j] = sonuc[i];
                    sonuc[i] = degisken;

                }
            }
        }
        return sonuc;

    }
}
