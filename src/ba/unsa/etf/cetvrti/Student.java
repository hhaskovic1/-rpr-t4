package ba.unsa.etf.cetvrti;

public class Student {
    private String imePrezime="";
    private int brIndex=0;

    public Student(String string,int indeks){
        setImePrezime(string);
        setBrIndex(indeks);
    }

    public String Ispisi()
    {
        return null;
    }


    public String getImePrezime() {
        return imePrezime;
    }

    public void setImePrezime(String imePrezime) {
        this.imePrezime = imePrezime;
    }

    public int getBrIndex() {
        return brIndex;
    }

    public void setBrIndex(int brIndex) {
        this.brIndex = brIndex;
    }
}