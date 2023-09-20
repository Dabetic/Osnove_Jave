package p19_09_2023;

public class Trkac extends Atleticar {

    public Trkac(String imeIprezime, double ostvareniRezultat) {
        super(imeIprezime, ostvareniRezultat);
    }

    @Override
    public boolean kojiJeBolji(Atleticar atleticar) {
        return atleticar.ostvareniRezultat < this.ostvareniRezultat;
    }
}
