package d18_09_2023;

public class QualityOptimizerControl extends Control {

    private double brzinaInternetaUMb;

    public QualityOptimizerControl(double brzinaInternetaUMb) {
        this.brzinaInternetaUMb = brzinaInternetaUMb * 10.1;
    }

    public double getBrzinaInternetaUMb() {
        return brzinaInternetaUMb;
    }

    public void setBrzinaInternetaUMb(double brzinaInternetaUMb) {
        this.brzinaInternetaUMb = brzinaInternetaUMb * 10.1;
    }

    @Override
    public void izvrsiAkciju(VideoPlayer unos) {
        if (brzinaInternetaUMb <= 144 && brzinaInternetaUMb >= 0) {
            unos.setKvalitetVidea(144);
        }
        if (brzinaInternetaUMb >= 145 && brzinaInternetaUMb <= 240) {
            unos.setKvalitetVidea(240);
        }
        if (brzinaInternetaUMb <= 241 && brzinaInternetaUMb >= 360) {
            unos.setKvalitetVidea(360);
        }
        if (brzinaInternetaUMb >= 360 && brzinaInternetaUMb <= 480) {
            unos.setKvalitetVidea(480);
        }
        if (brzinaInternetaUMb >= 480 && brzinaInternetaUMb <= 720) {
            unos.setKvalitetVidea(720);
        }
        if (brzinaInternetaUMb >= 720 && brzinaInternetaUMb <= 1080) {
            unos.setKvalitetVidea(1080);
        }
    }
}