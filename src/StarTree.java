public class StarTree {
    public void starTree (int sayi){
        for(int i = 0; i < sayi; i++){
            for(int k = 1; k < sayi-i; k++){
                System.out.print(" ");
            }
            for(int j = 0; j <=(i*2); j++){

                System.out.print("*");
            }
            System.out.println();

        }
    }
}
