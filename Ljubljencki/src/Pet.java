import java.util.ArrayList;
import java.util.List;

public class Pet {

    private String name;
    private String species;
    private int age;
    private List<Service> serviceHistory = new ArrayList<>();

    public Pet(){};
    public Pet(String name, String species, Integer age, List<Service> serviceHistory){
        this.name = name;
        this.species = species;
        this.age=age;
        this.serviceHistory=serviceHistory;
    }
    public Pet(String name, String species, Integer age){
        this.name = name;
        this.species = species;
        this.age=age;
        this.serviceHistory = new ArrayList<>();
    }

    //getterji
    public String getName(){
        return this.name;
    }
    public String getSpecies(){
        return this.species;
    }
    public Integer getAge(){
        return this.age;
    }
    public List<Service> getService(){
    return this.serviceHistory;
    }

    //setterji
    public void setName(String name){
        this.name = name;
    }
    public void setSpecies(String species){
        this.species = species;
    }
    public void setAge(Integer age){
        this.age = age;
    }
    public void setServiceHistory(List<Service> serviceHistory){
        this.serviceHistory=serviceHistory;
    }

    //methods
    public void reciveService(Service service){
        serviceHistory.add(service);
    }

    public String toString(){
        String besedilo = "";
        besedilo +=  "Name: " + name;
        besedilo +=  "Species: " + species;
        besedilo +=  "Age: " + age;

        for(Service service: serviceHistory){
            besedilo += serviceHistory.toString();
        }

        return besedilo;
    }
}
