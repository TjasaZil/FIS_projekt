import java.util.Scanner;

public class PrestopnoLeto {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Prosim vpišite letnico: ");
        int leto = scanner.nextInt();

        System.out.print("Prosim vpišite številko meseca (1-12): ");
        int mesec = scanner.nextInt();

        boolean prestopno = false;

        //preveri ali je leto prestopno
        if (leto % 400 == 0 || ((leto % 100 != 0) && (leto % 4 == 0))){
            prestopno = true;
        }

        int steviloDni;

        switch (mesec) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12: //meseci z 31 dnevi
                steviloDni = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11: // meseci s 30 dnevi
                steviloDni = 30;
                break;
            case 2: //februar odvisen od tega če je prestopno
                steviloDni = prestopno ? 29 : 28;
                break;
            default:
                System.out.println("Napaka: mesec mora biti število med 1 in 12.");
                return;
        }

        System.out.println("Leto " + leto + (prestopno ? " (prestopno)" : " (neprestopno)") +
                ", mesec " + mesec + " ima " + steviloDni + " dni.");

        scanner.close();
    }
}
