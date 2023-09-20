package d18_09_2023;

public class AudioControl extends Control{

    private boolean regulacijaZvuka;

    public AudioControl(boolean regulacijaZvuka) {
        this.regulacijaZvuka = regulacijaZvuka;
    }

    public boolean isRegulacijaZvuka() {
        return regulacijaZvuka;
    }

    public void setRegulacijaZvuka(boolean regulacijaZvuka) {
        this.regulacijaZvuka = regulacijaZvuka;
    }

    @Override
    public void izvrsiAkciju(VideoPlayer unos) {

        if(regulacijaZvuka) {
            unos.setJacinaZvuka(unos.getJacinaZvuka() + 1);
        } if(!regulacijaZvuka) {
            unos.setJacinaZvuka(unos.getJacinaZvuka() - 1);
        } if(unos.getJacinaZvuka() > 100) {
            unos.setJacinaZvuka(100);
        } if(unos.getJacinaZvuka() < 0) {
            unos.setJacinaZvuka(0);
        }
    }
}
