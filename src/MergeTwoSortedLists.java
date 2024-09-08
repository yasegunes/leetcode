public class MergeTwoSortedLists {
    public int[] mergeTwoSortedLists(int[] A, int[] B) {
        int[] sonuc = new int[A.length + B.length];
        for (int i = 0; i < A.length; i++) {
            sonuc[i] = A[i];
        }
        for (int i = 0; i < B.length; i++) {
            sonuc[A.length + i] = B[i];

        }
        sonuc = DiziIslemleri.diziyisirala(sonuc);
        return sonuc;

    }
}
