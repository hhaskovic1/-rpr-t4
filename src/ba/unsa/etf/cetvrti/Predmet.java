package ba.unsa.etf.cetvrti;

import java.util.Iterator;

public class Predmet {
    private String nazivPredmeta="";
    public static int brojStudenata=0;
    private final int maxBroj;
    private int ECTSBodovi;
    private Student[] upisanistudenti=null;

    public static int index=0;

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
        /*Iterator<Student> it;while(it.hasNext()) {}*/

        upisanistudenti[index].setImePrezime(s.getImePrezime());
        upisanistudenti[index].setBrIndex(s.getBrIndex());
        index++;
        brojStudenata++;

    }


    public void ispisi() {

        for(int i=0; i<maxBroj; i++) System.out.println(upisanistudenti[i].getImePrezime()+upisanistudenti[i].getBrIndex()+this.getNazivPredmeta());
    }
}