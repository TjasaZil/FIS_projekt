import java.util.Scanner;

public class palindrom {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        System.out.println("Vpišite besedo: ");
        String beseda = s.nextLine();
        String obrnjena = "";
        for(int i = beseda.length()-1; i >= 0; i--){
            obrnjena +=  beseda.charAt(i);
        }
if(beseda.equals(obrnjena)){
    System.out.println("Beseda je palindrom");
} else  System.out.println("Beseda ni palindrom");

s.close();
    }
}
