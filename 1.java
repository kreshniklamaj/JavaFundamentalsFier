import java.util.Scanner;
class Main {
      public static void main(String[] args ) {
         Scanner scanner = new Scanner(System.in);
          System.out.println("Vendos diametrin e rrethit :" );
          float nr = scanner.nextFloat();
          double per = 2*Math.PI*nr/2;
          double sip = Math.PI*nr/2*nr/2;
          System.out.println("Perimetri i rrethit eshte :" + per);
          System.out.println("Siperfaqja e rrethit eshte :" + sip);

    }
}