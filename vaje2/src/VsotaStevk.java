import java.util.Scanner;

public class VsotaStevk {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        System.out.print("Vnesite števko: ");
        int number = s.nextInt();
        int sum = 0;
        while(number>0){
            sum = sum + (number%10);
            number = number / 10;
        }

        System.out.println("Vsota števk v številu " + number + " je: " + sum);
    }
}
