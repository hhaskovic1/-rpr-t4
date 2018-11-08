package ba.unsa.etf.cetvrti;

public class Semestar {
    private String nazivSemestra = "";
    private Predmet[] predmeti = null;

    public Semestar(String naziv, Predmet[] obavezni) {

        this.nazivSemestra=naziv;
        predmeti=new Predmet[12];
        for(int i=0; i<12; i++) {
            predmeti[i].setNazivPredmeta(obavezni[i].getNazivPredmeta());
            predmeti[i].setBrojStudenata(obavezni[i].getBrojStudenata());
            predmeti[i].setECTSBodovi(obavezni[i].getECTSBodovi());
        }

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

    public String ispisi(){
        return null;
    }
    
}
