package p19_09_2023;

public abstract class Atleticar {

    protected String imeIprezime;
    protected double ostvareniRezultat;

    public Atleticar(String imeIprezime, double ostvareniRezultat) {
        this.imeIprezime = imeIprezime;
        this.ostvareniRezultat = ostvareniRezultat;
    }

    public String getImeIprezime() {
        return imeIprezime;
    }

    public double getOstvareniRezultat() {
        return ostvareniRezultat;
    }

    public void setImeIprezime(String imeIprezime) {
        this.imeIprezime = imeIprezime;
    }

    public void setOstvareniRezultat(double ostvareniRezultat) {
        this.ostvareniRezultat = ostvareniRezultat;
    }

    public abstract boolean kojiJeBolji (Atleticar atleticar);
    public void stampanje() {
        System.out.println("Ime i prezime: " + this.imeIprezime);
        System.out.println("Ostvareni rezultat: " + this.ostvareniRezultat);
    }
}
