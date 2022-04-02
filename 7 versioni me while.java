import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Vendosni nje numer");
        int nrPerdorues = sc.nextInt();
        int pozicioni = 1;
        int nrAktual = 1;
        int nrParaardhes = 0;
        int nrFib = 0;

        while(pozicioni < nrPerdorues) {
            nrFib = nrAktual + nrParaardhes;
            nrParaardhes = nrAktual;
            nrAktual = nrFib;
            pozicioni++;
            System.out.println(nrAktual);
        }

        System.out.println(nrFib);
    }
}