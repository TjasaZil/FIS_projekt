import java.util.ArrayList;
import java.util.Scanner;

public class PovprecjeDecimalkArrayList {

    public static void main(String[] args){
        ArrayList<Double> userArray = new ArrayList<Double>();
        Scanner s = new Scanner(System.in);


        while(true){
            System.out.println("Katero decimalno številko želite shraniti v array (napišite 0 za konec):");
            double stevilka = s.nextDouble();
            if(stevilka == 0)   break;
            else userArray.add(stevilka);
        }

        //izpiše
        userArray.sort(null);
        System.out.println("Tukaj je vaš arrayList presortiran po vrsti: ");
        for(int i = 0; i<userArray.size(); i++){
            System.out.println(userArray.get(i));
        }
        //povprecje
        double sum = 0.0;
        for(int i = 0; i<userArray.size(); i++){
            sum += userArray.get(i);
        }
        double avg = sum/userArray.size();

        //mediana
        double mediana=0;

        if(userArray.size() % 2 != 0) mediana = userArray.get(userArray.size()/2);
        else
            mediana = (userArray.get(userArray.size()/2) + userArray.get((userArray.size()/2)-1)) /2;


        System.out.println("Povprečna vrednost elementa v ArrayListu je: " + avg);
        System.out.println("Mediana v ArrayListu je: " + mediana);
        s.close();
    }
}
