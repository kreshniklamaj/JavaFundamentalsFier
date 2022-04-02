import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int num;
        double shuma = 0.0;
        System.out.println("Vendos nje numer: ");
        Scanner input = new Scanner(System.in);
        num = input.nextInt();
        while (num >0) {
            shuma = shuma + (double)1/num; //konverton ne double 1/num
            num --;
            }
        System.out.println("Shuma eshte: " + shuma);
        }
}