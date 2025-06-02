import java.util.Scanner;

public class bodymassindex {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Vnesite svojo višino v centimetrih:");
        double visina = scanner.nextDouble()/100;
        System.out.println("Vnesite težo v kilogramih.");
        double teza = scanner.nextDouble();

        double bmi = teza/(visina*visina);
        double bmiRounded = (double) Math.round(bmi*100)/100;
        System.out.println("Za težo: " + teza + " in višino: " + visina + " Je vaš BMI: " + bmiRounded);
        scanner.close();
    }


}
