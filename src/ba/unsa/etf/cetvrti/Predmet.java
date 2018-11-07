package ba.unsa.etf.cetvrti;

public class Predmet {
    private String nazivPredmeta="";
    private int brojStudenata=0;
    private final int maxBroj;
    private int ECTSBodovi;
    private Student[] upisanistudenti=null;

    public Predmet(String naziv,int broj,int kapacitet)
    {
        this.nazivPredmeta=naziv;
        this.ECTSBodovi=broj;
        this.maxBroj=kapacitet;
        this.brojStudenata=0;
        upisanistudenti=new Student[100];
    }

    public String getNazivPredmeta() {
        return nazivPredmeta;
    }

    public void setNazivPredmeta(String nazivPredmeta) {
        this.nazivPredmeta = nazivPredmeta;
    }

    public int getBrojStudenata() {
        return brojStudenata;
    }

    public void setBrojStudenata(int brojStudenata) {
        this.brojStudenata = brojStudenata;
    }

    public int getECTSBodovi() {
        return ECTSBodovi;
    }

    public void setECTSBodovi(int ECTSBodovi) {
        this.ECTSBodovi = ECTSBodovi;
    }
    public void upisiStudenta(Student s)
    {
        return;
    }
    public String ispisi(){
        return null;
    }
}