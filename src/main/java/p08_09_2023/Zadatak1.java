package p08_09_2023;

public class Zadatak1 {
    public static void main(String[] args) {

        SlackMessage1 slakPoruka = new SlackMessage1();


        slakPoruka.imePosiljalaca = "Milos";
        slakPoruka.prezimePosiljalaca = "Dabetic";
        slakPoruka.datumSlanjaPoruke = "8. 9. 2023";
        slakPoruka.vremeSlanjaPoruke = " 18:50";
        slakPoruka.tekstProuke = "Cao, kako si?";

        slakPoruka.stampanje();

        SlackMessage1 drugaSlackPoruka = new SlackMessage1();

        drugaSlackPoruka.imePosiljalaca = "Dusan";
        drugaSlackPoruka.prezimePosiljalaca = "Vuckovic";
        drugaSlackPoruka.datumSlanjaPoruke = "8. 9. 2023";
        drugaSlackPoruka.vremeSlanjaPoruke = "18:55";
        drugaSlackPoruka.tekstProuke = "Evo dobro sam.";

        drugaSlackPoruka.stampanje();




        slakPoruka.azuriranjePoruka("2.3.2023", "ehej");
        slakPoruka.stampanje();


    }
}
