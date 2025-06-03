import java.util.Scanner;

public class Palci {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Koliko palcev?");
        double palci = scanner.nextDouble();
        double metri = palci * 0.0254;
        double metriRounded = (double) Math.round(metri * 100) / 100;
        System.out.println("Toliko palcev: " + palci + " je toliko metrov: " + metriRounded);
        scanner.close();
    }
}
