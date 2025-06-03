import java.util.Scanner;

public class ObrneBesedo {

    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        System.out.println("Vpišite besedo: ");
        String beseda = s.nextLine();
        String obrnjena = "";
        for(int i = beseda.length()-1; i >= 0; i--){
          obrnjena +=  beseda.charAt(i);
        }

        System.out.println("Obrnjena beseda je: " + obrnjena);
        s.close();
    }
}
