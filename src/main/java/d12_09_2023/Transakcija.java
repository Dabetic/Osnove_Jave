package d12_09_2023;

//Kreirati klasu Transakcija koja ima:
//●	id transakcije
//●	racun sa kog se prenose sredstva
//●	racun na koji se prenose sredstva
//●	gettere i settere
//●	konstruktore

public class Transakcija {

    private String idTransakcije;
    private Racun racunSaKogaSePrenosiIznos;
    private Racun racunNaKojiSePrimaIznos;

    public Transakcija(String idTransakcije, Racun racunSaKogaSePrenosiIznos, Racun racunNaKojiSePrimaIznos) {
        this.idTransakcije = idTransakcije;
        this.racunSaKogaSePrenosiIznos = racunSaKogaSePrenosiIznos;
        this.racunNaKojiSePrimaIznos = racunNaKojiSePrimaIznos;
    }

    public Racun getRacunSaKogaSePrenosiIznos() {
        return this.racunSaKogaSePrenosiIznos;
    }

    public void setRacunSaKogaSePrenosiIznos(Racun racunSaKogaSePrenosiIznos) {
        this.racunSaKogaSePrenosiIznos = racunSaKogaSePrenosiIznos;
    }

    public Racun getRacunNaKojiSePrimaIznos() {
        return this.racunNaKojiSePrimaIznos;
    }

    public void setRacunNaKojiSePrimaIznos(Racun racunNaKojiSePrimaIznos) {
        this.racunNaKojiSePrimaIznos = racunNaKojiSePrimaIznos;
    }
    public double racunanjeProvizije (double iznos) {
        if(iznos<4500) {
            return 45;
        } else {
            return  iznos / 100;
        }
    }

    public void izvrsiTransakciju (double iznos) {
        this.racunSaKogaSePrenosiIznos.skiniSaRacuna(iznos + racunanjeProvizije(iznos));
        this.racunNaKojiSePrimaIznos.uplatiNaRacun(iznos);
    }


}


