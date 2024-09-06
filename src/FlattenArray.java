public class FlattenArray {
    public int[] flatten(int[][] arr) {
        int boyut =0;
        for (int i = 0; i < arr.length; i++) {
            boyut = boyut + arr[i].length;
        }
        int[] res = new int[boyut];
        int eleman = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                res[eleman] = arr[i][j];
                eleman++;
            }
        }
        return res;
    }
}
