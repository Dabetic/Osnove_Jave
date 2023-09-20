package p19_09_2023;

public class Kuca extends Objekat{

    private int brojClanovaKuce;

    public Kuca(String adressa, double povrsina, int zona, int brojClanovaKuce) {
        super(adressa, povrsina, zona);
        this.brojClanovaKuce = brojClanovaKuce;
    }

    public int getBrojClanovaKuce() {
        return brojClanovaKuce;
    }

    public void setBrojClanovaKuce(int brojClanovaKuce) {
        this.brojClanovaKuce = brojClanovaKuce;
    }

    @Override
    public double racunanjePoreza() {
        return racunanjeKoeficijenta() * povrsina;
    }

    @Override
    public void stampanje() {

        System.out.println("Broj clanova: " + this.brojClanovaKuce);
        System.out.println("Adresa:" + this.adressa);
        System.out.println("Povrsina: " + this.povrsina);
        System.out.println("Zona:" + zona);
        System.out.println("Porez: " + this.racunanjePoreza());


    }
}
