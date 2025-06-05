import java.util.ArrayList;
import java.util.Scanner;

public class menjavaArrayList {
    public static void main(String[] args){
        ArrayList<String> userArray = new ArrayList<String>();
        Scanner s = new Scanner(System.in);

        int iFirst;
        int iSecond;
        while(true){

            System.out.println("Katero besedo želite shraniti v array (napišite 0 za konec):");
            String beseda = s.nextLine();

            if(beseda.equals("0"))   break;
            else userArray.add(beseda);
        }

        while(true){
            System.out.println("Napišite prvi indeks: ");
             iFirst = s.nextInt();
            System.out.println("Napišite drugi indeks: ");
             iSecond = s.nextInt();
            if(iFirst< userArray.size() && iSecond < userArray.size()){
                break;
            } else System.out.println("Indeksi niso primerni za ta Array. Ponovno morate vnesti indekse. ");
        }


        String temp1=userArray.get(iFirst);
        String temp2=userArray.get(iSecond);

        userArray.set(iFirst, temp2);
        userArray.set(iSecond, temp1);

        System.out.println("Zamenjali smo " + iFirst + " in " + iSecond + "elementa v Arrayu. Nov array je: ");

        for (String string : userArray) {
            System.out.println(string);
        }
        s.close();
    }

}
