package d19_09_2023;

public class Planina {

    private String imePlanine;
    private String nazivDrzaveUKojojSeNalazi;
    private int visina;


    public Planina(String imePlanine, String nazivDrzaveUKojojSeNalazi, int visina) {
        this.imePlanine = imePlanine;
        this.nazivDrzaveUKojojSeNalazi = nazivDrzaveUKojojSeNalazi;
        this.visina = visina;
    }

    public String getImePlanine() {
        return imePlanine;
    }

    public String getNazivDrzaveUKojojSeNalazi() {
        return nazivDrzaveUKojojSeNalazi;
    }

    public int getVisina() {
        return visina;
    }

    public void setVisina(int visina) {
        this.visina = visina;
    }

    public void setImePlanine(String imePlanine) {
        this.imePlanine = imePlanine;
    }

    public void setNazivDrzaveUKojojSeNalazi(String nazivDrzaveUKojojSeNalazi) {
        this.nazivDrzaveUKojojSeNalazi = nazivDrzaveUKojojSeNalazi;
    }
}
