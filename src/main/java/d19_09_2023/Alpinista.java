package d19_09_2023;

public class Alpinista extends Planinar {


    private int kolikoJePoenaAlpOstvario;

    public Alpinista(int idInt, String imeIPrezime, int kolikoJePoenaAlpOstvario) {
        super(idInt, imeIPrezime);
        this.kolikoJePoenaAlpOstvario = kolikoJePoenaAlpOstvario;
    }

    public int getKolikoJePoenaAlpOstvario() {
        return kolikoJePoenaAlpOstvario;
    }

    public void setKolikoJePoenaAlpOstvario(int kolikoJePoenaAlpOstvario) {
        this.kolikoJePoenaAlpOstvario = kolikoJePoenaAlpOstvario;
    }

    @Override
    public double clanarinaPlaninara() {

        return 1500 - (kolikoJePoenaAlpOstvario * 50);
    }

    @Override
    public boolean daLiJeUspesanUspon(Planina unesiPlaninu) {
        return unesiPlaninu.getVisina() < 4000;
    }

    @Override
    public void stampanje() {
        System.out.println("ID Alpiniste: " + this.idInt);
        System.out.println("Ime i prezime: " + this.imeIPrezime);
        System.out.println("Broj poena: " + this.kolikoJePoenaAlpOstvario);
    }
}
