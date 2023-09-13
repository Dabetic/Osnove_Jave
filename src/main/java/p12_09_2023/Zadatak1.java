package p12_09_2023;

public class Zadatak1 {
    public static void main(String[] args) {
        ClanskaKarta clanskaKarta1 = new ClanskaKarta(5,"7590");
        Kupac kupac1 = new Kupac("Milos Dabetic", clanskaKarta1);
        Proizvod proizvod1 = new Proizvod("TV", kupac1, 500);



    }
}
