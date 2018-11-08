package ba.unsa.etf.cetvrti;

public class Semestar {
    private String nazivSemestra = "";
    private Predmet[] predmeti = null;

    public Semestar(String naziv, Predmet[] obavezni){}

    public String ispisi(){
        return null;
    }


    public String getNazivSemestra() {
        return nazivSemestra;
    }

    public void setNazivSemestra(String nazivSemestra) {
        this.nazivSemestra = nazivSemestra;
    }
    public void dodajIzborni(Predmet izborni){
        return;
    }

    
}
