import java.util.Random;
import java.util.Scanner;
public class AmiralBatti {
    public int[][] HaritayıOlustur() {
        int arr[][] = new int[10][10];
        Random random = new Random();

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                arr[i][j] = 0;
            }
        }
        int gemiyeri1x = random.nextInt(7);
        int gemiyeri1y = random.nextInt(7);
        int yonelim1 = random.nextInt(2);

        if (yonelim1 == 1) {
            for (int i = 0; i < 4; i++) {
                arr[gemiyeri1x + i][gemiyeri1y] = 1;
            }
        } else {
            for (int i = 0; i < 4; i++) {
                arr[gemiyeri1x][gemiyeri1y + i] = 1;
            }
        }
        boolean placed = false;
        while (!placed) {
            int gemiyeri2x = random.nextInt(7);
            int gemiyeri2y = random.nextInt(7);
            int yonelim2 = random.nextInt(2);

            boolean canPlace = true;
            if (yonelim2 == 1) {
                for (int i = 0; i < 4; i++) {
                    if (arr[gemiyeri2x + i][gemiyeri2y] == 1) {
                        canPlace = false;
                        break;
                    }
                }
                if (canPlace) {
                    for (int i = 0; i < 4; i++) {
                        arr[gemiyeri2x + i][gemiyeri2y] = 1;
                    }
                    placed = true;
                }
            } else {
                for (int i = 0; i < 4; i++) {
                    if (arr[gemiyeri2x][gemiyeri2y + i] == 1) {
                        canPlace = false;
                        break;
                    }
                }
                if (canPlace) {
                    for (int i = 0; i < 4; i++) {
                        arr[gemiyeri2x][gemiyeri2y + i] = 1;
                    }
                    placed = true;
                }
            }

        }
        return arr;
    }

    public void ateset(int[][] arr){
        Scanner input = new Scanner(System.in);
        System.out.println("X koordinatını girin: ");
        int xcor = input.nextInt();
        System.out.println("Y koordinatını girin: ");
        int ycor = input.nextInt();
        if(arr[ycor][xcor]==1){
            arr[ycor][xcor]=9;
            System.out.println("Gemiyi vurdunuz");
        }
        else if(arr[ycor][xcor]==0){
            System.out.println("Gemiyi vuramadınız");
        }
        else {
            System.out.println("Geçersiz koordinat");
        }
    }
}
