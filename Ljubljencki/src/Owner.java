import java.util.ArrayList;
import java.util.List;

public class Owner {

    private String name;
    private List<Pet> pets = new ArrayList<>();

    public Owner(){
    }
    public Owner(String name, List<Pet> pets){
        this.name = name;
        this.pets = pets;
    }
    public Owner(String name){
        this.name = name;
        this.pets = new ArrayList<>();
    }

    //getterji
    public String getName(){ return this.name;}
    public List<Pet> getPetList(){ return this.pets;}

    //setterji
    public void setName(String newName){
        this.name = newName;
    }
    public void setPetList(List<Pet> newPetList){
        this.pets = newPetList;
    }

    //metode
    public void addPet(Pet pet){
        pets.add(pet);
    }

    public void requestService(Pet pet, Service service){
        pet.reciveService(service);
    }

    public String toString(){
        String besedilo = "";
        besedilo =  "Owner: " + name;

        for(Pet pet: pets){
            besedilo += pet.toString();
        }

        return besedilo;
    }
}
