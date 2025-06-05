import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        Owner firstOwner= new Owner("Anže");

        Service service1 = new Service("Kopanje", 19);
        Service service2 = new Service("striženje krempljev", 20);
        Service service3 = new Service("objemanje", 21);
        Service service4 = new Service("igranje", 22);
        Service service5 = new Service("striženje krempljev", 23);

        Pet pet1= new Pet("Mucica", "mačka", 13  );
        Pet pet2= new Pet("Kužica", "mešanec / pes", 10  );
        pet1.reciveService(service1);
        pet1.reciveService(service2);
        pet1.reciveService(service3);

        firstOwner.requestService(pet1, service4);
        firstOwner.addPet(pet2);
        firstOwner.requestService(pet2, service5);
        System.out.println(firstOwner.toString());
    }
}