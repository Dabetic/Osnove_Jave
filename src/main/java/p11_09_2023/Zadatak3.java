package p11_09_2023;

public class Zadatak3 {
    public static void main(String[] args) {

        Film filmDefoltni = new Film();

        filmDefoltni.setNazivFilma("Vrisak");
        filmDefoltni.setGodinaIzdanja(1998);

//        filmDefoltni.stampanje();
        Reziser reziser1 = new Reziser();


        reziser1.setImeIPrezime("Wes Carven");
        reziser1.setStarost(56);

        Film filmNovi = new Film("Vrisak" , 55, reziser1);

        filmNovi.stampanje();
//        filmNovi.getReziser().stampanjeRez(); Drugi nacin


        System.out.println();
        System.out.println("******************");

//        Reziser reziser1 = new Reziser();

//        reziser1.setImeIPrezime("Wes Carven");
//        reziser1.setStarost(56);

//        reziser1.stampanjeRez();

        System.out.println("***************");

        Reziser reziser2 = new Reziser("Wes Carven", 56);

//        reziser2.stampanjeRez();


    }
}
