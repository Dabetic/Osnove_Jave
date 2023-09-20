package d18_09_2023;

public class Zadatak1 {
    public static void main(String[] args) {

        VideoPlayer vp1 = new VideoPlayer(50,15,5,144);
        TimeControl tc = new TimeControl(true);
        Control qc = new QualityOptimizerControl(20.0);
        AudioControl ac = new AudioControl(false);

        tc.izvrsiAkciju(vp1);
        qc.izvrsiAkciju(vp1);
        ac.izvrsiAkciju(vp1);
        ac.izvrsiAkciju(vp1);

        vp1.stampanje();

    }
}
