package d18_09_2023;

public class VideoPlayer {

    private double duzinaVidea;
    private double trenutnoVremeVidea;
    private int jacinaZvuka;
    private int kvalitetVidea;

    public VideoPlayer(double duzinaVidea, double trenutnoVremeVidea, int jacinaZvuka, int kvalitetVidea) {
        this.duzinaVidea = duzinaVidea;
        this.trenutnoVremeVidea = trenutnoVremeVidea;
        this.jacinaZvuka = jacinaZvuka;
        this.kvalitetVidea = kvalitetVidea;
    }

    public void setDuzinaVidea(double duzinaVidea) {
        this.duzinaVidea = duzinaVidea;
    }

    public void setTrenutnoVremeVidea(double trenutnoVremeVidea) {
        this.trenutnoVremeVidea = trenutnoVremeVidea;
    }

    public void setJacinaZvuka(int jacinaZvuka) {
        this.jacinaZvuka = jacinaZvuka;
    }

    public void setKvalitetVidea(int kvalitetVidea) {
        this.kvalitetVidea = kvalitetVidea;
    }

    public double getDuzinaVidea() {
        return duzinaVidea;
    }

    public double getTrenutnoVremeVidea() {
        return trenutnoVremeVidea;
    }

    public int getJacinaZvuka() {
        return jacinaZvuka;
    }

    public int getKvalitetVidea() {
        return kvalitetVidea;
    }

    public void stampanje () {
        System.out.println("Trenutno vreme videa: " + this.trenutnoVremeVidea + " min");
        System.out.println("Jacina zvuka: " + jacinaZvuka);
        System.out.println("Kvalitet videa: " + kvalitetVidea);
    }
}
