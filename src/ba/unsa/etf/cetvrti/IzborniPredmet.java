package ba.unsa.etf.cetvrti;

public class IzborniPredmet {

    private String nazivPredmeta="";
    private int brojStudenata=0;
    private final int maxBroj;
    private int ECTSBodovi;
    private Student[] upisanistudenti=null;

    public IzborniPredmet(String naziv,int broj,int kapacitet)
    {
        this.nazivPredmeta=naziv;
        this.ECTSBodovi=broj;
        this.maxBroj=kapacitet;
        this.brojStudenata=0;
        upisanistudenti=new Student[100];
    }

}
