package p14_09_2023;

import java.util.ArrayList;

public class Reakcija {


    private String imeIPrezimeKorisnikaKojiReaguje;
    private String tipReakcije;


    public Reakcija(String imeIPrezimeKorisnikaKojiReaguje, String tipReakcije) {
        this.imeIPrezimeKorisnikaKojiReaguje = imeIPrezimeKorisnikaKojiReaguje;
        this.tipReakcije = tipReakcije;
    }

    public String getImeIPrezimeKorisnikaKojiReaguje() {
        return imeIPrezimeKorisnikaKojiReaguje;
    }

    public String getTipReakcije() {
        return tipReakcije;
    }


}
