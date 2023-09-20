package p18_09_2023;

//stranice a i b
//gettere/settere/konstruktore
//implementira metodu povrsina
//implementira metodu obim

public class Pravougaonik extends Figura {

    private double stranicaA;
    private double stranicaB;

    public Pravougaonik(double stranicaA, double stranicaB) {
        this.stranicaA = stranicaA;
        this.stranicaB = stranicaB;
    }

    public double getStranicaA() {
        return stranicaA;
    }

    public double getStranicaB() {
        return stranicaB;
    }

    @Override
    protected double povrsina() {
        return (stranicaA * stranicaB) * 1.73205 / 4;    }

    @Override
    protected double obim() {
        return (2 * stranicaA) + stranicaB;
    }
}
