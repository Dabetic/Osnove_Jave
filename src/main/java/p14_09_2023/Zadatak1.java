package p14_09_2023;

public class Zadatak1 {
    public static void main(String[] args) {
        Sastojak sastojak1 = new Sastojak("Origano", 20);
        Sastojak sastojak2 = new Sastojak("Cimet" , 15);
        Sastojak sastojak3 = new Sastojak("Mirodjija", 50);
        Pasta pasta1 = new Pasta();

        pasta1.dodavanjeSastojaka(sastojak1);
        pasta1.dodavanjeSastojaka(sastojak2);
        pasta1.dodavanjeSastojaka(sastojak3);

        pasta1.stampanje();

        System.out.println("Ukupna cena: " + pasta1.metodaRacunanjeCene());






    }
}
