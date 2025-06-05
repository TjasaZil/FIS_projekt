import java.util.ArrayList;
import java.util.Scanner;

public class bubbleSort {
    public static void main(String[] args){
        ArrayList<Integer> userArray = new ArrayList<Integer>();
        Scanner s = new Scanner(System.in);
        boolean swapped;
        int temp;

        while(true){
            System.out.println("Katero številko želite shraniti v array (napišite 0 za konec):");
            int stevilka = s.nextInt();

            if(stevilka == 0)   break;
            else userArray.add(stevilka);
        }


        for(int i = 0; i<userArray.size()-1; i++){
            swapped = false;
            for(int j=0; j<userArray.size()-1-i; j++){
                if(userArray.get(j)>userArray.get(j+1)){
                    temp = userArray.get(j);
                    userArray.set(j, userArray.get(j+1));
                    userArray.set(j+1, temp);
                    swapped=true;
                }
            }
            if(!swapped) break;
        }
        System.out.println("Sortiran array: ");
        for (Integer i : userArray) {
            System.out.println(i);
        }

        s.close();
    }
}
