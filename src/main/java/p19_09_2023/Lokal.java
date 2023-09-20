package p19_09_2023;

public class Lokal extends Objekat{


    public Lokal(String adressa, double povrsina, int zona) {
        super(adressa, povrsina, zona);
    }

    @Override
    public double racunanjePoreza() {
        return this.povrsina * this.racunanjeKoeficijenta() * 1.3;
    }

    @Override
    public void stampanje() {
        System.out.println("Adresa: " + this.adressa);
        System.out.println("Povrsina: " + this.povrsina );
        System.out.println("Zona: " + this.zona);
    }
}
