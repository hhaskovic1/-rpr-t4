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
        return null;
    }

    public void setImePrezime(String imePrezime) {
        return; //this.imePrezime = imePrezime;
    }

    public int getBrIndex() {
        return 0;//return brIndex;
    }

    public void setBrIndex(int brIndex) {
        return;//this.brIndex = brIndex;
    }
}