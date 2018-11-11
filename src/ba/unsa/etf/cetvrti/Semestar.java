package ba.unsa.etf.cetvrti;

import java.util.ArrayList;

public class Semestar {

    private int brojSemestra;
    ArrayList<Predmet> obavezniPredmeti = new ArrayList<>();
    ArrayList<Predmet> izborniPredmeti = new ArrayList<>();

    public Semestar(int brojSemestra) {
        this.setBrojSemestra(brojSemestra);
    }

    public void setBrojSemestra(int brojSemestra) {
        this.brojSemestra = brojSemestra;
    }

    public void dodajObavezniPredmet(Predmet predmet){
        obavezniPredmeti.add(predmet);
    }

    public void dodajIzborniPredmet(Predmet predmet){
        izborniPredmeti.add(predmet);
    }

    public ArrayList<Predmet> dajSveObaveznePredmete(){
        return obavezniPredmeti;
    }

    public ArrayList<Predmet> dajSveIzbornePredmete(){
        return izborniPredmeti;
    }
}
