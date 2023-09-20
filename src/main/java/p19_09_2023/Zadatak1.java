package p19_09_2023;

public class Zadatak1 {
    public static void main(String[] args) {
        PoreskaUprava pu1 = new PoreskaUprava("Nis");
        Objekat k1 = new Kuca("Kuca u Nisu broj br 10",50.0,1,4);
        Objekat k2 = new Kuca("Kuca u Prokuplju br 15",40.0,2,2);
        Objekat k3 = new Kuca("Kuca u Aleksincu br 25",33.0,3,1);
        Objekat z1 = new Zgrada("Zgrada u Nisu br 30",1000.0,3,5);
        Objekat l1 = new Lokal("Lokal u Beogradu br 40",100.0,1);


        pu1.dodajObjekat(k1);
        pu1.dodajObjekat(k2);
        pu1.dodajObjekat(k3);
        pu1.dodajObjekat(z1);
        pu1.dodajObjekat(l1);


        double ukupanPorez = pu1.racuanjeUkupnogPoreza();

        System.out.println("Ukupan porez: " + ukupanPorez);

        System.out.println("*****************");

        pu1.stampanjeSvihObjekata();

        System.out.println("Makismalni porez: " + pu1.maxPorez());
        System.out.println("Minimalni porez: " + pu1.minPorez());



    }
}
