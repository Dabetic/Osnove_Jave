package d19_09_2023;

public abstract class Planinar {
    protected int idInt;
    protected String imeIPrezime;

    public Planinar(int idInt, String imeIPrezime) {
        this.idInt = idInt;
        this.imeIPrezime = imeIPrezime;
    }

    public int getidInt() {
        return idInt;
    }

    public String getImeIPrezime() {
        return imeIPrezime;
    }

    public abstract double clanarinaPlaninara ();

    public abstract boolean daLiJeUspesanUspon (Planina unesiPlaninu);

    public abstract void stampanje();



}
