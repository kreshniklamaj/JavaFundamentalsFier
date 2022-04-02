rgdhtjfhjfgjf
import java.util.Scanner;
public class ushtrim {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] array = new int[10];
        System.out.println("Vendos numrat: ");
        int k = 0;
        while(k < 10) {
            array[k] = in.nextInt();
            k++;
        }
            for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
            if (array[i] == array[j]) {
            System.out.print(array[j]+ " ");
                }
            }
        }
    }
}