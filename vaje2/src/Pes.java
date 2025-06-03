public class Pes {
    private String ime;
    private String pasma;

    //konstruktor

    public  Pes(){
    this.ime ="N/A";
    this.pasma="N/A";
    }
    public  Pes(String ime, String pasma){
        this.ime =ime;
        this.pasma=pasma;
    }

    //getter in setter za ime
    public String getIme(){
        return this.ime;
    }

    public void setIme(String newIme){
        this.ime = newIme;
    }

    //getter in setter za pasmo
    public String GetPasma(){
        return this.pasma;
    }

    public void setPasma(String newPasma){
        this.pasma = newPasma;
    }

    public static void main(String[] args){
        Pes mojPes = new Pes("Rex", "Doberman");
        Pes tvojPes = new Pes();
    }
}
