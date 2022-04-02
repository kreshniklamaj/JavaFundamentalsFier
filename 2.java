import java.util.Scanner;
class Main {
      public static void main(String[] args ) {
         Scanner scanner = new Scanner(System.in);
          System.out.println("Vendos peshen:" );
          float pesha = scanner.nextFloat();
          System.out.println("Vendos gjatesine ne meter:" );
          int gjat = scanner.nextInt();
          float gjat2 = gjat*0.01f;
          double bmi = pesha/Math.pow (gjat2, 2);
          System.out.println("BMI: " + bmi);
          if (bmi >= 18.5 && bmi<=24.9) {
              System.out.println("Juve keni peshen optimale...bravo...");
          }
          else {
              System.out.println("Nuk jeni ne peshen optimale :(");
          }
    }
}