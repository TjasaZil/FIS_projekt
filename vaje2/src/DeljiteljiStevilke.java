import java.util.Scanner;

public class DeljiteljiStevilke {

    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        System.out.println("Vnesite poljubno številko: ");
        int number = s.nextInt();

        for(int i = 1; i<=number/2; i++ ){
            if(number % i == 0) System.out.println(i + " je deljitelj");
        }

        s.close();
    }
}
