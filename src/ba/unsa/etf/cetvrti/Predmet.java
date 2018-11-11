package ba.unsa.etf.cetvrti;

import java.util.ArrayList;

public class Predmet {
    private String imePredmeta;
    private int kreditiECTS;
    ArrayList<Student> studenti = new ArrayList<>();
    public boolean izborni;
    private int brojStudenata;
     int kapacitet;

    public Predmet(String imePredmeta, int kreditiECTS, boolean izborni){
        this.setImePredmeta(imePredmeta);
        this.setKreditiECTS(kreditiECTS);
        this.izborni = izborni;
    }

    public void upisiStudenta(Student student){
        if(brojStudenata < kapacitet) {
            studenti.add(student);
            student.setECTSKredite(student.getKreditiECTS() + kreditiECTS);
            brojStudenata++;
        }
    }

    public void ispisiStudenta(Student student){
        studenti.remove(student);
        student.setECTSKredite(student.getKreditiECTS() - kreditiECTS);
    }

    public boolean jeLiPun(){
        return (brojStudenata == kapacitet);
    }

    public void setImePredmeta(String imePredmeta){
        this.imePredmeta=imePredmeta;
    }

    public void setKreditiECTS(int kreditiECTS){
        this.kreditiECTS=kreditiECTS;
    }

    public String getImePredmeta(){
        return this.imePredmeta;
    }

    public int getKreditiECTS(){
        return this.kreditiECTS;
    }

    public boolean jaLiIzborni(){
        return this.izborni;
    }

    public void ispisiStudente(){
        studenti.clear();
    }
}