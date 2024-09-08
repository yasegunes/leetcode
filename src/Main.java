//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        /*Palindrome p1 = new Palindrome();
        System.out.println(p1.palindrome(8998));
        StarTree st1 = new StarTree();
        st1.starTree(5);


        ArmstrongNumbers a = new ArmstrongNumbers();
        System.out.println(a.isArmstrong(153));
        PascalUcgeni p2 = new PascalUcgeni();
        p2.pascalucgeni(6);
        FlattenArray f1 = new FlattenArray();
        int[][] array3 = {{1, 2, 3, 4, 5} , {6,8,4,2} , {9,6,7,8,1,2,30}};
        DiziIslemleri.diziyiyazdir(f1.flatten(array3));
        */
        MergeTwoSortedLists mt = new MergeTwoSortedLists();
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2= {2, 4, 6};
        int[] array3 = mt.mergeTwoSortedLists(array1, array2);
        DiziIslemleri.diziyiyazdir(array3);


    }



}