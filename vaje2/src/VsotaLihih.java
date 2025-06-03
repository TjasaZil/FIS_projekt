import java.util.Scanner;

public class VsotaLihih {

    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Vnesite poljubno naravno število: ");
        int number = s.nextInt();
        int vsotaLihih = 0;
        for(int i = 1; i<number; i++){
            if(i%2 !=0) vsotaLihih = vsotaLihih + i;
        }

        System.out.println("Vsota vseh lihih števil do števila " + number + " je: " + vsotaLihih);
    }
}
