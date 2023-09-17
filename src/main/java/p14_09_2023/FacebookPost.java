package p14_09_2023;

import java.util.ArrayList;

public class FacebookPost {

    private String imeIPrezimeKorisnikaKojiStavljaObjavu;
    private String tekstObjave;

    ArrayList<Reakcija>nizReakcija;

    public FacebookPost() {
        nizReakcija = new ArrayList<>();
    }

    public void reaguj (Reakcija dodajReakciju) {
        nizReakcija.add(dodajReakciju);
    }


    public String getImeIPrezimeKorisnikaKojiStavljaObjavu() {
        return imeIPrezimeKorisnikaKojiStavljaObjavu;
    }

    public String getTekstObjave() {
        return tekstObjave;
    }

    public void setImeIPrezimeKorisnikaKojiStavljaObjavu(String imeIPrezimeKorisnikaKojiStavljaObjavu) {
        this.imeIPrezimeKorisnikaKojiStavljaObjavu = imeIPrezimeKorisnikaKojiStavljaObjavu;
    }

    public void setTekstObjave(String tekstObjave) {
        this.tekstObjave = tekstObjave;
    }

    private void brojanjeReakcija (String imeReakcije) {
        int brojac = 0;
        for (int i = 0; i < nizReakcija.size(); i++) {
            if(nizReakcija.get(i).getTipReakcije().equals(imeReakcije)) {
                brojac = brojac + 1;
            }
        }


    }

    public void stampanje () {
        for (int i = 0; i < nizReakcija.size(); i++) {
            System.out.println("Ime korisnika koji lajkuje: " + nizReakcija.get(i).getImeIPrezimeKorisnikaKojiReaguje());
            System.out.println("Tekst objave: " + this.tekstObjave);
            System.out.println("Reakcija: " + nizReakcija.get(i).getTipReakcije());
        }
    }
}
