public class Semafor {

    private String barva;
    private int trajanje;

    public Semafor(){}
    public Semafor(String barva, int trajanje){
        this.barva = barva;
        this.trajanje = trajanje;
    }

    public String getBarva() {
        return barva;
    }

    public void setBarva(String barva) {
        this.barva = barva;
    }

    public int getTrajanje() {
        return trajanje;
    }

    public void setTrajanje(int trajanje) {
        this.trajanje = trajanje;
    }

    //metoda za spreminjanje barve
public void changeColor(){
       if(this.barva.equals("green")){
           this.barva ="red";
       } else this.barva="green";
}

    //je semafor rdeč ali zelen
    public boolean isGreen(){
        return this.barva.equals("green");
    }
    public boolean isRed(){
        return this.barva.equals("red");
    }

    public static void main(String[] args){
        Semafor s = new Semafor();
        s.setBarva("red");
        s.setTrajanje(45);
        s.changeColor();

        System.out.println("barva: " + s.barva + " trajanje: " + s.trajanje);
    }
}
