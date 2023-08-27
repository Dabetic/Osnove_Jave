package d25_08_2023;

//5.	Zadatak
//        Napisati funkciju koja vrsi konverziju eura u dinare, rublje ili dolare prema dole navedenoj konverziji. Metoda od parametara prima vrednost u eurima kao i valutu u kojoj je potrebno izvrsiti konverziju (RSD/USD/RUB) a vraca konvertovanu vrednost. U glavnom programu pozvati funkciju za neki od primera.
//        Primer poziva funkcija:
//        Ako se za vrednost u eurima unese 3 i valuta RSD vraca vrednost 351.6339
//        Ako se za vrednost u eurima unese 4.5 i valuta USD vraca vrednost 5.31945
//        Primer izvrsenja main programa:
//        Unesite vrednost u eurima: 3
//        Unesite valutu za konverziju: RSD
//        3 EUR je 351.6339 RSD
//        Konverzija eura u druge valute:
//        1 EUR = 117.5 RSD
//        1 EUR = 1.1 USD
//        1 EUR = 62.98 RUB


public class Zadatak5 {
    public static void main(String[] args) {

        konverzija(5,"RSD");

    }


    static public void konverzija (double x, String y) {

        if(y.equals("RSD")) {

            System.out.println("Vrednost u dinarima je: "+ (x * 117.5));

        } else if (y.equals("USD")) {

            System.out.println("Vrednsot u dolarima je: "+ (x*1.1));

        } else if (y.equals("RUB")) {

            System.out.println("Vrednost u rubljama je: " + (x*62.98));
        }
    }

}
