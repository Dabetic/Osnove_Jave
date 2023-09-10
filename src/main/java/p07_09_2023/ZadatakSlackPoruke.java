package p07_09_2023;

public class ZadatakSlackPoruke {
    public static void main(String[] args) {

        SlackMessage porukaJedan = new SlackMessage();

        porukaJedan.imePosiljalaca = "Miki";
        porukaJedan.prezimePosiljalaca = "Mikic";
        porukaJedan.tekstProuke = "Kako si?";
        porukaJedan.datumSlanjaPoruke = "8 9 2023";
        porukaJedan.vremeSlanjaPoruke = "18:00";


        SlackMessage drugaPoruka = new SlackMessage();

        drugaPoruka.imePosiljalaca = "Aki";
        drugaPoruka.prezimePosiljalaca = "Akic";
        drugaPoruka.tekstProuke = "Evo nije lose.";
        drugaPoruka.datumSlanjaPoruke = "8 9 2023";
        drugaPoruka.vremeSlanjaPoruke = "18:05";


        System.out.println("Ime posiljalaca: " + porukaJedan.imePosiljalaca);
        System.out.println("Tekst poruke: " + porukaJedan.tekstProuke);

        System.out.println("Ime posiljalaca: " + drugaPoruka.imePosiljalaca);
        System.out.println("Tekst poruke: " + drugaPoruka.tekstProuke);



    }
}
