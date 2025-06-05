public class Service {

    private String description;
    private int cost;

    public Service(){}
    public Service(String description, int cost){
        this.description = description;
        this.cost = cost;
    }

    //getter
    public String getDescription(){
        return this.description;
    }
    public int getCost(){
        return this.cost;
    }

    //setter
    public void setDescription(String newDescription){
        this.description = newDescription;
    }
    public void setCost(int newCost){
        this.cost = newCost;
    }

    //metode


    public String toString(){
             return "Description of service: " + description + " Cost of service: " + cost;
    }
}
