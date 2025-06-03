import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        System.out.println("Vpišite prvo besedo: ");
        String first = s.nextLine();
        System.out.println("Vpišite druga besedo: ");
        String second = s.nextLine();

boolean anagram = false;
        if(first.length() == second.length()){
            char[] firstArray = first.toCharArray();
            char[] secondArray = second.toCharArray();
            Arrays.sort(firstArray);
            Arrays.sort(secondArray);

            for(int i = 0; i<firstArray.length; i++){
                if(firstArray[i] != secondArray[i]){

                    System.out.println("Besedi nista anagrama");
                    break;
                } else anagram = true;
            }
            if(anagram) System.out.println("Besedi sta anagram!");

        }
        else System.out.println("Besedi nista anagrama");
    }
}
