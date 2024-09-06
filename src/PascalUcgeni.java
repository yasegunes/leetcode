public class PascalUcgeni {
    public void pascalucgeni(int sayi) {
        int[][] pascal = new int[sayi][];
        for (int i = 0; i < sayi; i++) {
            for(int k = 1; k < sayi-i; k++){
                System.out.print(" ");
            }
            pascal[i] = new int[i+1];
            pascal[i][0] = 1;
            pascal[i][i] = 1;
            for(int j = 1; j < i; j++){
                pascal[i][j] = pascal[i-1][j-1] + pascal[i-1][j];
            }
            for (int num : pascal[i]) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}
