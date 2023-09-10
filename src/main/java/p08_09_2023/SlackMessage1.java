package p08_09_2023;

public class SlackMessage1 {

    String tekstProuke;

    String imePosiljalaca;
    String prezimePosiljalaca;

    String vremeSlanjaPoruke;
    String datumSlanjaPoruke;

//    String noviTekstPoruke;
//
//    String datumKadaJePorukaAzurirana;

    public void stampanje () {

        System.out.println("Ime posaljilaca; " + this.imePosiljalaca);
        System.out.println("Prezime posaljilaca; " + this.prezimePosiljalaca);
        System.out.println("Datum slanja poruke; "+ this.datumSlanjaPoruke);
        System.out.println("Vreme slanja poruke" + this.vremeSlanjaPoruke);
        System.out.println("Tekst poruke; " + this.tekstProuke);


    }

    public void azuriranjePoruka (String kadaJePorukaAzurirana, String datumKadaJePorukaAzurirana) {

        this.tekstProuke = kadaJePorukaAzurirana;
       this.datumSlanjaPoruke = datumKadaJePorukaAzurirana;

    }

}
