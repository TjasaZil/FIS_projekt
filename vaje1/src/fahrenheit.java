import java.util.Scanner;
public class fahrenheit {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write temperature in Fahrenheit");
        double fahrenheit = scanner.nextDouble();
        double celsius = (fahrenheit-32.0)*5.0/9.0;
        double celsiusRounded = (double) Math.round(celsius * 100) / 100;
        System.out.println("Fahrenheit: " + fahrenheit + " Celsius: " + celsiusRounded);

        scanner.close();
    }
}
