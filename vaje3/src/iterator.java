import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class iterator {

    public static void main(String[] args){
        ArrayList<Integer> userArray = new ArrayList<Integer>();
        Scanner s = new Scanner(System.in);

        while(true){
            System.out.println("Katero številko želite shraniti v array (napišite 0 za konec):");
            int stevilka = s.nextInt();
            if(stevilka == 0)   break;
            else userArray.add(stevilka);
        }

        Iterator<Integer> it = userArray.iterator();
        while(it.hasNext()){
            int vrednost = it.next();
            if (vrednost < 10) {
                it.remove();
            }

        }

        System.out.println("Nov array: ");
        for (Integer i : userArray) {
            System.out.println(i);
        }
        s.close();
    }
}
