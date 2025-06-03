import java.util.Scanner;

public class KvadratneEnacbe {

    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vpisite prvo vrednost: ");
        double a = scanner.nextDouble();
        System.out.println("Vpisite drugo vrednost: ");
        double b = scanner.nextDouble();
        System.out.println("Vpisite tretjo vrednost: ");
        double c = scanner.nextDouble();

        if(b*b-4*a*c<0.0){
            System.out.println("Rešitve so imaginarne");
        }else{
            double x1 = ((-1)*b + Math.sqrt(b*b-4*a*c))/(2*a);
            double x2 = ((-1)*b - Math.sqrt(b*b-4*a*c))/(2*a);
            System.out.println("Resitev 1: " + x1 + " Resitev 2: " + x2);
        }

    }
}
