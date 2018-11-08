package ba.unsa.etf.cetvrti;

public class Semestar {
    private String nazivSemestra = "";
    private Predmet[] predmeti = null;
    static int br=10;

    public Semestar(String naziv, Predmet[] obavezni) {

        this.nazivSemestra=naziv;
        predmeti=new Predmet[12];
        for(int i=0; i<10; i++) {
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

        predmeti[br].setNazivPredmeta(izborni.getNazivPredmeta());
        predmeti[br].setBrojStudenata(izborni.getBrojStudenata());
        predmeti[br].setECTSBodovi(izborni.getECTSBodovi());
        br++;
    }

    public String ispisi(){
        return null;
    }
    
}
