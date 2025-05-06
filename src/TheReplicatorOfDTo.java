import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class TheReplicatorOfDTo {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);

        int[] array1 = new int[5];
        int[] array2 = new int[5];
        int i = 0;
        while (i < array1.length){
            array1[i] = myObj.nextInt();
            i++;
        }
        System.out.println(Arrays.toString(array1));
        i = 0;
        while (i < array2.length){
         array1[i] =array2[i];
         i++;
            System.out.println(Arrays.toString(array2));

        }
        System.out.println(Arrays.toString(array2));
    }
}
