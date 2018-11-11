package ba.unsa.etf.cetvrti;

import java.util.ArrayList;

public class Student {
    String ime="";
    String prezime="";
    int brojIndeksa;
    int kreditiECTS;
    ArrayList<Predmet> predmeti = new ArrayList<Predmet>();

    public Student(String ime, String prezime, int brojIndeksa){
        this.ime = ime;
        this.prezime = prezime;
        this.brojIndeksa = brojIndeksa;
    }

    public void setIme(String ime){
        this.ime=ime;
    }

    public void setPrezime(String prezime){
        this.prezime=prezime;
    }

    public void setBrojIndeksa(int brojIndeksa){
        this.brojIndeksa=brojIndeksa;
    }

    public void setKreditiECTS(int kreditiECTS){
        this.kreditiECTS=kreditiECTS;
    }

    public String getIme(){
        return this.ime;
    }

    public String getPrezime(){
        return this.prezime;
    }

    public int getBrojIndeksa(){
        return this.brojIndeksa;
    }

    public int getKreditiECTS(){
        return this.kreditiECTS;
    }

    public void setECTSKredite(int kreditiECTS){
        this.kreditiECTS = kreditiECTS;
    }

    public String ispisi(){
        String s;
        s = ime + " " + prezime + "(" + brojIndeksa + ")";
        return  s;
    }

    public void ispisiPredmete(){
        predmeti.clear();
        setECTSKredite(0);
    }
}