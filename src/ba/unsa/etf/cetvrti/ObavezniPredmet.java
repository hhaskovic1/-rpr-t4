package ba.unsa.etf.cetvrti;

public class ObavezniPredmet {

    private String nazivPredmeta="";
    private int brojStudenata=0;
    private final int maxBroj;
    private int ECTSBodovi;
    private Student[] upisanistudenti=null;

    public ObavezniPredmet(String naziv,int broj,int kapacitet)
    {
        this.nazivPredmeta=naziv;
        this.ECTSBodovi=broj;
        this.maxBroj=kapacitet;
        this.brojStudenata=0;
        upisanistudenti=new Student[100];
    }
}
