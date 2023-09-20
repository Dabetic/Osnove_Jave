package d18_09_2023;

public class TimeControl extends Control{

    private boolean regulacijaVidea;

    public TimeControl(boolean regulacijaVidea) {
        this.regulacijaVidea = regulacijaVidea;
    }

    @Override
    public void izvrsiAkciju(VideoPlayer unos) {
    if(regulacijaVidea){
        unos.setTrenutnoVremeVidea(unos.getTrenutnoVremeVidea() + 15);
    } else {
        unos.setTrenutnoVremeVidea(unos.getTrenutnoVremeVidea() - 15);
    }
    }
}
