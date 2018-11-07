package ba.unsa.etf.cetvrti;

public class Semestri {
    private String nazivSemestra = "";
    private Predmet[] predmeti = null;

    public Semestri(String naziv,ObavezniPredmet[] obavezni){}

    public String ispisi(){
        return null;
    }


    public String getNazivSemestra() {
        return nazivSemestra;
    }

    public void setNazivSemestra(String nazivSemestra) {
        this.nazivSemestra = nazivSemestra;
    }
    public void dodajIzborni(IzborniPredmet izborni){
        return;
    }
}
