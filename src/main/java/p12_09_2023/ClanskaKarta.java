package p12_09_2023;

//popust (u rasponu od 5 do 10 %)
//broj kartice (npr: 9329-0239)
//gettere i setter
//konstuktore
public class ClanskaKarta {

    private int popust;

    private String brojKartice;

    public ClanskaKarta () {

    }

    public ClanskaKarta (int popust, String brojKartice) {
        this.popust = popust;
        this.brojKartice = brojKartice;
    }

    public int getPopust () {
        return this.popust = popust;
    }

    public void setPopust (int popust) {
        this.popust = popust;
    }

    public String getBrojKartice (String brojKartice) {
        return this.brojKartice = brojKartice;
    }

    public void setBrojKartice () {
        this.brojKartice = brojKartice;
    }


}
