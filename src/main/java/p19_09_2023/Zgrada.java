package p19_09_2023;

public class Zgrada extends Objekat{

    private int brojStanova;

    public Zgrada(String adressa, double povrsina, int zona, int brojStanova) {
        super(adressa, povrsina, zona);
        this.brojStanova = brojStanova;
    }

    public int getBrojStanova() {
        return brojStanova;
    }

    public void setBrojStanova(int brojStanova) {
        this.brojStanova = brojStanova;
    }

    @Override
    public double racunanjePoreza() {
        return racunanjeKoeficijenta() *this.povrsina * this.brojStanova;
    }

    @Override
    public void stampanje() {

        System.out.println("Adresa: " + this.adressa);
        System.out.println("Broj stanova u zgradi: " + this.brojStanova);
        System.out.println("Povrsina: " + this.povrsina);
        System.out.println("Zona: " + this.zona);
        System.out.println("Porez: " + this.racunanjePoreza());

    }
}
