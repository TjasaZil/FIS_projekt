import java.util.Scanner;

public class SteviloVIntervalu {

    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Vpišite začetek intervala");
        int zacetek = s.nextInt();
        System.out.println("Vpišite konec intervala");
        int konec = s.nextInt();
        System.out.println("Vpišite deljitelja");
        int deljitelj = s.nextInt();

        int stevilo = 0;

        for(int i = zacetek; i<konec; i++){
            if(i % deljitelj == 0) stevilo ++;
        }

        System.out.println("Na intervalu števil med " + zacetek + " in " + konec + " je s številom " + deljitelj + " deljivo " + stevilo + " števil");

    }
}
